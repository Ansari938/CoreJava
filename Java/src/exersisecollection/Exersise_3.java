package exersisecollection;

import java.util.Comparator;

public class Exersise_3 implements Comparator<Exersise_3> {
private String fname;
private String lname;
private int salary;

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public int compare(Exersise_3 o1, Exersise_3 o2) {
	
	return o2.getSalary()-o1.getSalary();
}




}
