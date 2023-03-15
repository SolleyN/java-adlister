import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        check to see if user has as user cookie in session
        if (request.getSession().getAttribute("user") != null) {
            request.getRequestDispatcher("WEB-INF/ads/profile.jsp").forward(request, response);
        } else {
            response.sendRedirect("/login");
        }
    }
}
