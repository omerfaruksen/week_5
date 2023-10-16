import java.util.HashMap;
import java.util.Map;

public class SmartPhone extends Product{
    private int memory;
    private double screen;
    private int battary;
    private int ram;
    private String color;
    private String brandName;


    public SmartPhone(int id, double price, String brandName ,int discountRate, int amountOfStock, String name, int memory, double screen, int battary, int ram, String color) {
        super(id, price, discountRate, amountOfStock, name);
        this.memory = memory;
        this.screen = screen;
        this.battary = battary;
        this.ram = ram;
        this.color = color;
        this.brandName = brandName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getBattary() {
        return battary;
    }

    public void setBattary(int battary) {
        this.battary = battary;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
