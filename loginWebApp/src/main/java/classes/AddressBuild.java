package classes;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import interfaces.AddressBuilder;


public class AddressBuild implements AddressBuilder<Object> {


	@Override
	public Person address(HttpServletRequest req) {

		
		HttpSession session = req.getSession();
		
		int i = (Integer) session.getAttribute("user");
		
		
		if(req.getParameter("type").equals("zameldowania"))
		{

			List<String> lista = new ArrayList<String>();
			lista.add(req.getParameter("country"));
			lista.add(req.getParameter("city"));
			lista.add(req.getParameter("postcode"));
			lista.add(req.getParameter("street"));
			lista.add(req.getParameter("nr"));
			PersonDB.getPersonList().get(i).setLivingAddress(lista);
		}
		
		if(req.getParameter("type").equals("korespondencyjny"))
		{
			List<String> lista = new ArrayList<String>();
			lista.add(req.getParameter("country"));
			lista.add(req.getParameter("city"));
			lista.add(req.getParameter("postcode"));
			lista.add(req.getParameter("street"));
			lista.add(req.getParameter("nr"));
			PersonDB.getPersonList().get(i).setMailAddress(lista);
		} 

		if(req.getParameter("type").equals("pracy"))
		{
			List<String> lista = new ArrayList<String>();
			lista.add(req.getParameter("country"));
			lista.add(req.getParameter("city"));
			lista.add(req.getParameter("postcode"));
			lista.add(req.getParameter("street"));
			lista.add(req.getParameter("nr"));
			PersonDB.getPersonList().get(i).setJobAddress(lista);
			
		}
		
		return null;
	}

	
	
	
	
}
