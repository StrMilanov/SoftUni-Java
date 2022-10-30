package SoftUniJavaFundamentals.Ex_06.P01_AdvertisementMessage;

public class Events {
    private String event;

    public Events(String event) {
        this.event = event;
    }


    public String getEvent() {
        return event;
    }

    public String toString(){
        return String.format("%s", event);
    }

}

