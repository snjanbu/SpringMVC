package org.work.maven.SpringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.work.maven.Service.AddService;
import org.work.maven.Service.ServiceImpl;

@Controller
public class AddController {
	
	@Autowired
	private AddService addService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(@RequestParam("t1") int a,@RequestParam("t2") int b) {
		int result=addService.add(a, b);
		ModelAndView modelAndViewObject =new ModelAndView();
		modelAndViewObject.setViewName("display");
		modelAndViewObject.addObject("result", result);
		return modelAndViewObject;
	}

}
