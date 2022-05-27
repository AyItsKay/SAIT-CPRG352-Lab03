package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageInput = request.getParameter("age");
        request.setAttribute("ageinput", ageInput);
                
        if(ageInput == null || ageInput == "") {
            request.setAttribute("message", "You must give your current age.");
            
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
        
        int age = 0;
        try {
            age = Integer.parseInt(ageInput);
            request.setAttribute("age", age);            
        } catch (NumberFormatException e) {
            request.setAttribute("message", "You must enter a number.");
            
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
                
        String newAge = "";
        newAge = String.format("%d", age+1);
        
        request.setAttribute("message", "You will be " + newAge +  " after your next birthday.");
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;     
    }
}
