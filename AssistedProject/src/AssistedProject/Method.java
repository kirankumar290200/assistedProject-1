package AssistedProject;

public class Method{

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
}

	public static void main(String[] args) {

		Method b=new Method();
		int a1= b.multipynumbers(15,5);
		System.out.println("Multipilcation is :"+a1);
	}
}