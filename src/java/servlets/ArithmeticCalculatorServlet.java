package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        if (request.getParameter("first") != null && request.getParameter("second") != null) {
            try {
                int number1 = Integer.parseInt(request.getParameter("first"));
                int number2 = Integer.parseInt(request.getParameter("second"));
                
                request.setAttribute("first", number1);
                request.setAttribute("second", number2);

                if (request.getParameter("operation").equals("add")) {
                    request.setAttribute("message", number1 + number2);
                } else if (request.getParameter("operation").equals("minus")) {
                    request.setAttribute("message", number1 - number2);
                } else if (request.getParameter("operation").equals("multiply")) {
                    request.setAttribute("message", number1 * number2);
                } else if (request.getParameter("operation").equals("divide")) {
                    request.setAttribute("message", (double) number1 / number2);
                }
            } catch (Exception ex) {
                request.setAttribute("message", "Invalid");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

}
