import java.util.ArrayList;
import java.util.Scanner;

public class NotebookOperations {

    static ArrayList<Notebook> notebooks = new ArrayList<>();
    public static void noteBooks() {
        notebooks.add(new Notebook(1,15000,15,50,"ASUS Tuf Gaming ","ASUS",8,512,14));
        notebooks.add(new Notebook(2,35000,15,50,"HUAWEI Matebook 14  ","HUAWEI",8,512,14));
        notebooks.add(new Notebook(3,25000,15,50,"LENOVO V14 IGL","LEVONO",8,512,14));

    }
    public static void printList() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s |%-12s | %-10s | %-10s | %-9s | %-16s | %-9s |\n",
                "ID", "Ürün Adı", "Marka", "Fiyat", "Stok", "Ekran", "İndirim Oranı", "RAM");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for (Notebook nb : notebooks) {
            //System.out.println(sm.getId()+" "+sm.getPrice()+" "+sm.getDiscountRate()+" "+sm.getAmountOfStock()+" "+sm.getName()+" "+sm.getMemory()+" "+sm.getScreen()+" "+sm.getBattary()+" "+sm.getRam()+" "+sm.getColor());
            System.out.format("| %-2d | %-27s |%-12s | %-10.2f | %-10d | %-9d | %-16d | %-9d |\n",
                    nb.getId(), nb.getName(), nb.getBrandName(), nb.getPrice(), nb.getAmountOfStock(), nb.getScreen(),
                    nb.getDiscountRate(),  nb.getRam());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void addNotebooks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Yeni Ürün eklemek için aşağıdaki bilgileri doldurunuz : ");

        System.out.print("Ürün ID giriniz : ");
        int id = s.nextInt();
        s.nextLine();
        if (isContainsId(id)) {
            System.out.println("Girilen ID başka bir ürün adına kayıtlıdır, lütfen farklı bir ID giriniz!");
            addNotebooks();
        }
        System.out.print("Ürün markasını giriniz : ");
        String brandName = s.nextLine();

        System.out.print("Ürün modelini giriniz : ");
        String name = s.nextLine();

        System.out.print("Ürün fiyatını giriniz : ");
        int price = s.nextInt();

        System.out.print("Ürün indirim oranını giriniz : ");
        int discountRate = s.nextInt();

        System.out.print("Ürün stok durumunu giriniz : ");
        int amountOfStock = s.nextInt();

        System.out.print("Ürün hafızasını giriniz : ");
        int memory = s.nextInt();

        System.out.print("Ürün ekran boyutunu giriniz : ");
        int screen = s.nextInt();

        System.out.print("Ürün ram değerini giriniz : ");
        int ram = s.nextInt();

        notebooks.add(new Notebook(id,price,discountRate,amountOfStock,name,brandName,ram,memory,screen));
        System.out.println("Ürün başarılı bir şekilde eklendi !");
        printList();
    }
    public static boolean isContainsId(int id) {
        for (Notebook nb : notebooks) {
            if (nb.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
