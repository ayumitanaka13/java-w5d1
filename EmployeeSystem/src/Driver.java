import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	
	// main method
	public static void main(String[] args) {

		HourlyEmployee h1 = new HourlyEmployee("Ayumi", "Tanaka", "abc@mail.com", LocalDate.of(2020, 1, 1), "123-456-789", 15.5, 20.0);
		HourlyEmployee h2 = new HourlyEmployee("Taro", "Yamada", "abc@mail.com", LocalDate.of(2020, 1, 1), "123-456-789", 20.5, 20.0);
		SalesEmployee s1 = new SalesEmployee("Hanako", "Suzuki", "123@mail.com",  LocalDate.of(1999, 1, 1), "123-456-789", 50.0, 80);
		SalesEmployee s2 = new SalesEmployee("Hoge", "Hoge", "123@mail.com",  LocalDate.of(1999, 1, 1), "123-456-789", 25.0, 100);
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(h1);
		employees.add(h2);
		employees.add(s1);
		employees.add(s2);
		
		printEmployees(employees);
	}
	
	// print method
	public static void printEmployees(ArrayList<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
