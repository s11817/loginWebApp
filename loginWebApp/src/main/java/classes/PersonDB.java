package classes;

import java.util.ArrayList;

public class PersonDB {

	
	//Lista obiektów klasy Person(czyli username, pass itd)
	public static ArrayList<Person> personList = new ArrayList<Person>();
	
	
	public static ArrayList<Person> getPersonList() {
        return personList;
    }
   
    public void addToList( Person person ) {
    	personList.add( person );
    }
    public void printList() {
        System.out.println( personList );
    }
	
	
}
