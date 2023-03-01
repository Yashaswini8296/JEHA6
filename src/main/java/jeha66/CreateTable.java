package jeha66;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreateTable
{
	@Id
	 int Student_Id;
	 String Student_N;
	 String Student_E;
	 int Student_P;
	public int getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.Student_Id = student_Id;
	}
	public String getStudent_N() {
		return Student_N;
	}
	public void setStudent_N(String student_N) {
		Student_N = student_N;
	}
	public String getStudent_E() {
		return Student_E;
	}
	public void setStudent_E(String student_E) {
		Student_E = student_E;
	}
	public int getStudent_P() {
		return Student_P;
	}
	public void setStudent_P(int student_P) {
		Student_P = student_P;
	}
	
	}



