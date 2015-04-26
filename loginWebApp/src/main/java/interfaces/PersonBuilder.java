package interfaces;


import javax.servlet.http.HttpServletRequest;


public interface PersonBuilder<T> {
	
	
	T build(HttpServletRequest req);

	

}
