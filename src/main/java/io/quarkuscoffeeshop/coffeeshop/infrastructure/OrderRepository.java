package io.quarkuscoffeeshop.coffeeshop.infrastructure;

import io.quarkus.infinispan.client.Remote;
import io.quarkus.runtime.StartupEvent;
import io.quarkuscoffeeshop.coffeeshop.domain.Order;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.commons.configuration.XMLStringConfiguration;

@ApplicationScoped
public class OrderRepository {

    private static final String CACHE = "local";

    @Inject
    RemoteCacheManager remoteCacheManager;

    @Inject
    @Remote(CACHE)
    RemoteCache<String, Order> cache;

    private static final String CACHE_CONFIG = "<infinispan><cache-container>"
            + "<distributed-cache name=\"%s\"></distributed-cache>" + "</cache-container></infinispan>";

    void onStart(@Observes StartupEvent ev) {
        remoteCacheManager.administration().getOrCreateCache(CACHE,
                new XMLStringConfiguration(String.format(CACHE_CONFIG, CACHE)));
    }

    public Order findById(final String id) {
        return cache.get(id);
    }

    public void persist(Order order) {
        cache.put(order.getOrderId(), order);
    }

    public void persistAndFlush(Order order) {
        persist(order);
    }
}
