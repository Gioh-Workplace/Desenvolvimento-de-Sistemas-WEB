/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aldenoir.testecrud.presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author giovani.ajusto
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password =req.getParameter("password");
        
        if("admin".equals(username) && "senha".equals(password)){
        HttpSession session = req.getSession();
        session.setAttribute("username",username);
        resp.sendRedirect(req.getContextPath() + "/user");
        LOG.info("Usuário " + username + " logado!");
        } else {
         resp.sendRedirect(req.getContextPath() + "/login");   
        LOG.warn("Erro no login");
        }

        
    }
            private static final Logger LOG = LoggerFactory.getLogger(LoginServlet.class);
        
    }

    






    
