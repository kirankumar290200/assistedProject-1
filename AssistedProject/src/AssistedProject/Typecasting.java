package AssistedProject;

public class Typecasting {

	int val=120;

	int operation(int val) {
		val =val*10/100;
		return(val);
}

	public static void main(String args[]) {
		Typecasting d = new Typecasting();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(50);
		System.out.println("After operation value of data is "+d.val);
	}
}