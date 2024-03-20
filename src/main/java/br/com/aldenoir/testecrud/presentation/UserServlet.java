
package br.com.aldenoir.testecrud.presentation;

import br.com.aldenoir.testecrud.domainmodel.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovani.ajusto
 */
@WebServlet("/users")
public class UserServlet extends HttpServlet{
 private List<User> users = new ArrayList<>();
 private int idCounter= 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if(action == null || action.equals("")){
                       req.getRequestDispatcher("/edit.jsp").forward(req,resp);

        } else if(action.equals("edit")){
            String id = req.getParameter("id");
            User user = this.users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
            req.setAttribute("user",user);
            req.getRequestDispatcher("/edit.jsp").forward(req,resp);
        } 
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    
    if(action==null || action.equals("")){
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        User user = new User();
        user.setId(Integer.valueOf(this.idCounter++).toString());
        user.setName(name);
        user.setEmail(email);
        users.add(user);
        resp.sendRedirect(req.getContextPath() + "/user");

    } else if(action.equals("update")){
     String id = req.getParameter("id");
     String name = req.getParameter("name");
     String email = req.getParameter("email");
     User user = this.users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
     if(user != null){
         user.setName(name);
         user.setEmail(email);
     }
      resp.sendRedirect(req.getContextPath() + "/user");
        
    } else if (action.equals("delete")){
             String id = req.getParameter("id");
             this.users.removeIf(u -> u.getId().equals(id));
             resp.sendRedirect(req.getContextPath() + "/user");


    }
        
        
    }
    
    
 
 
    
    
}
