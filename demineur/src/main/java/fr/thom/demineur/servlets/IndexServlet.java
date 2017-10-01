package fr.thom.demineur.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

    private static final long  serialVersionUID = 917660700862796105L;
    public static final String VIEW_INDEX       = "/WEB-INF/index.jsp";

    public void deGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VIEW_INDEX ).forward( request, response );
    }
}
