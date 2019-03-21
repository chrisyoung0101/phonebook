package phonebook.com;

import java.util.Arrays;

//STUCK ON : trying to call Address() from within Person() and pass in arrayStr.  Not working. 

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Person[] persons = new Person[0];
		//GENERAL : program runs until user selects exit option 
		int selection = 0;
		//while user doesn't hit 11, keep running below code
		while(selection != 10) {
			//display choices
			String[] prompts = {
					"1 - Add New Record", 
					"2 - Search by first name", 
					"3 - Search by last name", 
					"4 - Search by full name", 
					"5 - Search by telephone : format --> 3145556677", 
					"6 - Search by city or state : e.g. --> St. Louis or MO", 
					"7 - Delete a record for given telephone number", 
					"8 - Update record for a given telephone number", 
					"9 - Show all records in asc order", 
					"10 - Exit"
					};
			
			
			for(int i = 0; i < prompts.length; i++) {
				System.out.println(prompts[i]);
				
				
			}
		
			System.out.println("*****************");
			System.out.println("Make A Selection :");
			Scanner input = new Scanner(System.in);
			
			selection = input.nextInt();
		
		
		//NOTE: create scanner in main() scopes outside of `switch`.  Prevents having to create a Scanner for each case
		//NOTE: once `.nextLine()` is used with Scanner, if we want to read input of int type, we may need to create a new Scanner
		Scanner input1 = new Scanner(System.in);
		
		
		switch (selection) {
		//(1)Add New Record
		case 1:
			//(1)Add New Record
			
			
			System.out.println("Add New Record :" + "\nFormat : John Doe, 114 Market St, St Louis, MO, 63403, 6366435698 ");
			
			String str1 = input1.nextLine();
			
			String[] arrayStr = str1.split(",", 6); 
			
			Address address = new Address(arrayStr[1], arrayStr[2],arrayStr[3], arrayStr[4]);
			Person person = new Person(arrayStr[0], arrayStr[5], address);
			//person.setAddress(address);
			person.setFullName(arrayStr[0]);
			
			
			persons = person.upDateArray(persons, person);
			
			System.out.println("Number of records  :" + persons.length);
			
			
			break;
			
		case 2: 
			//(2)Search for first name 
			
			System.out.println("Search by first name : ");
			
			String inquiry = input1.nextLine();
			
			
			
			//USE `.equals()` to compare strings & other objects 
			//using `toString()` in our classes to print info 
			for(int i = 0; i < persons.length; i++) {
				String name = persons[i].getFirstName();
				if(name.equals(inquiry)) {
					System.out.println(persons[i]);
				}
			} 
			
			
			
			
			break;
			
		case 3: 
			//(3) Search by last name
			System.out.println("Search by last name : ");
			
			String inquiry1 = input1.next();
			
			
			
			//USE `.equals()` to compare strings & other objects 
			//using `toString()` in our classes to print info 
			for(int i = 0; i < persons.length; i++) {
				String name = persons[i].getLastName();
				if(name.equals(inquiry1)) { 
					System.out.println(persons[i]);
				}
			} 
			
			
			break;
			
		case 4:
			//(4) Search by full name 
			System.out.println("Search by full name : ");
			
//			System.out.println(persons[0].getFullName());
//			String name = persons[0].getFullName();
//			System.out.println(name);
			
			String inquiry2 = input1.nextLine();
			
			
			
			//USE `.equals()` to compare strings & other objects 
			//using `toString()` in our classes to print info 
			for(int i = 0; i < persons.length; i++) {
				//System.out.println("***********" + persons[i]);
				String name = persons[i].getFullName();
				if(name.equals(inquiry2)) { 
					System.out.println(persons[i]); 
				}
			} 
			
			
			break;
		
		case 5: 
			System.out.println("Search by telephone number : \n(Format = 1112223333)");
			
			String inquiry3 = input1.next();
			
			//USE `.equals()` to compare strings & other objects 
			//using `toString()` in our classes to print info 
			for(int i = 0; i < persons.length; i++) {
				String telephone = persons[i].getTel();
				if(telephone.trim().equals(inquiry3)) {
					System.out.println(persons[i]);
				}
			}
			break;
		
		case 6:
			System.out.println("Search by city or state : \n(Format = Los Angeles or CA)");
			
			String inquiry4 = input1.nextLine();
			
			//USE `.equals()` to compare strings & other objects 
			//using `toString()` in our classes to print info 
			for(int i = 0; i < persons.length; i++) {
				String city = persons[i].getAddress().getCity();
				String state = persons[i].getAddress().getState();
				if(city.trim().equals(inquiry4.trim()) || state.trim().equals(inquiry4)) {
					System.out.println(persons[i]);
				}
			}
			break;
			
			
		case 7: 
			//(7) Enter Tel to delete
			System.out.println("Enter 10 digit telephone number to delete \nFormat : 6365557777");
			String telToDelete = input.next();
			
			int delIndex = 0;
			
			//System.out.println("RETURNED : " + telToDelete);
			
			System.out.println("persons[0].getTel() :" + persons[0].getTel());
		//Person[] copyArr = new Person[0];
			for(int i = 0; i < persons.length; i++) {
				String tel = persons[i].getTel().trim();
				if(tel.equals(telToDelete)) {
					//System.out.println(persons[i]);
					delIndex = i;
					break;
				}
			}
					//Object to remove
//					for(int i = 0; i < charArray.length; i++) {
//						if(charArray[i] != removeChar) {
//							result = result + charArray[i];
//						}
//					}
			
					Person[] newArr = new Person[persons.length - 1]; 
					for(int j = 0; j < persons.length; j++) {
						if(j!= delIndex) {
							newArr[j] = persons[j];
							//copyArr = newArr;
							
						}
						
					}
					
				
			for (Person person2 : newArr) {
				System.out.println(person2);
			}
			
			break;
			
		case 8:
			//(8) update record for a given tel number 
			System.out.println("Enter telephone number: "); 
			
			String telNumber = input1.nextLine();  
			
			System.out.println("Enter new info to update : (Format :John Doe, 114 Market St, St Louis, MO, 63403, 6366435698) ");
			
			String update = input1.nextLine();
//			Scanner input2 = new Scanner(System.in);
//			String update = input2.nextLine();
			
			for(int i = 0; i < persons.length; i++) {
				String telephone = persons[i].getTel();
				
				if(telephone.trim().equals(telNumber)) {
					String[] arrayStr1 = update.split("," , 6);
					Address address1 = new Address(arrayStr1[1], arrayStr1[2],arrayStr1[3], arrayStr1[4]);
					Person person1 = new Person(arrayStr1[0], arrayStr1[5], address1);
					person1.setFullName(arrayStr1[0]);
//					Person[] newStringArray = new Person[persons.length]; 
//					for(int j = 0; j < persons.length; i++) {
//						newStringArray[j] = persons[j];
//					}
//					newStringArray[i] = person1;
					persons[i] = person1;
					break;
				}
			} 
			
//			String[] arrayStr = str1.split(",", 6); 
//			
//			Address address = new Address(arrayStr[1], arrayStr[2],arrayStr[3], arrayStr[4]);
//			Person person = new Person(arrayStr[0], arrayStr[5], address);
//			
//			person.setFullName(arrayStr[0]);
			
			
			break;
			
		case 9:
			
			System.out.println("********* Ascending Order ***********");
			
			Arrays.sort(persons);
			
			
			
			for(Person element : persons) {
					System.out.println(element);
				}
			
			
			break;
			
			
		}
		
		
		
		

	}

}
}
