package design.pattern.creational.PrototypePattern;

import java.util.List;

/**
 * 
 * @author mohammad.helal.khan
 *
 */
public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emps = new Employees();
		emps.loadData();

		Employees emps1 = (Employees) emps.clone();
		Employees emps2 = (Employees) emps.clone();
		
		List<String> list = emps1.getEmpList();
		list.add("Helal");
		
		List<String> list1 = emps2.getEmpList();
		list1.remove("Sayed");

		System.out.println("emps List  : " + emps.getEmpList());
		System.out.println("emps1 List : " + list);
		System.out.println("emps2 List : " + list1);
	}

}