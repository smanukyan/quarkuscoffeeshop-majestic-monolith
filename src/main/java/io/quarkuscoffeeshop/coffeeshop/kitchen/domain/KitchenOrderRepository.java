package io.quarkuscoffeeshop.coffeeshop.kitchen.domain;

import io.quarkus.infinispan.client.Remote;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;

@ApplicationScoped
public class KitchenOrderRepository {

    @Inject
    @Remote("local")
    RemoteCache<String, KitchenOrder> cache;

    public void persist(KitchenOrder kitchenOrder) {
        cache.put("kitchen-order" + kitchenOrder.getOrderId(), kitchenOrder);
    }
}
