package com.marinafx;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marinafx.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        double result = calculator
                .execute(Double.parseDouble(request.getParameter("n1")),
                        Double.parseDouble(request.getParameter("n2")),
                        "sum");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("operation-result.jsp");
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping("/sub")
    public ModelAndView sub(HttpServletRequest request, HttpServletResponse response){
        double result = calculator
                .execute(Double.parseDouble(request.getParameter("n1")),
                        Double.parseDouble(request.getParameter("n2")),
                        "sub");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("operation-result.jsp");
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping("/multiplication")
    public ModelAndView multiplication(HttpServletRequest request, HttpServletResponse response){
        double result = calculator
                .execute(Double.parseDouble(request.getParameter("n1")),
                        Double.parseDouble(request.getParameter("n2")),
                        "multiplication");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("operation-result.jsp");
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping("/division")
    public ModelAndView division(HttpServletRequest request, HttpServletResponse response){
        double result = calculator
                .execute(Double.parseDouble(request.getParameter("n1")),
                        Double.parseDouble(request.getParameter("n2")),
                        "division");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("operation-result.jsp");
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping("/pow")
    public ModelAndView pow(HttpServletRequest request, HttpServletResponse response){
        double result = calculator
                .execute(Double.parseDouble(request.getParameter("n1")),
                        Double.parseDouble(request.getParameter("n2")),
                        "pow");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("operation-result.jsp");
        mv.addObject("result", result);

        return mv;
    }
}
