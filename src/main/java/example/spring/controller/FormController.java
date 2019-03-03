package example.spring.controller;

import example.spring.bean.UserBase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

//帶入的是map的key值,對應userBase
//type則是map值為string,對應sessString
@SessionAttributes(value = {"userBase"},types = {String.class})
@Controller
public class FormController {

    //想像成進入前都會進到ModelAttribute方法
    //1.模擬先去DB撈取資料
    //表單中姓名不能修改,當表單輸入資訊時,姓名會被填入而不是null
    @ModelAttribute
    public void modelAttrExample(Model map){
        System.out.println("going modelAttrExample");
        UserBase userBase = new UserBase("user1","dbpassword",15);

        System.out.println("模擬DB撈到USER資訊: " + userBase.toString());
        map.addAttribute("userBase",userBase);
    }


    @RequestMapping("/maa")
    public String maaExample(@ModelAttribute("userBase") UserBase userBase){
        //姓名會從ModelAttribute中得到
        System.out.println("表單做更新: " + userBase.toString());

        return "form";
    }

    //session運用
    @RequestMapping("/session")
    public String sess(Model model){

        UserBase userBase = new UserBase();
        userBase.setName("dino");
        userBase.setAge(22);
        userBase.setPasswd("password01");

        model.addAttribute("userBase",userBase);
        model.addAttribute("sessString","hello session");

        return "form";
    }

    //POJO的方式得到屬性值
    @RequestMapping("/userbase")
    public String userBase(Model model, UserBase userBase){

        System.out.println(userBase);
        model.addAttribute("userBase",userBase);

        return "form";
    }
}
