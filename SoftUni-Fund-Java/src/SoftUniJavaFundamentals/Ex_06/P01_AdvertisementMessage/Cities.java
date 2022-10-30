package SoftUniJavaFundamentals.Ex_06.P01_AdvertisementMessage;

public class Cities {
    private String city;

    public Cities(String city) {
        this.city = city;
    }


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("%s", city);
    }
}
