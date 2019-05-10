package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.HWService;

@Controller
public class ControllerImpl implements HWController {

    @Autowired
    private HWService service;

    @RequestMapping(value =  "/" , method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView model = new ModelAndView();
        model.addObject("message",service.getInformation());
        model.setViewName("welcome_page");
        return model;
    }
}
