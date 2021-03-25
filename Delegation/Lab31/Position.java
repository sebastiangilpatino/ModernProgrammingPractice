package Lab31;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private String title;
	private String description;
	private List<Employee> employees;
	private Department department;

	public Position(String title, Department department) {
		employees = new ArrayList<Employee>();
		this.title = title;
		this.department = department;
	}

	public void addEmployee(Employee emp) {
		if (emp.getPositionName().equals(title)) {
			employees.add(emp);
		} else {
			System.out.println("Employee does not match");
		}

	}

	public String getDepartmentName() {
		return department.getName();
	}

	public void print() {
		System.out.println("");
		System.out.print("  " + title + ": ");

		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).print();
		}
		System.out.println("");
	}

	public String getTitle() {
		return title;
	}

	public double getSalary() {
		double sal = 0;

		for (int i = 0; i < employees.size(); i++) {
			sal += employees.get(i).getSalary();
		}

		return sal;
	}

}
