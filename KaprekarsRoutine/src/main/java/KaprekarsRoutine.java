import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by DreamShine on 17/10/2016.
 *
 * Basic Challenge - From https://www.reddit.com/r/dailyprogrammer/comments/56tbds/20161010_challenge_287_easy_kaprekars_routine/
 * Write a function that, given a 4-digit number,
 * returns the largest digit in that number. Numbers between 0 and 999 are counted as 4-digit numbers with leading 0's.
 *
 * Bonus 1 -
 * Write a function that, given a 4-digit number, performs the "descending digits" operation.
 * This operation returns a number with the same 4 digits sorted in descending order.
 */
public class KaprekarsRoutine
{


    public static int computeLargestNumber(int n) {
        ArrayList<Integer> seperateNumbers = new ArrayList<Integer>();
        getIndividualNumbers(n, seperateNumbers);
        return getLargestNumber(seperateNumbers);
    }

    private static void getIndividualNumbers(int n, ArrayList<Integer> seperateNumbers) {
        do
        {
            seperateNumbers.add(n % 10);
            n /= 10;
        } while (n > 0);
    }

    private static int getLargestNumber(ArrayList<Integer> seperateNumbers) {
        int largestNumber = 0;
        for(int number : seperateNumbers)
        {
            if(number > largestNumber) largestNumber = number;
        }
        return largestNumber;
    }

    public static String descendingDigitsOf(int n) {
        String stringRep = Integer.toString(n);


        for(int lengthOfNumberString = stringRep.length();lengthOfNumberString - 4 != 0  ;lengthOfNumberString++)
        {
            stringRep = "0" + stringRep;
        }
        System.out.println(stringRep);
       return reverseNumberString(stringRep);
    }

    private static String reverseNumberString(String stringRep)
    {
        String reversedNumberString = "";
        for(int i = stringRep.length() - 1; i >= 0; i--)
        {
           reversedNumberString += stringRep.charAt(i);
        }
        return reversedNumberString;
    }
}
