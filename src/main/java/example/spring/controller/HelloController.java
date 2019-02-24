package example.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@Controller
public class HelloController {

    //抓參數檔的值
    @Value("${hello.name}")
    private String name;

    //原生Servlet API
    @RequestMapping("/servletapi")
    public void servletapi(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {

        out.write(request.getServletPath());
        out.write(response.getStatus());

    }

    //網址帶參數範例
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model, @RequestParam(name = "n",required = false) String n){
        if(n != null){
            model.addAttribute("name",n);
        }else{
            model.addAttribute("name",name);
        }
        return "hello";
    }

    //取網址的值
    @RequestMapping("/hello2/{myName}")
    public String hello2(Model model, @PathVariable("myName") String myName){
        model.addAttribute("name",myName);
        return "hello";
    }

}
