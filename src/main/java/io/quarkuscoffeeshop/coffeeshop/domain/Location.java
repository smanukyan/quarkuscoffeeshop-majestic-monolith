package io.quarkuscoffeeshop.coffeeshop.domain;

import org.infinispan.protostream.annotations.ProtoEnumValue;

public enum Location {
    @ProtoEnumValue(number = 1, name = "ATLANTA")
    ATLANTA, 
    @ProtoEnumValue(number = 2, name = "CHARLOTTE")
    CHARLOTTE, 
    @ProtoEnumValue(number = 3, name = "RALEIGH")
    RALEIGH;
}
