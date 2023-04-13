package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String,Student>students;
	public UniversityDatabase() {
		this.students=new HashMap<>();
	}
	

	public void addStudent(String accountName, Student student) {
		students.put(accountName, student);
	}

	public int getStudentCount() {
		return students.size();
	}

	public String lookupFullName(String accountName) {
		Student a=students.get(accountName);
		if(a==null){
			return null;
		}else {
			return a.getFullName();
		}
		
	}

	public double getTotalBearBucks() {
		double sum=0;
		for(String an : students.keySet()) {
			Student a=students.get(an);
			sum += a.getBearBucksBalance();
		}
		return sum;
		
	}
}
