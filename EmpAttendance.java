package empWage;

public class EmpAttendance {
	
	public final static int IS_PRESENT = 1;
	
	public static int attendance() {
		if ((int) Math.floor(Math.random() * 10) % 2 == IS_PRESENT) {
			
			System.out.println("Employee is present: ");
			return IS_PRESENT;
		} else {
			System.out.println("Employee is absent: ");
			return 0;
			
			
			 
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation program");
		
		attendance();
		

	}

}
