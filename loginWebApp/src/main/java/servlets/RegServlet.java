package servlets;


import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import classes.Person;
import classes.PersonBuild;
import classes.PersonDB;



@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;


public void init()
{
	   
	    if(PersonDB.getPersonList().size()==0){
		Person person = new Person();
		PersonDB.getPersonList().add(person); 
		PersonDB.getPersonList().get(0).setUserName("admin");
		PersonDB.getPersonList().get(0).setPassword("a");
		PersonDB.getPersonList().get(0).setPrivilage("a");}
}

	public RegServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {


	

		
		//zmienne dla sprawdzenia czy dodanie usera siê udalo
		int dlugoscPrzed, dlugoscPo;
		dlugoscPrzed = PersonDB.getPersonList().size();
		
		//pobieranie danych z formularza
		PersonBuild build = new PersonBuild();
		PersonDB.personList.add(build.build(request));
		
		
		//sprawdzenie czy udalo siê dodac usera
		dlugoscPo = PersonDB.getPersonList().size();
		if(dlugoscPrzed == dlugoscPo) response.sendRedirect("tryAgain.jsp");
		
		
		
		
		//wyœwietlenie wszystkich username z listy
		response.sendRedirect("index.jsp");
		

		
		
		

	}

}
