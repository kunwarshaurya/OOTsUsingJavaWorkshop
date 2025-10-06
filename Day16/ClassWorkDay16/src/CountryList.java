import java.util.*;

public class CountryList {

    public static ArrayList<String> createCountryList(Collection<String> countries) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(countries);
        return arrayList;
    }

    public static void main(String[] args) {

        List<String> countryNamesList = Arrays.asList("India", "USA", "UK");
        ArrayList<String> result1 = createCountryList(countryNamesList);
        System.out.println("Created from List: " + result1);


        Set<String> countryNamesSet = new HashSet<>(Arrays.asList("Canada", "Australia"));
        ArrayList<String> result2 = createCountryList(countryNamesSet);
        System.out.println("Created from Set: " + result2);
    }
}
