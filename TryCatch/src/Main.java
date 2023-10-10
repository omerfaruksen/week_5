import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Tek boyutlu bir dizi oluşturduk
        int[] dizi={1,2,3,4,5,6,7,8,9,10};
        //Kullanıcıdan ver aldık
        Scanner info=new Scanner(System.in);
        System.out.print("Bir indis numarası giriniz : ");
        int i= info.nextInt();
        //Try-Catch ile aldığımız verinin, dizi sınırları dahilinde olup olmadığını kontrol ediyoruz
        try {
            //Aldğımız veriye denk gelen elemanı ekrana bastırdık.
            System.out.println("Girdiğiniz değerin karşılığı : "+dizi[i]);
        }catch (Exception e){
            //Dizi sınırları dışında ise kullanıcıya bir hata mesajı gönderiyoruz
            System.out.println("Dizi boyutları dışında bir değer girildi ! ");
        }
    }
}