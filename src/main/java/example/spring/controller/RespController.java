package example.spring.controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RespController {

    //自訂錯誤代碼及訊息
    @ResponseStatus(reason = "Test Error",value = HttpStatus.NOT_FOUND)
    @RequestMapping("/resp")
    public String resp(){

        new Exception();

        return "error";

    }
}
