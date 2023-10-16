public class Product {
    private int id;
    private double price;
    private int discountRate;
    private int amountOfStock;
    private String name;

    public Product(int id, double price, int discountRate, int amountOfStock, String name) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
