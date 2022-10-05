package empWage;

public class PartTimeEmpWage {
	
	public final static int IS_PRESENT = 1;
	public final static int IS_PART_TIME = 2;
	public static int WAGE_PER_HOUR = 20;
	public static int FULL_TIME_HOUR = 8;
	public static int PART_TIME_HOUR = 4;
	

	public static int Attendance() {
		
		if ((int) Math.floor(Math.random() * 10) % 2 == IS_PRESENT) {
			int empAttendance = (int) Math.floor(Math.random() * 10) % 3;
			if (empAttendance == IS_PRESENT) {
				System.out.println("Employee is Present: ");
				System.out.println("Employee daily wage is " +(FULL_TIME_HOUR * WAGE_PER_HOUR));
				return IS_PRESENT;
			}else if (empAttendance == IS_PART_TIME) {
				System.out.println("Employee is Part time");
				System.out.println("Employee daily wage is : "+(PART_TIME_HOUR * WAGE_PER_HOUR));
				return IS_PART_TIME;
				
			}else {
				System.out.println("Employee is absent");
				System.out.println("Employee Daily Wage is 0");
				return 0;
				
			}
			
		}
		return FULL_TIME_HOUR;
		
		
	}
     public static void main(String[] args) {
         System.out.println("Welcome to Employee Wage Computation");
           Attendance();
     }
	}


