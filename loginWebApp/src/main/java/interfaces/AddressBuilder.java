package interfaces;

import javax.servlet.http.HttpServletRequest;


public interface AddressBuilder<T> {
	
	T address(HttpServletRequest req);

	

}
