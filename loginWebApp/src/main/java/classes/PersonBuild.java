package classes;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.sun.xml.internal.ws.resources.SenderMessages;

import interfaces.PersonBuilder;

//Pobieranie danych z formularza poprzez interface. Dane zapisane do Listy w PersonDB

public class PersonBuild  implements PersonBuilder<Object>  {

	public Person build(HttpServletRequest req) {
		
		//tworzenie obiektu person, a na koñcu dodanie go do listy obiektow
		Person person = new Person();
		
		//sprawdzenie czy któreœ z pól nie jest puste
		if(req.getParameter("username").isEmpty()){ return null;}
		if(req.getParameter("password").isEmpty()){ return null;}
		if(req.getParameter("email").isEmpty()){ return null;}
		
		//sprawdzenie czy istnieje user z tak¹ sam¹ nazw¹ co tworzony
		for (int i=0; i < PersonDB.getPersonList().size() ; i++ ) {
			if(req.getParameter("username").equals(PersonDB.getPersonList().get(i).getUserName()))
			{
				return null;
			}
		}
		
		//pobranie danych z formularza
		person.setUserName(req.getParameter("username"));
		person.setPassword(req.getParameter("password"));
		person.setEmail(req.getParameter("email"));
		person.setPrivilage("u");

		//dodanie danych do listy
		//personList.addToList(person);
	
		
		
		return person;
	}

	
	

	

	
	
}
