package com.man.Stampede.servlet;

import com.man.Stampede.dto.StampedeDto;
import com.man.Stampede.service.StampedeService;
import com.man.Stampede.service.StampedeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Stampede")
public class StampedeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String eventName = req.getParameter("eventName");
        String noOfDeaths = req.getParameter("noOfDeaths");
        String noOfInjuries = req.getParameter("noOfInjuries");

        StampedeDto stampedeDto = new StampedeDto();
        stampedeDto.setEventName(eventName);
        stampedeDto.setNoOfDeaths(Integer.parseInt(noOfDeaths));
        stampedeDto.setNoOfInjuries(Integer.parseInt(noOfInjuries));

        StampedeService stampedeService = new StampedeServiceImpl();
        stampedeService.save(stampedeDto);

        resp.getWriter().write("Stampede case recorded successfully.");
    }
}
