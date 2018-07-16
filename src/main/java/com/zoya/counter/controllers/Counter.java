package com.zoya.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Counter {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
	    Integer count = (Integer) session.getAttribute("count");
	    if(count==null || count ==0) {
	    	count=1;
	    }
	    else {
	    	count++;
	    }
	    
	    session.setAttribute("count",count);
		return "index";
	}
	
	@RequestMapping("/counter")
	public String count() {
	
	return "count";
	}
	
	@RequestMapping("/reset")
	public String Reset(HttpSession session) {
		 session.setAttribute("count",0);
	return ("redirect:/counter") ;
	}
	
	@RequestMapping("/double")
	public String DoubleTheCount(HttpSession session) {
	    Integer count = (Integer) session.getAttribute("count");
	    if(count==null || count ==0) {
	    	count=1;
	    }
	    else {
	    	count=count + 1;
	    }
	    
	    session.setAttribute("count",count);
		return "count2";
	}

	
}
