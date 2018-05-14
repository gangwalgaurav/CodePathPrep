import java.util.ArrayList;


public class PettyPrinter {
	/***
	 * Calculate distance from center and print the max. distance
	 * @param A
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<2*A-1;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<2*A-1;j++){
                temp.add(Math.max(Math.abs(i - (A - 1)), Math.abs(j - (A - 1)))+1);
            }
            res.add(temp);
        }
        return res;
    }

}
