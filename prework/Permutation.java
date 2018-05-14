import java.util.ArrayList;
import java.util.Arrays;

public class Permutation
{
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> input) {
		int n = input.size();
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		return permute(input, 0, n-1,output);

	}

	private static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> input, int l, int r,ArrayList<ArrayList<Integer>> output)
	{
		if (l == r){
			output.add(new ArrayList<Integer>(input));
			return output;
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				if(!shouldSwap(input, l, i))
					continue;
				input = swap(input,l,i);
				permute(input, l+1, r,output);
				input = swap(input,l,i);
			}
		}
		return output;
	}

	private static boolean shouldSwap(ArrayList<Integer> input, int l, int curr) {
		for (int i = l; i < curr; i++) 
			if (input.get(i) == input.get(curr))
				return false;
		return true;
	}

	public static ArrayList<Integer> swap(ArrayList<Integer> input, int i, int j)
	{
		Integer temp;
		temp = input.get(i) ;
		input.set(i,input.get(j));
		input.set(j,temp);
		return input;
	}

}