package Lab31;

import java.util.ArrayList;
import java.util.List;

public class Company {
	List<Department> departments;
	private String name;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public Company(String name) {
		departments = new ArrayList<Department>();
		this.name = name;
	}

	public void print() {
		System.out.println(name + ": ");
		for (int i = 0; i < departments.size(); i++) {
			departments.get(i).print();
		}
	}

	public void addDepartment(Department dept) {
		if (dept.getNameCompany().equals(this.name)) {
			departments.add(dept);
		} else {
			System.out.println("the company does not match");
		}
	}

	public double getSalary() {
		double sal = 0;

		for (int i = 0; i < departments.size(); i++) {
			sal += departments.get(i).getSalary();
		}

		return sal;

	}
}
