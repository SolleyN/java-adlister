

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String crustType = request.getParameter("crust_type");
        String sauceType = request.getParameter("sauce_type");
        String sizeType = request.getParameter("size_type");
        String[] toppings = request.getParameterValues("toppings");
        String deliveryAddress = request.getParameter("delivery_address");

        // Create pizza order object
        PizzaOrder order = new PizzaOrder(crustType, sauceType, sizeType, toppings, deliveryAddress);

        // Print order details to console
        System.out.println("Pizza Order Details:");
        System.out.println("Crust Type: " + order.getCrustType());
        System.out.println("Sauce Type: " + order.getSauceType());
        System.out.println("Size Type: " + order.getSizeType());
        System.out.println("Toppings: ");
        for (String topping : order.getToppings()) {
            System.out.println("- " + topping);
        }
        System.out.println("Delivery Address: " + order.getDeliveryAddress());

        // Forward to JSP for display
        request.setAttribute("order", order);
        request.getRequestDispatcher("/WEB-INF/views/pizza-order.jsp").forward(request, response);
    }
}
