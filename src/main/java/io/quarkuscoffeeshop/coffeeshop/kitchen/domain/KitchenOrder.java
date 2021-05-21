package io.quarkuscoffeeshop.coffeeshop.kitchen.domain;

import io.quarkuscoffeeshop.coffeeshop.domain.Item;

import java.time.Instant;

import org.infinispan.protostream.annotations.ProtoField;

public class KitchenOrder {

    private String orderId;
  
    private Item item;
    
    private Instant timeIn;
    
    private Instant timeUp;

    public KitchenOrder() {
    }

    public KitchenOrder(String orderId, Item item, Instant timeIn) {
        this.orderId = orderId;
        this.item = item;
        this.timeIn = timeIn;
    }

    public KitchenOrder(String orderId, Item item, Instant timeIn, Instant timeUp) {
        this.orderId = orderId;
        this.item = item;
        this.timeIn = timeIn;
        this.timeUp = timeUp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KitchenOrder{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", item=").append(item);
        sb.append(", timeIn=").append(timeIn);
        sb.append(", timeUp=").append(timeUp);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KitchenOrder that = (KitchenOrder) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (item != that.item) return false;
        if (timeIn != null ? !timeIn.equals(that.timeIn) : that.timeIn != null) return false;
        return timeUp != null ? timeUp.equals(that.timeUp) : that.timeUp == null;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (timeIn != null ? timeIn.hashCode() : 0);
        result = 31 * result + (timeUp != null ? timeUp.hashCode() : 0);
        return result;
    }

    @ProtoField(number = 1)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @ProtoField(number = 2)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @ProtoField(number = 3)
    public Instant getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Instant timeIn) {
        this.timeIn = timeIn;
    }

    @ProtoField(number = 4)
    public Instant getTimeUp() {
        return timeUp;
    }

    public void setTimeUp(Instant timeUp) {
        this.timeUp = timeUp;
    }
}
