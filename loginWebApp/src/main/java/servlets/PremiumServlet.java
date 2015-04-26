package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.PersonDB;


@WebServlet("/PremiumServlet")
public class PremiumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PremiumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		


		PersonDB personList = new PersonDB();
		
		//sprawdzenie dla którego usera zmienic privilage i czy zmienic czy nie
		for (int i=0; i < personList.getPersonList().size() ; i++ ) {
			if(request.getParameter("username").equals(personList.getPersonList().get(i).getUserName()))
			{	
				if(request.getParameter("premium").equals("set"))
				{
					personList.getPersonList().get(i).setPrivilage("p");
					response.getWriter().println("User: "+request.getParameter("username")+" has changed to premium user");
				}else {personList.getPersonList().get(i).setPrivilage("u");
				response.getWriter().println("User: "+request.getParameter("username")+" has changed to normal user");
			}
			
		}
		
	
		}
	}

}
