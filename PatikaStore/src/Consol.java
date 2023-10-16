import java.util.Scanner;

public class Consol {

    public void screenConsol(){
        System.out.println("PatikaStore Ürün Yönetim Sistemine Hoşgeldiniz!");
        System.out.println("1- Notebook İşlemmleri");
        System.out.println("2- Cep Telefonu İşlemleri");
        System.out.println("3- Markalar");
        System.out.println("0- Çıkış");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        Scanner select=new Scanner(System.in);
        int selected=select.nextInt();
        System.out.println("-----------------------------------------------");
        SmartPhoneOperations.mobilePhones();
        while (true){
            switch (selected){
                case 0:
                    System.out.println("Çıkış yaptınız ! İyi günler dileriz.");
                    break;
                case 1:
                    //Bilgisayarlar
                    break;
                case 2:
                    System.out.println("1- Ürünleri Listele ");
                    System.out.println("2- Ürün ekle ");
                    System.out.println("3- Ürün sil ");
                    System.out.println("4- ID Filtreleme");
                    System.out.println("0- Ana menüye dön ");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    int selectnumber=select.nextInt();
                    switch (selectnumber){
                        case 0:
                            screenConsol();
                            break;
                        case 1:
                            SmartPhoneOperations.printList();
                            screenConsol();
                            break;
                        case 2:
                            SmartPhoneOperations.addMobilePhones();
                            screenConsol();
                            break;
                        case 3:
                            SmartPhoneOperations.deleteMobilePhone();
                            screenConsol();
                            break;
                        case 4:
                            SmartPhoneOperations.filterById();
                            break;
                        default:
                            System.out.println("Hatalı bir giriş yaptınız!! Ana Menüye yönlendiriliyorsunuz!!");
                            screenConsol();
                    }
                    break;
                case 3:
                    Brand.print();
                    screenConsol();
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız tekrar giriş yapınız !");

            }
            break;


        }

    }
    public static boolean isCheck(){
        return true;
    }
}
