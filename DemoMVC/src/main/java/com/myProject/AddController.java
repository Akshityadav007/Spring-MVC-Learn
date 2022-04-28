package com.myProject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myProject.service.AddService;

@Controller
public class AddController {

	// 1)
//	@RequestMapping("/add")
//	public void add() 							
//	{
//		System.out.println("I am here");
//	}

	// 2)
//	@RequestMapping("/add")						
//	public String add() {
//		return "display.jsp";
//	}

//	// 3)
//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
//		int sum = i + j;
//
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.jsp");
//		mv.addObject("result", sum);
//
//		return mv;
//	}

	// 4)
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));

		AddService as = new AddService();
		int sum = as.add(i, j);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);

		return mv;
	}

}
