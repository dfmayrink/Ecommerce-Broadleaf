package com.eraumavezbh.core.order.domain;

import org.broadleafcommerce.core.order.domain.OrderImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING_ORDER")
public class BookingOrder extends OrderImpl {
    private static final long serialVersionUID = 1L;



    @Column(name = "BOOKING_ORDER_ID")
    private String bookingOrderId;

    public String getBookingOrderId() {
        return bookingOrderId;
    }

    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }
}