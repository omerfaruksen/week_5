import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        //!!!!!!!            DAHA KISA YOLU VARSA ÖNERİLERE AÇIĞIM         !!!!!!!


        //Kitabın sayfa sayısına göre sıralama
        TreeSet<Books> books =new TreeSet<>(new PageNumberComperator());
        books.add(new Books("Zümrüt Ayna               ","A.M. Celal ŞENGÖR",200,2013));
        books.add(new Books("Gazi Mustafa Kemal ATATÜRK","İlber ORTAYLI    ",356,2020));
        books.add(new Books("Kısa Osmanlı Tarihi       ","Halil İNALCIK    ",261,2010));
        books.add(new Books("Bozkırın Kağanlıkları     ","Ahmet TAŞAĞIL    ",320,2019));
        books.add(new Books("Bunu Herkes Bilir         ","Emrah Safa GÜRKAN",197,2021));


        System.out.println("Sayfa Sayısına Göre Sıralama : ");
        System.out.println();
        System.out.println("Kitabın Adı:                        Kitabın Yazarı:        Sayfa Sayısı: Yayın Tarihi:");
    for (Books book : books){
        System.out.println(book.getBookName()+"\t\t\t"+book.getWriterName()+"\t\t\t"+book.getPageNumber()+"\t\t\t"+book.getReleaseDate());
    }
        System.out.println("========================================================================================");
        //Kitabın adına göre sıralama
        TreeSet<Books> writer =new TreeSet<>(new BookNameComperator());
        writer.add(new Books("Zümrüt Ayna               ","A.M. Celal ŞENGÖR",200,2013));
        writer.add(new Books("Gazi Mustafa Kemal ATATÜRK","İlber ORTAYLI    ",356,2020));
        writer.add(new Books("Kısa Osmanlı Tarihi       ","Halil İNALCIK    ",261,2010));
        writer.add(new Books("Bozkırın Kağanlıkları     ","Ahmet TAŞAĞIL    ",320,2019));
        writer.add(new Books("Bunu Herkes Bilir         ","Emrah Safa GÜRKAN",197,2021));

        System.out.println("Kitabın Adına Göre Sıralama : ");
        System.out.println();
        System.out.println("Kitabın Adı:                        Kitabın Yazarı:        Sayfa Sayısı: Yayın Tarihi:");
    for (Books write : books){
        System.out.println(write.getBookName()+"\t\t\t"+write.getWriterName()+"\t\t\t"+write.getPageNumber()+"\t\t\t"+write.getReleaseDate());
    }

    }

}