import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan metin isteniyor
        String text;
        Scanner writing =new Scanner(System.in);
        System.out.print("Bir metin giriniz ve enter tuşuna basınız : ");
        text=writing.nextLine();
        String [] arrText=text.split(" ");

        //Kelimeleri hashmape ekliyoruz
        HashMap<String, Integer> wordage =new HashMap<>();
        for (String word: arrText){
            if (wordage.containsKey(word)){
                int value=wordage.get(word);
                wordage.put(word,value+1);
            }else {
                wordage.put(word,1);
            }
        }
        //En çok geçen kelimeyi buluyoruz
        int count=1;
        String words=null;
        for (HashMap.Entry<String,Integer>set : wordage.entrySet()){
            if (count< set.getValue()){
                count= set.getValue();
                words= set.getKey();

            }
        }
        //Ekrana bastırıyoruz.
        System.out.println("Metin içerisinde en çok geçen kelime : "+"'"+words+"'"+ " " +count+" defa geçiyor!");
}
}