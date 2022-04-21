package qedge.jan18;

public class Sample {

	public static void main(String[] args) {
		int x=300,y=500,z=300;
		System.out.println(x==z);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x!=z);
		System.out.println(x>y);
		System.out.println(y>x);
		System.out.println(x==z && x<y);
		System.out.println(x==y && x<y);
		System.out.println(x==z || x<y);
		System.out.println(x==y || x>y);
		System.out.println(!(x==z));
		System.out.println(!(x==y));
}

}
