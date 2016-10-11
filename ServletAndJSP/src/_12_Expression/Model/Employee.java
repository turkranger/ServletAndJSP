package _12_Expression.Model;

public class Employee {
	private int EmpId;
	private String name;
	private Department department;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, Department department) {
		EmpId = empId;
		this.name = name;
		this.department = department;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
		
}
