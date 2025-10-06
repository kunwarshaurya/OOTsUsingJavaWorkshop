import java.util.ArrayList;

public class FiveCountries {
    public ArrayList<String> createList(String c1, String c2, String c3, String c4, String c5) {
        ArrayList<String> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        return list;
    }

    public static void main(String[] args) {
        FiveCountries fc = new FiveCountries();
        ArrayList<String> countryList = fc.createList("India", "Germany", "Brazil", "Egypt", "Spain");
        System.out.println("List of five countries: " + countryList);
    }
}