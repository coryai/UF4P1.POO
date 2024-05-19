package model;

import main.Logable;

public class Employee extends Person implements Logable {
    private int employeeId;
    private static final int USER = 123;
    private static final String PASSWORD = "test";
    
	public Employee(String name, int numeroEmpleado) {
		super(name);
		this.employeeId = USER;
	}

	@Override
	public boolean login(int user, String password) {
		if(user == USER && password.equals(PASSWORD)) {
			System.out.println("Login correcto");
			return true;
		}else {
			System.out.println("Login incorrecto");
			return false;
		}
	}
}

