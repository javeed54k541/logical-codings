package coding.com;

public class CopyArray {
	public static void copy(int a[]) {
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			a1[i]=a[i];
		System.out.println(a1[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {1,4,3,5,6};
		copy(a);
	}
}
