package example.spring.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorController {


    //錯誤返回自訂的頁面
    //ExceptionHandler裡面是錯誤的class,例如IOException.class,範例直接放Exception.class
    @ExceptionHandler({Exception.class})
    public ModelAndView error(Exception ex){
        System.out.println("have error...." + ex);

        ModelAndView view = new ModelAndView("error");
        view.addObject("exc",ex);

        return view;
    }

}
