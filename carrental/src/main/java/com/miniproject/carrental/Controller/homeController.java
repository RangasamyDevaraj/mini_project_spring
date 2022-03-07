package com.miniproject.carrental.Controller;




import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.miniproject.carrental.dao.CarBo;
import com.miniproject.carrental.dao.Carrepo;
import com.miniproject.carrental.dao.addcarrepo;
import com.miniproject.carrental.model.Car;
import com.miniproject.carrental.model.User;
@RestController
public class homeController
{
	@Autowired
	Carrepo repo;
	@Autowired
	addcarrepo carrepo;
	@Autowired
   CarBo cb; 
	
	@RequestMapping("home")
	public ModelAndView home(User user)
	{
	 ModelAndView mv = new ModelAndView();
	 mv.addObject("obj",user);
	 mv.setViewName("home");
		return mv;
	}
	@RequestMapping("register")
	public ModelAndView register(User user)
	{
	 ModelAndView mv = new ModelAndView();
	 mv.addObject("obj",user);
	 mv.setViewName("register");
		return mv;
	}
	@RequestMapping("login")
	public ModelAndView login(User user)
	{
	 ModelAndView mv = new ModelAndView();
	 mv.addObject("obj",user);
	 mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/adduser")
	public ModelAndView adduser(User user)
	{
		ModelAndView mv = new ModelAndView();
		repo.save(user);
		mv.setViewName("register");
		return mv;
	}
	@RequestMapping("admin")
	public ModelAndView Admin(User user)
	{
	 ModelAndView mv = new ModelAndView();
	 
	 mv.addObject("obj",user);
	 mv.setViewName("admin");
		return mv;
	}
	@RequestMapping("vendor")
	public ModelAndView vendor(User user)
	{
	 ModelAndView mv = new ModelAndView();
	 
	 mv.addObject("obj",user);
	 mv.setViewName("vendor");
		return mv;
	}
	
	

          
@RequestMapping(value="checkuser", method=RequestMethod.POST)
public ModelAndView m5(HttpServletRequest req,Model model,HttpSession session ) {
	ModelAndView mv=new ModelAndView("userpage");;
	String username=req.getParameter("email");
	String pass=req.getParameter("pass");
	User u=repo.getById(username);
	if(u.equals(null))
	  {
			model.addAttribute("message","Username is wrong");
	 	mv=new ModelAndView("login");
	  }
   else {
      if(username.equals(u.getEmail()))
       {	
        if(pass.equals(u.getMobile()))
		{
		model.addAttribute("message",u.getUsername());
		req.getSession().setAttribute("username", u.getEmail());
		mv=new ModelAndView("userpage");
		}
	else
		{
		model.addAttribute("message","Password is Wrong!");
		mv=new ModelAndView("login");
		}
       }
      else
      {
    	  model.addAttribute("message","Username is wrong");
		 	mv=new ModelAndView("login");
      }
   }
	return mv;
}

	@RequestMapping(value="checkvendor", method=RequestMethod.POST)
	public ModelAndView checkuser(HttpServletRequest req,Model model,HttpSession session )
	{
		ModelAndView mv=new ModelAndView("vendorpage");;
		String username=req.getParameter("email");
		String pass=req.getParameter("mobile");
		User u=repo.getById(username);
		if(u.getUsertype()=="vendor")
		{
		if(u.equals(null))
		  {
				model.addAttribute("message","data filled is empty");
		 	mv=new ModelAndView("login");
		  }
	   else {
	      if(username.equals(u.getEmail()))
	       {	
	        if(pass.equals(u.getMobile()))
			{
			model.addAttribute("message",u.getUsername());
			req.getSession().setAttribute("username", u.getEmail());
			mv=new ModelAndView("vendorpage");
			}
		else
			{
			model.addAttribute("message"," Password is Wrong");
			mv=new ModelAndView("login");
			}
	       }
	      else
	      {
	    	  model.addAttribute("message","Username is wrong");
			 	mv=new ModelAndView("login");
	      }
	   }
	}
		return mv;
	}
	
	@RequestMapping(value="checkadmin", method=RequestMethod.POST)
	public ModelAndView checkadmin(HttpServletRequest req,Model model,HttpSession session )
	{
		ModelAndView mv=new ModelAndView("adminpage");;
		String username=req.getParameter("email");
		String pass=req.getParameter("mobile");
		User u=repo.getById(username);
		if(u.getUsertype()=="admin")
			
			
		{
		if(u.equals(null))
		  {
				model.addAttribute("message","data filled is empty");
		 	mv=new ModelAndView("login");
		  }
	   else {
	      if(username.equals(u.getEmail()))
	       {	
	        if(pass.equals(u.getMobile()))
			{
			model.addAttribute("message",u.getUsername());
			req.getSession().setAttribute("username", u.getEmail());
			mv=new ModelAndView("adminpage");
			}
		else
			{
			model.addAttribute("message"," Wrong password");
			mv=new ModelAndView("login");
			}
	       }
	      else
	      {
	    	  model.addAttribute("message","wrong username");
			 	mv=new ModelAndView("login");
	      }
	   }
	}
		return mv;
	}
	@RequestMapping("addcar")
	public ModelAndView addcar() {
		ModelAndView mv= new ModelAndView("addcar");
		
		return mv;
		
	}
	
	@RequestMapping("/addingcar")
	public ModelAndView addinguser(Car car)
	{
		ModelAndView mv = new ModelAndView();
		carrepo.save(car);
		mv.setViewName("addcar");
		return mv;
	}
	@RequestMapping(value="bookcarmini", method=RequestMethod.POST)
	public ModelAndView bookmini(Model model,HttpServletRequest req)throws Exception {
		ModelAndView mv=new ModelAndView("bookingmini");
		int day=Integer.parseInt(req.getParameter("day"));
		
		int amount;
		amount=800*day;
		 
		int DA;
		DA=amount/100*10;
		
		model.addAttribute("amount",amount);
		model.addAttribute("DA",DA);
		
		
		return mv;
	}
	@RequestMapping("hatchback")
	public ModelAndView hatch()
	{
		ModelAndView mv = new ModelAndView("hatchback");
		return mv;
	}
	@RequestMapping("sedan")
	public ModelAndView sedan()
	{
		ModelAndView mv = new ModelAndView("sedan");
		return mv;
	}
	@RequestMapping("xuv")
	public ModelAndView xuv()
	{
		ModelAndView mv = new ModelAndView("xuv");
		return mv;
	}
	@RequestMapping(value="bookcarsedan", method=RequestMethod.POST)
	public ModelAndView booksedan(Model model,HttpServletRequest req)throws Exception {
		ModelAndView mv=new ModelAndView("bookingsedan");
		int day=Integer.parseInt(req.getParameter("day"));
		
		int amount;
		amount=1000*day;
		 
		int DA;
		DA=amount/100*10;
		
		model.addAttribute("amount",amount);
		model.addAttribute("DA",DA);
		
		
		return mv;
	}
	@RequestMapping(value="bookcarxuv", method=RequestMethod.POST)
	public ModelAndView bookxuvn(Model model,HttpServletRequest req)throws Exception {
		ModelAndView mv=new ModelAndView("bookingxuv");
		int day=Integer.parseInt(req.getParameter("day"));
		
		int amount;
		amount=1000*day;
		 
		int DA;
		DA=amount/100*10;
		
		model.addAttribute("amount",amount);
		model.addAttribute("DA",DA);
		
		
		return mv;
	}
	
	@RequestMapping("/viewcars")
	public ModelAndView viewcars(Model model) throws Exception
	{
		ModelAndView mv = new ModelAndView("viewcars");
		List<Car> li=cb.getAllCars();
		System.out.println(li);
		model.addAttribute("cars",li);
		return mv;
		
	}
}

	
	
	

