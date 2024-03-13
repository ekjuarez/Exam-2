
// Evan Knudsen

public class LogicKnowledge {
    public static void main(String[] args) {

        // Tests for greenTicket() going through all possible scenarios in regard to numbers matching
        System.out.println("Tests for greenticket():");
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(1, 1, 3));
        System.out.println(greenTicket(1, 1, 1));
        System.out.println(greenTicket(1, 2, 2));
        System.out.println(greenTicket(1, 2, 1));
        System.out.println();

        // Tests for makeChocolate(), going through different combinations of integers, including possible outliers
        System.out.println("Tests for makeChocolate():");
        System.out.println(makeChocolate(5, 1, 10));
        System.out.println(makeChocolate(5, 1, 3));
        System.out.println(makeChocolate(5, 2, 10));
        System.out.println(makeChocolate(1, 1, 10));
        System.out.println(makeChocolate(10, 0, 10));
        System.out.println(makeChocolate(3, 5, 3));
        System.out.println(makeChocolate(1, 5, 3));
    }

    public static int greenTicket(int a, int b, int c) {

        /*
        If else block starting with the scenario of all of them being the same number, then moving to the scenario
        where they are all different, and finally the else statement will catch any other scenarios, which all only
        result in two of the numbers being equal and one being different
         */
        if ((a == b) && (a == c)) {
            return 20;
        } else if ((a != b) && (a != c) && (b != c)) {
            return 0;
        } else {
            return 10;
        }
    }

    public static int makeChocolate(int small, int large, int goal) {

        // Subtracting as many large bars as we can from the goal sell amount and being left with leftovers
        int poundsOfLarge = large * 5;
        if (poundsOfLarge <= goal) {
            while (large > 0) {
                goal -= 5;
                large -= 1;
            }
        }
        int leftovers = goal;

        // If we have enough small bars, subtracting them from goal and returning how many we needed, else returning -1
        if (leftovers <= small) {
            return leftovers;
        } else {
            return -1;
        }
    }
}
