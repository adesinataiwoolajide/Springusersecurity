package HomeController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(){
//        Using generated security password: 4782da59-765e-483e-8f14-a8d3ed5c66c1
        return "index";
    }

    @RequestMapping("/login")
//    @RequestMapping( value = "/login", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/logout-success")
    public String logout(){

        return "logout.jsp";
    }

}
