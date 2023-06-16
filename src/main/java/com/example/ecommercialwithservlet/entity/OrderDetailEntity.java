package com.example.ecommercialwithservlet.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_detail", schema = "bookstoredb")
public class OrderDetailEntity {
//    @Basic
//    @Column(name = "order_id")
//    private Integer orderId;
//    @Basic
//    @Column(name = "book_id")
//    private Integer bookId;

    @EmbeddedId
    private OrderDetailEntityPrimaryKey primaryKey;
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "sub_total")
    private double subTotal;

    public OrderDetailEntityPrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(OrderDetailEntityPrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    //    public Integer getOrderId() {
//        return orderId;
//    }

//    public void setOrderId(Integer orderId) {
//        this.orderId = orderId;
//    }

//    public Integer getBookId() {
//        return bookId;
//    }

//    public void setBookId(Integer bookId) {
//        this.bookId = bookId;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        OrderDetailEntity that = (OrderDetailEntity) o;
//
//        if (quantity != that.quantity) return false;
//        if (Double.compare(that.subTotal, subTotal) != 0) return false;
//        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
//        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
//
//        return true;
//    }

//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = orderId != null ? orderId.hashCode() : 0;
//        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
//        result = 31 * result + quantity;
//        temp = Double.doubleToLongBits(subTotal);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
@Embeddable
class OrderDetailEntityPrimaryKey implements Serializable {
    @Column(name = "order_id", nullable = false)
    private Integer orderId;
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}



