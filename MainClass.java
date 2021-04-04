import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {


    public static void main(String[] args) {
        Application application1 = new Application("Gmail", 4.4, 8599645, "5,000,000,000+");
        Application application2 = new Application("Microsoft Outlook: Secure email, calendars \\u0026 files", 4.6, 5970810, "100,000,000+");
        Application application3 = new Application("Yandex.Mail", 4.5, 267533, "10,000,000+");
        Application application4 = new Application("GMX - Mail \u0026 Cloud", 4.6, 370212, "10,000,000+");

        ArrayList<Application> appList = new ArrayList<>();
        appList.add(application1);
        appList.add(application2);
        appList.add(application3);
        appList.add(application4);
        for (Application application : appList) {
            System.out.println(application.getName());
        }
        System.out.println();
        System.out.println("a to z");
        System.out.println();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < appList.size(); i++) {
            names.add(appList.get(i).getName());

        }
        for (int i = 0; i < names.size(); i++) {
            Collections.sort(names);
            System.out.println(names.get(i));


        }

        System.out.println();
        System.out.println("RatingValue");
        System.out.println();

        Collections.sort(appList, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return Double.valueOf(o1.getRatingValue()).compareTo(o2.getRatingValue());
            }
        });
        for (Application ratingvalue:appList
             ) {
            System.out.println(ratingvalue.getRatingValue());

        }
        System.out.println();
        System.out.println("RatingCount");
        System.out.println();
        Collections.sort(appList, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return Long.valueOf((long) o1.getRatingCount()).compareTo((long) o2.getRatingCount());
            }
        });
        for (Application ratingCount:appList
             ) {
            System.out.println(ratingCount.getRatingCount());

        }
        System.out.println();
        System.out.println("Downloads");
        System.out.println();

        for (Application model:appList
             ) {model.setDownloads(String.valueOf(convertToLong(model.getDownloads())));

        }

        Collections.sort(appList, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return Long.valueOf(o1.getDownloads()).compareTo(Long.valueOf(o2.getDownloads())) ;
            }
        });
        for (Application downloadsValues:appList
             ) {
            System.out.println(downloadsValues.getDownloads());

        }

    }


    private static long convertToLong(String str){
        String newString= str.replace("+","");
        String newString2=newString.replace(",","");
        return Long.valueOf(newString2);}

}