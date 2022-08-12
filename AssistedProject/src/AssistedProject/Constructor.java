package AssistedProject;

class EmpInfo{
	int id;
	String username;

	void display() {
		System.out.println(id+" "+username);
	}
}

	public class Constructor {

		public static void main(String[] args) {

			EmpInfo emp1=new EmpInfo();
			EmpInfo emp2=new EmpInfo();

			emp1.display();
			emp2.display();
	}
}