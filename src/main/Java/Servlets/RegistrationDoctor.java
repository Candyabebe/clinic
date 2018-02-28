package Servlets;

import ClinicBeansImplementation.Logic;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//@WebService(urlPatterns("RegistrationDoctor"))

public class RegistrationDoctor extends HttpServlet {

    @Inject
    @Named("Logic")
    private Logic logic;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Logic",logic);
        req.getRequestDispatcher("DoctorRegistrtion").forward(req,resp);
    }
}
