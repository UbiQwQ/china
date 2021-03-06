package blct.china.web.user.controller;

import blct.china_interface.user.service.UserService;
import blct.china_interface.user.vo.UserVo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/web/user")
public class UserController {

    @Reference(check = false)
    private UserService userService;

    @GetMapping
    public String index(Model model) {

        model.addAttribute("test",userService.queryAll());
        return "login";
    }
}
