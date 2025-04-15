package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SubController {
	//public Map<String,Object> execute (Map<String,Object> params);
	public void execute (HttpServletRequest req, HttpServletResponse resp);
	//자바에서 처리하는 게 아니고 web에서 처리하는 것이다.
}
