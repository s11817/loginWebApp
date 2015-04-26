package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.LoginCheck;
import classes.PersonDB;



@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public LogServlet() {
        super();

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		
		HttpSession session = request.getSession();
		


		
		LoginCheck check = new LoginCheck();
		check.check(request);
		
		
		int s = (Integer) session.getAttribute("log");
		if(s == 1){
			
			//tworzenie pustych adresów
			int i = (Integer) session.getAttribute("user");
			List<String> lista = new ArrayList<String>();
			lista.add("");
			lista.add("");
			lista.add("");
			lista.add("");
			lista.add("");
			PersonDB.getPersonList().get(i).setLivingAddress(lista);
			PersonDB.getPersonList().get(i).setMailAddress(lista);
			PersonDB.getPersonList().get(i).setJobAddress(lista);
			
			
			response.sendRedirect("addressForm.jsp");
			
			
		}		
		
		response.sendRedirect("loginAgain.jsp");


		
		
		
	
	}

}
