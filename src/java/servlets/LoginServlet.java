package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.User;

/**
 *
 * @author 728918
 */
public class LoginServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String parameter = request.getParameter("logout");
        
       if (request.getParameter("logout") != null){
            request.setAttribute("message", "Logged Out");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("uname"); 
        String password = request.getParameter("psswrd");
        
        if (username != null && !username.equals("") && password != null && !password.equals("")){
        
            User validate = new User();
            if (validate.login(username,password)==true){
            request.setAttribute("dasuser", username);
            getServletContext().getRequestDispatcher("/WEB-INF/mainpage.jsp").forward(request, response);
            }
            else {
                request.setAttribute("dasuser", username);
                request.setAttribute("daspass", password);                
                request.setAttribute("message", "Invlaid username or password");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
            }        
        }
        else {
            request.setAttribute("dasuser", username);
            request.setAttribute("daspass", password);                
            request.setAttribute("message", "Please fill in both username and password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
        }
    }

}
