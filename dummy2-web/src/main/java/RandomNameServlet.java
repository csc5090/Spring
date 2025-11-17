package src.main.java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
import net.datafaker.Faker;

@WebServlet("/random-name")
public class RandomNameServlet extends HttpServlet {

   public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException   
   {
         Faker faker = new Faker();
         String randomName = faker.name().fullName();         

         String tamplate = "<html><body><h1>random name: %s</h1></body></html>";
         String content = String.format(tamplate, randomName);
         resp.getWriter().println(content);

   }

}