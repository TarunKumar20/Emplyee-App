package com.tarun.registration;



import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginRegister() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginDAOImpl cd = new LoginDAOImpl();
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		
		String submitType = request.getParameter("submit");
		
		Login c = cd.getLogin(userName, password);
		
		if (submitType.equals("login") && c!=null && c.getName()!=null) {
			
			request.setAttribute("message", c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		}else if (submitType.equals("register")) {
			
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertLogin(c);
			
			request.setAttribute("successMessage", "Registration Done, Now you can Login to the System..");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "Not a Registered user, Click on Register..!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
