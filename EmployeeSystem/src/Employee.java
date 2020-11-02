import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNumber;
	
	//CONSTRUCTOR
	
	public Employee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNumber(phoneNumber);
	}
	
	
	
	/*
	 * method
	 */
	public abstract double calculateIncome();
	
	
	//GETTER
	
	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * @return startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/*
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	// SETTER
	
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		}
	}
	/*
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} 
	}
	/*
	 * @param email
	 */
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} 
	}
	/*
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
		}
	}
	/*
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} 
	}
	
	@Override
	public String toString() {
		return "\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +  
				"\nEmail: " + email + 
				"\nStart Date: " + startDate + 
				"\nPhone Number: " + phoneNumber;
	}
}
