
// Evan Knudsen

public class StringKnowledge {
    public static void main(String[] args) {

        // Test for endOther(), checking capitalization along with substring appearance
        System.out.println("Tests for endOther():");
        System.out.println(endOther("EVAN", "van"));
        System.out.println(endOther("EVAb", "van"));
        System.out.println(endOther("VAN", "Evan"));
        System.out.println(endOther("asdfasdgdsgEVAN", "asdfdagdfagsadfvan"));
        System.out.println(endOther("EVAN", "van1"));
        System.out.println();

        /*
        Tests for findRepeats(), placing the repeating substring at different location, also checking with repeating
        substrings directly adjacent to each other.
         */
        System.out.println("Tests for findRepeats():");
        System.out.println(findRepeats("ababababa"));
        System.out.println(findRepeats("abcgjglksdlkgflkdsagfjdsalkfjdsalkfabc"));
        System.out.println(findRepeats("abcadslknfmabcalkdnf"));
        System.out.println(findRepeats("abcab"));
        System.out.println(findRepeats("I want ice cream, it is yummy. I like ice cream"));
        System.out.println(findRepeats("abteyouga"));
        System.out.println(findRepeats("aaaa"));
    }

    public static boolean endOther(String a, String b) {

        /*
        A compact return statement that converts both strings to lower case, then checks to see if String a
        ends with String b, or if String b ends with String a, all simply using the .endsWith() function
         */
        return ((a.toLowerCase().endsWith(b.toLowerCase())) || (b.toLowerCase().endsWith(a.toLowerCase())));
    }

    public static boolean findRepeats(String toTest) {

        /*
        Starting with an outer for loop that assigns i to the first index, keeping it under the length of the toTest
        string because .length() is 1 higher than the last index, and incrementing by 1 each iteration. There is a nested
        for loop that assigns j to i + 2 because we are only looking for substrings >= 2 in length, so later when the
        .substring() function is called with the end index being exclusive, we include only the appropriate characters.

        These two loops start at the first possible location of a substring, then check to see if there is ever another
        index of this same substring after the first appearance (aka if the substring ever appears again) and returns
        true if there is.
         */
        for (int i = 0; i < toTest.length(); i += 1) {
            for (int j = i + 2; j <= toTest.length(); j += 1) {
                String substring = toTest.substring(i, j);

                if (toTest.indexOf(substring, j) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
