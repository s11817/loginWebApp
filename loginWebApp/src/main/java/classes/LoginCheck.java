package classes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import interfaces.LoginChecker;

public class LoginCheck implements LoginChecker<Object> {

	@Override
	public Person check(HttpServletRequest req) {
		
		
		HttpSession session = req.getSession();
		
		
		
		//Person person = new Person();
		
		
		//sprawdzenie czy któreœ z pól nie jest puste
		if(req.getParameter("username").isEmpty()){ return null;}
		if(req.getParameter("password").isEmpty()){ return null;}
		
		
		//sprawdzenie usera i jego hasla
		for (int i=0; i < PersonDB.getPersonList().size() ; i++ ) {
			if(req.getParameter("username").equals(PersonDB.getPersonList().get(i).getUserName()))
			{
				if(req.getParameter("password").equals(PersonDB.getPersonList().get(i).getPassword()))
				{ session.setAttribute("log", 1);
				session.setAttribute("user", i);
				return null;
			}}
			session.setAttribute("log", 0);
		}
		
		

	
	
		
		
		return null;
	}

}
