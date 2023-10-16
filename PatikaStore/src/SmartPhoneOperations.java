import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.HashMap;

public class SmartPhoneOperations{
    static ArrayList<SmartPhone> smartPhones=new ArrayList<>();
    public static void mobilePhones(){
        smartPhones.add(new SmartPhone(1,3589.90,15,56,"IPHONE XSMAX",128,6.1,4000,6,"Mavi"));
        smartPhones.add(new SmartPhone(2,45986.90,25,156,"XİAOMİ RED Mİ",64,6.1,4000,6,"Kırmız"));
        smartPhones.add(new SmartPhone(3,15589.90,10,86,"SAMSUNG A24",128,6.1,4000,6,"Siyah"));
    }
    public static void printList(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-2s | %-27s | %-10s | %-10s | %-9s | %-16s | %-9s | %-10s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Stok", "Ekran", "İndirim Oranı", "Pil", "RAM", "RENK");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        for (SmartPhone sm: smartPhones){
            //System.out.println(sm.getId()+" "+sm.getPrice()+" "+sm.getDiscountRate()+" "+sm.getAmountOfStock()+" "+sm.getName()+" "+sm.getMemory()+" "+sm.getScreen()+" "+sm.getBattary()+" "+sm.getRam()+" "+sm.getColor());
            System.out.format("| %-2d | %-27s | %-10.2f | %-10d | %-9.1f | %-16d | %-9d | %-10d | %-10s |\n",
                    sm.getId(), sm.getName(), sm.getPrice(), sm.getAmountOfStock(), sm.getScreen(),
                    sm.getDiscountRate(), sm.getBattary(), sm.getRam(), sm.getColor());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void addMobilePhones(){
        Scanner s=new Scanner(System.in);
        System.out.println("Yeni Ürün eklemek için aşağıdaki bilgileri doldurunuz : ");

        System.out.print("Ürün ID giriniz : ");
        int id=s.nextInt();
        s.nextLine();
        if (isContainsId(id)){
            System.out.println("Girilen ID başka bir ürün adına kayıtlıdır, lütfen farklı bir ID giriniz!");
            addMobilePhones();
        }
        System.out.print("Ürün rengini giriniz : ");
        String color=s.nextLine();

        System.out.print("Ürün adını giriniz : ");
        String name=s.nextLine();

        System.out.print("Ürün fiyatını giriniz : ");
        int price=s.nextInt();

        System.out.print("Ürün indirim oranını giriniz : ");
        int discountRate=s.nextInt();

        System.out.print("Ürün stok durumunu giriniz : ");
        int amountOfStock=s.nextInt();

        System.out.print("Ürün hafızasını giriniz : ");
        int memory=s.nextInt();

        System.out.print("Ürün ekran boyutunu giriniz : ");
        double screen=s.nextDouble();

        System.out.print("Ürün batarya kapasitesini giriniz : ");
        int battary=s.nextInt();

        System.out.print("Ürün ram değerini giriniz : ");
        int ram=s.nextInt();


        smartPhones.add(new SmartPhone(id,price,discountRate,amountOfStock,name,memory,screen,battary,ram,color));
        System.out.println("Ürün başarılı bir şekilde eklendi !");
        printList();
    }
    public static void deleteMobilePhone(){
        printList();
        Scanner delete=new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün ID numarasını giriniz : ");
        int id=delete.nextInt();
        smartPhones.remove(id-1);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ürün başarılı bir şekilde silindi !");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        printList();
    }
    public static boolean isContainsId(int id){
        for (SmartPhone sm: smartPhones){
            if (sm.getId()==id){
                return true;
            }
        }
        return false;
    }


}




