import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryListCollection{

    public static ArrayList<String> createCountryList(Collection<String> countries) {

        ArrayList<String> newList = new ArrayList<>(countries);
        return newList;
    }

    public static void main(String[] args) {

        List<String> countryList = Arrays.asList("India", "USA", "UK");
        ArrayList<String> resultFromList = createCountryList(countryList);
        System.out.println("ArrayList created from a List: " + resultFromList);

        Set<String> countrySet = new HashSet<>(Arrays.asList("Canada", "Australia", "Germany"));
        ArrayList<String> resultFromSet = createCountryList(countrySet);
        System.out.println("ArrayList created from a Set: " + resultFromSet);
    }
}