package io.quarkuscoffeeshop.coffeeshop.domain;

import org.infinispan.protostream.annotations.ProtoEnumValue;

public enum OrderStatus {

    @ProtoEnumValue(number = 1, name = "ORDER_PLACED")
    PLACED, 

    @ProtoEnumValue(number = 2, name = "ORDER_IN_PROGRESS")
    IN_PROGRESS, 

    @ProtoEnumValue(number = 3, name = "ORDER_FULFILLED")
    FULFILLED
}
