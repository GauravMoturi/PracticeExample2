package pe2;

import java.util.*;

public class Hospital {

	Director director;
	Administrator administrator;
	List<PhysicianAdministrator> physicianAdministrator = new ArrayList<PhysicianAdministrator>();
	List<Physician> Physician = new ArrayList<Physician>();
	List<Volunteer> Volunteer = new ArrayList<Volunteer>();
	List<Patient> Patient = new ArrayList<Patient>();

	public Hospital(Director director) {
		this.director = director;
	}

	public Director getHospDirector() {
		return director;
	}

	public boolean addAdministrator(PhysicianAdministrator admin1) {

		return null != null;
	}

	public Object hirePhysician(Physician physician) {
		return physician;
	}

	public List<Physician> extractAllPhysicianDetails() {
		return Physician;
	}

	public void resignPhysician(Physician physician1) throws NoSpecialtyException {
		Physician.remove(physician1);
	}

	public List<Patient> extractAllPatientDetails() {
		return Patient;
	}

	public Object admitPatient(Patient patient) {
		return Patient.add(patient);
	}

	public Object dischargePatient(Patient patient) {
		return Patient.remove(patient);
	}

	public Object hireVolunteer(Volunteer v0) {

		return null;
	}

	public void resignVolunteer(Volunteer v0) throws NoVolunteerException {
		if (Volunteer.size() < 5) {
			if (Volunteer.contains(v0) && Volunteer.size() > 1) {
				this.Volunteer.remove(v0);
			} else {
				throw new NoVolunteerException();
			}
		}
	}

	public List<Patient> extractAllVolunteerDetails() {
		return null;
	}

}

class Person {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected String gender;
	protected String address;
	int NOP;

	public Person(String firstName, String lastName, int age, String gender, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class Patient extends Person implements Comparable<Patient> {
	private Physician Physician;

	public Patient(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	public String getName() {
		return firstName + ", " + lastName;
	}

	static int patientID = 999;

	public int getPatientID() {
		return patientID + 1;
	}

	public String toString() {
		String print = String.format("Patient [%d, [%s, %s, %d, %s, %s]]", getPatientID(), firstName, lastName,
				getAge(), getGender(), getAddress());
		return print;
	}

	public Object getAssignedPhysician() {

		return null;
	}

	public boolean clearPatientRecord() {

		return null != null;
	}

	public void setAssignedPhysician(Physician physician1) {
		this.setPhysician(physician1);

	}

	public Physician getPhysician() {
		return Physician;
	}

	public void setPhysician(Physician physician) {
		Physician = physician;
	}

	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Employee extends Person {

	public Employee(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	static int employeeID = 99;

	public int getEmployeeID() {
		return employeeID;
	}

	public static int addEmployeeID() {
		return employeeID + 1;
	}
}

class Volunteer extends Employee {

	public Volunteer(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	public String getName() {

		return firstName + ", " + lastName;
	}

}

class SalariedEmployee extends Employee {
	public SalariedEmployee(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	double salary;
	String speciality;
}

class Physician extends SalariedEmployee implements Comparable<Physician> {

	public Physician(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	private double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return firstName + ", " + lastName;
	}

	public void setSpecialty(String speciality) {
		this.speciality = speciality;
	}

	public String getSpecialty() {
		return speciality;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		String print = String.format("Physician [[[%d,[%s, %s, %d, %s, %s]], %.1f]]", getEmployeeID(), firstName,
				lastName, age, gender, getAddress(), getSalary());
		return print;
	}

	@Override
	public int compareTo(Physician physician) {
		return this.getName().compareTo(physician.getName());
	}

}

class Administrator extends SalariedEmployee {

	public Administrator(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

}

class Director extends Administrator {
	static int size;
	static int NOD = 0;
	static int counter = 0;
	List<PhysicianAdministrator> physicianAdministrator = new ArrayList<PhysicianAdministrator>();

	public Director(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		Employee.employeeID = addEmployeeID();

	}

	public boolean assignAdministrator(PhysicianAdministrator admin1) {
		if (this.physicianAdministrator.size() < 3) {
			this.physicianAdministrator.add(admin1);
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		if (counter > 1) {
			NOD++;
		} else {
			NOD = 1;
		}
		counter++;
		return NOD;
	}

}

class PhysicianAdministrator extends Administrator {
	String adminSpecialityType;

	public PhysicianAdministrator(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		Employee.employeeID = addEmployeeID();
	}

	public String getAdminSpecialtyType() {

		return adminSpecialityType;
	}

	public void setAdminSpecialtyType(String adminSpecialityType) {
		if (adminSpecialityType == "Immunology" || adminSpecialityType == "Dermatology"
				|| adminSpecialityType == "Neurology") {
			this.adminSpecialityType = adminSpecialityType;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return firstName + ", " + lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		String print = String.format("PysicianAdministrator [[[%d,[%s, %s, %d, %s, %s]], %.1f], %s]", getEmployeeID(),
				firstName, lastName, getAge(), getGender(), getAddress(), getSalary(), getAdminSpecialtyType());
		return print;
	}

}

class NoSpaceException extends Exception {
	public NoSpaceException() {
		super();
	}
}

class NoVolunteerException extends Exception {
	public NoVolunteerException() {
		super();
	}
}

class NoSpecialtyException extends Exception {
	public NoSpecialtyException() {
		super();
	}
}