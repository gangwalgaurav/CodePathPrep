
public class NumRange {

	public static int numRange(int[] A, int B, int C) {
		int count = 0;
		int sum = 0;
		if(A==null || A.length == 0)
			return count;		
		for(int i=0;i<A.length;i++) {
			int j = i;
			sum = 0;
			while(j<A.length){
				sum = sum + A[j++];
				if(sum<B)
					continue;
				else if(sum<=C){
					count++;
				}
				else{
					break;
				}

			}
		}
		return count;
	}
}
