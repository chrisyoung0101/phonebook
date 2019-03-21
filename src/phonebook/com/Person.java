package phonebook.com;

import java.util.Scanner;

//`this` refers to the current object

public class Person implements Comparable<Person> {

//  List properties specific to a Person
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String tel;
	private Address address;
	
	
//	Constructor to initialize Person properties
	
	
	
	public Person(String fullName, String tel, Address address) {
		this.fullName = fullName;
		this.tel = tel;
		this.address = address;
		
		
		
	}
	
	
	
        
        
		
		

// 	List any methods specific to the Person
	//getters & setters
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFullName() {
		if(middleName == null) {
		this.fullName = firstName + " " + lastName;
		return this.fullName;
		} 
		
		this.fullName = firstName + " " + middleName + " " + lastName;
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
		String[] splitName = fullName.split(" ", 4);
		firstName = splitName[0];
				
		if(splitName.length == 4) {
			middleName = splitName[1] + " " + splitName[2];
		}
		if(splitName.length == 3) {
			middleName = splitName[1];
		}
		
		lastName = splitName[splitName.length - 1];
		
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//Custom Methods 
	
	//reformat telephone 
	
	//expected results
//	First Name: John Middle Name:  Last Name: Doe Telephone: (636)-643-5698 
//	Address:  Street:  114 Market St City:  St Louis State:  MO Zip:  63403
	
//display Person Object 
//note : perhaps add logic or method to reformat tel inside of toSting()
	
	public String toString() {
		
		char open = '(';
		char close = ')';  
		char h = '-';
		
		char[] charArr = tel.trim().toCharArray();
		char[] newCharArr = new char[charArr.length + 4];
		
		newCharArr[0] = open;
		newCharArr[1] = charArr[0];
		newCharArr[2] = charArr[1];
		newCharArr[3] = charArr[2];
		newCharArr[4] = close;
		newCharArr[5] = h;
		newCharArr[6] = charArr[3];
		newCharArr[7] = charArr[4];
		newCharArr[8] = charArr[5];
		newCharArr[9] = h;
		newCharArr[10] = charArr[6];
		newCharArr[11] = charArr[7];
		newCharArr[12] = charArr[8];
		newCharArr[13] = charArr[9];
		
		 
			String string = new String(newCharArr);
			
		
		return "First Name: " + firstName + 
				" Middle Name: " + middleName +
				" Last Name: " + lastName +
				" Telephone: " + string + 
				" Address" + address;
	}
	
//	public void displayInfo() {
//		System.out.println(" First Name: " + firstName + 
//							" Middle Name: " + middleName +
//							" Last Name: " + lastName +
//							" Telephone: " + tel
//							);
//	}	
	
	public Person[] upDateArray(Person[] oldArray, Person newPerson) {
		Person[] newStringArray = new Person[oldArray.length + 1]; 
		for(int i = 0; i < oldArray.length; i++) {
			newStringArray[i] = oldArray[i];
		}
		newStringArray[newStringArray.length - 1] = newPerson;
		
		return newStringArray;
	}








		@Override
		public int compareTo(Person person) {
			// TODO Auto-generated method stub
			return firstName.compareTo(person.getFirstName());
		}
	
		
		
	

	
}
