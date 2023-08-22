import java.util.Arrays;
import java.util.Comparator;

class CountryComparator implements Comparator<String> {
        public int compare(String country1, String country2) {
                return country2.compareTo(country2); // COMPARE_TO
        }/*from   w  w w  .j  a v  a  2 s .  c  om*/
}

public class Sort {
        public static void main(String[] args) {
                String[] brics = {"Brazil", "Russia", "India", "China"};
                Arrays.sort(brics, null);
                for(String country : brics) {
                        System.out.print(country + " ");
                }
        }
}