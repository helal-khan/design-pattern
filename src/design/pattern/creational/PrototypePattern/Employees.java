package design.pattern.creational.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mohammad.helal.khan
 *
 */
public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Nibras");
		empList.add("Haque");
		empList.add("Shamim");
		empList.add("Sayed");
		empList.add("Mannan");
		empList.add("Masud");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
