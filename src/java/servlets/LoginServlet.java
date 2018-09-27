package servlets;

import domain.User;
import domain.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 758243
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession username = request.getSession();
        if(username.getAttribute("userName") == null)
        {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("", this);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        UserService usr = new UserService();
        
        if(username.equals(" ") || username == null || password.equals("") || password == null || (usr.login(username, password)==null))
        {
            request.setAttribute("invalidLogin", "Invalid login");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
    }
}
