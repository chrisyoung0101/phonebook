package phonebook.com;

import java.util.Scanner;

//`this` refers to the current object

public class Address {

//  List properties specific to a Address
	private String street;
	private String city;
	private String state;
	private String zip;
	
//	Constructor to initialize Address class properties 
	public Address (String[] arrayStr) {
		
		Scanner input = new Scanner(System.in);
		//grab the whole line
		String str = input.nextLine();
		//System.out.println("You entered : " + inputStr);
		
		//Split str into arrays
        //String[] arrayStr = str.split(",", 6); 
        
      //print elements of arrayStr
//      for (String element : arrayStr) {
//      	System.out.println("arrayStr From Address : " + element);
//      }
      
      
	};
	
	
	//Address address = new Address(street, city, state, zip);
	public Address (String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	
	}

	
//	List any methods specific to Address
	
	//getters & setters
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String zip() {
		return this.zip;
	}
	
	public void zip(String zip) {
		this.zip = zip;
	}
	
	//CUSTOM METHODS 
	//expected results
//	First Name: John Middle Name:  Last Name: Doe Telephone: (636)-643-5698 
//	Address:  Street:  114 Market St City:  St Louis State:  MO Zip:  63403
	//display address props 
	public String toString() {
		return " Street: " + street + 
				" City: " + city +
				" State:" + state +
				" Zip:" + zip;
							
	}
	
	
	
}
