import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect("/ads");
        } else {
            request.setAttribute("error", "Invalid login");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

}
