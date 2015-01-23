import java.util.ArrayList;
import java.util.List;

/**
 * Created by digibrose on 22/01/2015.
 */
public class BSTest {

    public static void main (String[] args){


        List<Integer> Test = new ArrayList<Integer>();
        Test.add(1);
        Test.add(3);
        Test.add(6);
        Test.add(8);
        Test.add(9);
        Test.add(12);
        Test.add(14);
        Test.add(16);


        System.out.println(BinarySearch.Search(Test, 8));

        System.out.println(BinarySearch.Search(Test, 11));


    }

}
