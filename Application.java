import java.util.Collections;

public class Application  {
    private String name;
    private double ratingValue;
    private long ratingCount;
    private String downloads;

    public String getName() {
        return name;
    }

    public Application() {
    }

    public double getRatingValue() {
        return ratingValue;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public double getRatingCount() {
        return ratingCount;
    }

    public String getDownloads() {
        return downloads;
    }

    public Application(String name, double ratingValue, double ratingCount, String downloads) {
        this.name = name;
        this.ratingValue = ratingValue;
        this.ratingCount = (long) ratingCount;
        this.downloads = downloads;
    }


}

