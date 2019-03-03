package example.spring.controller;

import example.spring.bean.ValidBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class VaildController {

//    @ModelAttribute
//    public void goValidExample(Model model){
//        System.out.println("ModelAttribute......");
//        model.addAttribute("validexp",new ValidBean());
//    }

    //第一次新增,跳轉到新增表單
    @RequestMapping("/govalid")
    public String goValid(Model model){
        //第一次要給一個空的bean物件
        //如果是用ModelAttribute,第一次新增因為DB不會有資料所以也是傳空的bean否則頁面會出錯
        model.addAttribute("validexp",new ValidBean());
        return "valid";
    }

    //submit表單驗證範例
    //@Valid bean後面只能接BindingResult or Errors
    //表單要用spring taglib,這樣輸入錯返回時原本輸入正確的值還會再
    //form裡面的modelAttribute or commandName必須一定要設定,配合Model返回的key值
    @RequestMapping("/validexample")
    public String validExample(Model model, @Valid @ModelAttribute("validexp") ValidBean validBean, BindingResult result){

        if(result.getErrorCount() > 0){
            for(FieldError error:result.getFieldErrors()){
                System.out.println(error.getField() + ">>" + error.getDefaultMessage());
            }
        }

        model.addAttribute("validexp",validBean);
        return "valid";
    }
}
