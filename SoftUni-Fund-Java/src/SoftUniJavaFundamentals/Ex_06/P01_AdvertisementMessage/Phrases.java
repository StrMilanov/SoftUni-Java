package SoftUniJavaFundamentals.Ex_06.P01_AdvertisementMessage;

public class Phrases {
    private String phrase;

    public Phrases(String phrase) {
        this.phrase = phrase;
    }


    public String getPhrase() {
        return phrase;
    }

    public String toString(){
        return String.format("%s", phrase);
    }

}
