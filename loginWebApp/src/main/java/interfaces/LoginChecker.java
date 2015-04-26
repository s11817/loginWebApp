package interfaces;

import javax.servlet.http.HttpServletRequest;

public interface LoginChecker<T> {
	
	T check(HttpServletRequest req);

}
