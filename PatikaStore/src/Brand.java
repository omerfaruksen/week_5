import java.util.Scanner;
import java.util.TreeSet;

public class Brand  implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //Markaların listelendiği kısım
    //Markalar TreeSet ile listelendi alfabetik olarak sıralanması daha rahatıma geldi
    static TreeSet<Brand> Brands =new TreeSet<>();
    static {

        Brands.add(new Brand(1,"Apple"));
        Brands.add(new Brand(2,"Samsung"));
        Brands.add(new Brand(3,"Levono"));
        Brands.add(new Brand(4,"Huawei"));
        Brands.add(new Brand(5,"Casper"));
        Brands.add(new Brand(6,"Asus"));
        Brands.add(new Brand(7,"HP"));
        Brands.add(new Brand(8,"Xiaomi"));
        Brands.add(new Brand(9,"Monster"));
    }
    public static void print(){
        System.out.println("Markalar : ");
    for (Brand brand: Brands) {
        System.out.println("- "+ brand.getName());
        }
        System.out.println("0- Ana Menü");

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getName().compareTo(o.getName());
    }
}
