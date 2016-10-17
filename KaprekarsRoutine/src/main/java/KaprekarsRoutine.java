import java.util.ArrayList;

/**
 * Created by DreamShine on 17/10/2016.
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
}
