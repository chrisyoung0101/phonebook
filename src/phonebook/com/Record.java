package phonebook.com;

import java.util.Scanner;

//import library.com.Customer; <--GOOD TO KNOW 

public class Record {

	//List common properties for Person & Address
	private String fullName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String tel;
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	private String[] arrayStr;
	
	
	
	
	//Constructor to set base properties
	public Record(String fullName, String street, String city, String state, String zip, String tel) {
		
		this.fullName = fullName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.tel = tel;
		
		
		
	}
	
	public Record() {
		Scanner input = new Scanner(System.in);
		//grab the whole line
		String str = input.nextLine();
		//System.out.println("You entered : " + inputStr);
		
		//Split str into arrays
        String[] arrayStr = str.split(",", 6); 
        	//split full name into first, middle & last names 
        String[] splitName = arrayStr[0].split(" ", 4);
        
        String[] addressInfo  = {arrayStr[1], arrayStr[2], arrayStr[3], arrayStr[4]};
        String[] personInfo = {arrayStr[0], arrayStr[arrayStr.length-1]};
        
      //print elements of arrayStr
//      for (String element : arrayStr) {
//      	System.out.println("arrayStr : " + element);
//      }
        
        
        
        
        //print array
        displayInfo(arrayStr);
        
        
       
      
      
	}
	
	//Getters & Setters 
	public String[] getArrayStr() {
		return arrayStr;
	}
	
	public void setArrayStr(String[] arrayStr) {
		this.arrayStr = arrayStr;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
	
	
	//CUSTOM
	
	
	
	public void displayInfo(String[] arrayStr) {
		for(String element : arrayStr) {
			System.out.println("From Record : " + element);
		}
	}
	
	
	
	
}

