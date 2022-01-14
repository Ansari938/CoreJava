package exersisecollection;

import java.util.ArrayList;

public class Exersise_4 {
	public static void main(String[] args) {

		Exersise_3 e1 = new Exersise_3();
		e1.setFname("Fahim");
		e1.setLname("Ansari");
		e1.setSalary(28000);

		Exersise_3 e2 = new Exersise_3();
		e2.setFname("Kapil");
		e2.setLname("Malviya");
		e2.setSalary(50000);

		Exersise_3 e3 = new Exersise_3();
		e3.setFname("Yash");
		e3.setLname("Jain");
		e3.setSalary(30000);

		Exersise_3 e4 = new Exersise_3();
		e4.setFname("Rahul");
		e4.setLname("Jain");
		e4.setSalary(38000);

		Exersise_3 e5 = new Exersise_3();
		e5.setFname("Raja");
		e5.setLname("Biswas");
		e5.setSalary(30000);

		ArrayList<Exersise_3> A = new ArrayList<Exersise_3>();
		A.add(e1);
		A.add(e2);
		A.add(e3);
		A.add(e4);
		A.add(e5);

		System.out.println(e1.equals(e2));

	}

}
