import java.util.Comparator;

public class PageNumberComperator implements Comparator<Books> {
    @Override
    public int compare(Books o1, Books o2) {
        return o1.getPageNumber()- o2.getPageNumber();
    }
}
