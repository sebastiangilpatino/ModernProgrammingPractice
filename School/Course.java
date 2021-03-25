package SchoolLab2;

public class Course {

	private String Number;
	private String Title;
	private int Unirs;

	public Course(String number, String title, int unirs) {
		Number = number;
		Title = title;
		Unirs = unirs;
	}

	public int getUnirs() {
		return Unirs;
	}

}
