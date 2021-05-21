package io.quarkuscoffeeshop.coffeeshop.domain;

import java.math.BigDecimal;

import org.infinispan.protostream.annotations.ProtoEnumValue;
import org.infinispan.protostream.annotations.ProtoName;

@ProtoName("Item")
public enum Item {

    //Beverages
    @ProtoEnumValue(number = 1, name = "CAPPUCCINO")
    CAPPUCCINO(BigDecimal.valueOf(4.50)), 
    @ProtoEnumValue(number = 2, name = "COFFEE_BLACK")
    COFFEE_BLACK(BigDecimal.valueOf(3.00)), 
    @ProtoEnumValue(number = 3, name = "COFFEE_WITH_ROOM")
    COFFEE_WITH_ROOM(BigDecimal.valueOf(3.00)), 
    @ProtoEnumValue(number = 4, name = "ESPRESSO")    
    ESPRESSO(BigDecimal.valueOf(3.50)), 
    @ProtoEnumValue(number = 5, name = "ESPRESSO_DOUBLE")
    ESPRESSO_DOUBLE(BigDecimal.valueOf(4.50)), 
    @ProtoEnumValue(number = 6, name = "LATTE")
    LATTE(BigDecimal.valueOf(4.50)),

    //Food
    @ProtoEnumValue(number = 7, name = "CAKEPOP")
    CAKEPOP(BigDecimal.valueOf(2.50)), 
    @ProtoEnumValue(number = 8, name = "CROISSANT")
    CROISSANT(BigDecimal.valueOf(3.25)), 
    @ProtoEnumValue(number = 9, name = "MUFFIN")
    MUFFIN(BigDecimal.valueOf(3.00)), 
    @ProtoEnumValue(number = 10, name = "CROISSANT_CHOCOLATE")
    CROISSANT_CHOCOLATE(BigDecimal.valueOf(3.50));

    private BigDecimal price;

    public BigDecimal getPrice() {
        return this.price;
    }

    private Item(BigDecimal price) {
        this.price = price;
    }
}
