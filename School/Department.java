package SchoolLab2;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String Name;
	private List<Person> persons;

	public Department(String name) {
		this.Name = name;
		persons = new ArrayList<Person>();
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public double getTotalSalary() {
		double salary = 0;

		for (int i = 0; i < persons.size(); i++) {
			salary += persons.get(i).getSalary();
		}

		return salary;
	} // must implement getTotalSalary in two different ways

	public void showAllMembers() {
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i).toString());
		}
	}

	public void unitsPerFaculty() {
		String type;

		for (int i = 0; i < persons.size(); i++) {
			type = persons.get(i).getClass().getSimpleName();

			switch (type) {
			case "Faculty":
				System.out.println(persons.get(i).toString() + "Units: " + persons.get(i).getTotalUnits());
				break;

			default:
				break;
			}

		}
	}

	// must implement unitsPerFaculty in two different ways
}
