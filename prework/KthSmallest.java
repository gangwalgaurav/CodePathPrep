import java.util.ArrayList;

public class KthSmallest {

	public static int kthsmallest(final ArrayList<Integer> A, int B) {
		if ( A== null || A.size()  <  B ) return -1;
		int temp1 = A.get(0),temp2;
		boolean begin = true;
		if ( B > A.size() /2 ) {
			begin = false;
			temp2 = -1;
		} else {
			temp2 = Integer.MAX_VALUE;
		}

		int count, candidate,reps;
		for (int i = 0; i <A.size() ; i++) {
			candidate = A.get(i);
			count = 0;
			reps = 0;
			if ( begin) {
				if ( candidate >= temp1 && candidate < temp2) {

					for (int j = 0; j < A.size(); j++) {
						if (A.get(j).intValue() < candidate) {
							count++;
						}
						if (A.get(j).intValue()== candidate)  reps++;
					}

					if (count + reps == B || (count < B &&  B - count < reps)) return candidate;
					if (count + reps > B) {
						temp2 = candidate;
						if ( temp1 == temp2) temp1 = -1;
					}
					else temp1 = candidate;
				}
			} else {

				if ( candidate > temp2 && candidate <= temp1) {

					for (int j = 0; j < A.size(); j++) {
						if (A.get(j).intValue() > candidate) {
							count++;
						}
						if (A.get(j).intValue()== candidate)  reps++;
					}

					if (count + reps == A.size() - B + 1 || (count < A.size() - B + 1 && A.size() - B + 1 - count < reps)) return candidate;
					if (count + reps > A.size() - B + 1) {
						temp2 = candidate;
						if ( temp1 == temp2) temp1 = Integer.MAX_VALUE;
					}
					else temp1 = candidate;
				}
			}
		}
		return -1;
	}
}