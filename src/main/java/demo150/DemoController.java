package demo150;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
@RequestMapping("/emp")
public String getEmp()
{
return "emp.jsp";	
}
@RequestMapping("/disp")
public ModelAndView  getEmpDisplay(HttpServletRequest req)
{
	ModelAndView mv=new ModelAndView("disp.jsp");

	String veid=req.getParameter("eid");
	String vename=req.getParameter("ename");
	String vesal=req.getParameter("esal");
	mv.addObject("meid",veid);
	mv.addObject("mename",vename);
	mv.addObject("mesal",vesal);	
return mv;	
}


	
	
}
