package io.quarkuscoffeeshop.coffeeshop.barista.domain;

import io.quarkus.infinispan.client.Remote;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;

@ApplicationScoped
public class BaristaRepository {

    @Inject
    @Remote("local")
    RemoteCache<String, BaristaItem> cache;

    public void persist(BaristaItem baristaItem) {
        cache.put(baristaItem.getItem(), baristaItem);
    }

}
