package com.gihan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/health")
public class HealthController {

    @RequestMapping
    public ModelAndView servicesAvailable() {
        return new ModelAndView("health", "services", null);
    }
}
