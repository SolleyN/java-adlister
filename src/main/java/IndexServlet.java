import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ads")
public class IndexServlet extends HttpServlet {

    private ListAdsDao adsDao = new ListAdsDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Ads adsdao = DaoFactory.getAdsDao();

        List<Ad> ads = adsdao.all();
        request.setAttribute("ads", ads);

        request.getRequestDispatcher("/Ads/index.jsp").forward(request, response);
    }

}
