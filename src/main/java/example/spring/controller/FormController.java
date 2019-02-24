package example.spring.controller;

import example.spring.bean.UserBase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    //POJO的方式得到屬性值
    @RequestMapping("/userbase")
    public String userBase(Model model, UserBase userBase){

        System.out.println(userBase);
        model.addAttribute("userinfo",userBase);

        return "form";
    }
}
