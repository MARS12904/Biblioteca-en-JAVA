package Clases;

public class Stock {
    private int id;
    private int stock;

    public Stock(int id,int stock) {
        this.id = id;
        this.stock = stock;
    }
    
    // getters and setters for name and price
    public double getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}