package io.quarkuscoffeeshop.coffeeshop.domain;

import org.infinispan.protostream.annotations.ProtoEnumValue;

public enum OrderSource {

    @ProtoEnumValue(number = 1, name = "COUNTER")
    COUNTER, 
    
    @ProtoEnumValue(number = 2, name = "WEB")
    WEB;
}
