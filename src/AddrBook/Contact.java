package AddrBook;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;
	/**
	 * Creating an Parmeterised Construnctor
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phoneNo
	 * @param email
	 * super()- is a reference variable that is used to refer parent class constructors.
	 */

	public Contact(String firstName, String lastName, String address, String city, String state, String zip,String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * It Returns the value into String Format
	 */
	@Override
	public String toString() {
		return firstName + " " + lastName + " : " + address + " : " + city + " : " + state + " : " + zip + " : "+ phoneNo + " : " + email + "\n";
	}
	/**
	 * It return Boolean Value
	 * It Return True, If the Argument is not Null
	 * Else It Return false
	 */
	@Override
	public boolean equals(Object o) {
		Contact contact = (Contact) o;
		if ((this.firstName).equals(contact.firstName) && (this.lastName.equals(contact.lastName)))
			return true;
		else
			return false;
	}

}
