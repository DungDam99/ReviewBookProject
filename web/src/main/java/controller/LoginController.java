package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.BookEntityService;

@Controller
public class LoginController {
    @Autowired
    private BookEntityService bookEntityService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(){
        return "home_page";
    }
}
