public class Notebook extends Product{
    private String brandName;
    private int ram;
    private int memory;
    private int screen;

    public Notebook(int id, double price, int discountRate, int amountOfStock, String name, String brandName, int ram, int memory, int screen) {
        super(id, price, discountRate, amountOfStock, name);
        this.brandName = brandName;
        this.ram = ram;
        this.memory = memory;
        this.screen = screen;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }
}
