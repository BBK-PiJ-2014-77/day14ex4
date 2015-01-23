import java.util.ArrayList;
import java.util.List;

/**
 * Created by digibrose on 21/01/2015.
 */
public class BinarySearch {

    static boolean Search(List<Integer> input, int query ) {

        if (input.size() == 1) {
            if (input.get(0) == query){
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (input.get(input.size()/2) == query){
                return true;
            }
            else
            {
                List<Integer> half1 = new ArrayList<Integer>();
                List<Integer> half2 = new ArrayList<Integer>();

                for (int i =0; i < input.size()/2;i++){
                    half1.add(input.get(i));
                }
                System.out.println(half1);

                for (int j = input.size()/2; j < input.size();j++){
                    half2.add(input.get(j));
                }
                System.out.println(half2);

                boolean h1 = false;
                boolean h2 = false;

                if (half2.get(0) > query){
                    h1 = Search(half1, query);
                }
                else{
                    h2 = Search(half2, query);
                }

                boolean answer = false;
                if (h1 || h2){
                    return true;
                }
                else {
                    return false;
                }
            }
        }



    }

}
