package com.improve.model;

public class CurrencyConversion {
    private String from;
    private String to;
    private float conversionMultiple;
    private float quantity;
    private float totalAmount;
    private int port;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(float conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
