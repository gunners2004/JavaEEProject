import cartPacage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart)session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity =Integer.parseInt( request.getParameter("quantity"));
        if (cart == null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart",cart);


       // Integer count = (Integer) session.getAttribute("count");
        //count = 1;
        //if (count==null)
          //  session.setAttribute("count",1);
        //else{
          //  session.setAttribute("count",count +1);}
       // String name = request.getParameter("name");
       // PrintWriter pr = response.getWriter();
        //pr.println("<html>");
      //  pr.println("<h1> Hello"+name+ "</h1>");
      //pr.println("<h1> You count is:</h1>");
        //pr.println("</html>");
        //response.sendRedirect("/testJsp.jsp");
        getServletContext().getRequestDispatcher("showCart.jsp").forward(request,response);

    }
}
