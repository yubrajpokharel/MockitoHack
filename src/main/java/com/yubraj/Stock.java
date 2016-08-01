package com.yubraj;

/**
 * Created by yubraj on 8/1/16.
 */

public class Stock {
    private String stockId;
    private String name;
    private int quantity;

    public Stock(String stockId, String name, int quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getTicker() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
