package io.quarkuscoffeeshop.coffeeshop.domain;

import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import io.quarkuscoffeeshop.coffeeshop.barista.domain.BaristaItem;
import io.quarkuscoffeeshop.coffeeshop.kitchen.domain.KitchenOrder;

@AutoProtoSchemaBuilder(includeClasses = { Item.class, ItemStatus.class, LineItem.class, Location.class, Order.class,
        OrderSource.class, OrderStatus.class, BaristaItem.class, KitchenOrder.class, BigDecimalAdapter.class }, schemaPackageName = "coffee_shop")

interface DomainContextInitializer extends SerializationContextInitializer {
}
