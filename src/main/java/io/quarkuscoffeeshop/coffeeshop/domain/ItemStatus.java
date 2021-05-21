package io.quarkuscoffeeshop.coffeeshop.domain;

import org.infinispan.protostream.annotations.ProtoEnumValue;
import org.infinispan.protostream.annotations.ProtoName;

@ProtoName("ItemStatus")
public enum ItemStatus {

    @ProtoEnumValue(number = 1, name = "ITEM_PLACED")
    PLACED,

    @ProtoEnumValue(number = 2, name = "ITEM_IN_PROGRESS")
    IN_PROGRESS,

    @ProtoEnumValue(number = 3, name = "ITEM_FULFILLED")
    FULFILLED
}