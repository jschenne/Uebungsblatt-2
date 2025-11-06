package h2;

public class H2_main {
	public static void main(String[] args) {
		int i=1, j=2, k=3, min=50, max=30;
		
		if (i<j & i<k) {
			min=i;
		}
		if (j<i & j<k) {
			min=j;
		}
		if (k<i & k<j) {
			min=k;
		}
		System.out.println(min);
		
		if (i>j & i>k) {
			max=i;
		}
		if (j>i & j>k) {
			max=j;
		}
		if (k>i & k>j) {
			max=k;
		}
		System.out.println(max);
	}
}
