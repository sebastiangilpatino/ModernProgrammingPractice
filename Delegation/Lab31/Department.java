package Lab31;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> positions;
	private Company company;

	public Department(String name, Company company) {
		positions = new ArrayList<Position>();
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getNameCompany() {
		return company.getName();
	}

	public void print() {
		System.out.println("");
		System.out.print(" " + name + ": ");

		for (int i = 0; i < positions.size(); i++) {
			positions.get(i).print();
		}

	}

	public void addPosition(Position pos) {
		if (pos.getDepartmentName().equals(this.name)) {
			positions.add(pos);
		} else {
			System.out.println("Position does not match");
		}
	}

	public double getSalary() {
		double sal = 0;

		for (int i = 0; i < positions.size(); i++) {
			sal += positions.get(i).getSalary();
		}

		return sal;
	}

}
