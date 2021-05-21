package io.quarkuscoffeeshop.coffeeshop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.infinispan.protostream.annotations.ProtoField;

import java.math.BigDecimal;
import java.util.UUID;

@JsonIgnoreProperties(value = { "orderId" })
public class LineItem {

    @JsonIgnore
    Order order;

    private String itemId;

    private Item item;

    private String name;

    private BigDecimal price;

    private ItemStatus itemStatus;

    public LineItem(Item item, String name, BigDecimal price, ItemStatus itemStatus, Order order) {
        this.item = item;
        this.name = name;
        this.price = price;
        this.itemStatus = itemStatus;
        this.order = order;
        this.itemId = UUID.randomUUID().toString();
    }

    public LineItem() {
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "order=" + (order != null ? order.getOrderId() : "") +
                ", itemId='" + itemId + '\'' +
                ", item=" + item +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", itemStatus=" + itemStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineItem lineItem = (LineItem) o;

        if (order != null ? !order.equals(lineItem.order) : lineItem.order != null) return false;
        if (itemId != null ? !itemId.equals(lineItem.itemId) : lineItem.itemId != null) return false;
        if (item != lineItem.item) return false;
        if (name != null ? !name.equals(lineItem.name) : lineItem.name != null) return false;
        if (price != null ? !price.equals(lineItem.price) : lineItem.price != null) return false;
        return itemStatus == lineItem.itemStatus;
    }

    @Override
    public int hashCode() {
        int result = order != null ? order.hashCode() : 0;
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (itemStatus != null ? itemStatus.hashCode() : 0);
        return result;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ProtoField(number = 1)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @ProtoField(number = 2)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @ProtoField(number = 3)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ProtoField(number = 4)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @ProtoField(number = 5)
    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }
}
