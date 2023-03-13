import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OutcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String outcome = request.getParameter("outcome");
        if (outcome.equals("win")) {
            request.getRequestDispatcher("/correct.jsp").forward(request, response);
        } else if (outcome.equals("loss")) {
            request.getRequestDispatcher("/incorrect.jsp").forward(request, response);
        }
    }
}
