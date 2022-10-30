package SoftUniJavaFundamentals.Ex_06.P01_AdvertisementMessage;

public class Authors {
    private String author;

    public Authors(String author) {
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String toString(){
        return String.format("%s", author);
    }

}
