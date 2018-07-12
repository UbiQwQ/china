package blct.china.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    //映射跳转到login.jsp
    @GetMapping("login")
    public String index(){
        return "login";
    }
}
