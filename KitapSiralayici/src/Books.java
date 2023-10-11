public class Books {
    private String bookName;
    private String writerName;
    private int pageNumber;
    private int releaseDate;

    public Books(String bookName, String writerName, int pageNumber, int releaseDate) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
