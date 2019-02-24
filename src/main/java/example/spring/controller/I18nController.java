package example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class I18nController {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping(value = "/i18n")
    public String i18n(@RequestParam(value = "locale",required = false) String local){

        //抓取i18n的值
        if("zh_TW".equals(local)){
            System.out.println("message: " + messageSource.getMessage("my.i18n.name",null, Locale.TRADITIONAL_CHINESE));
        }else if("en_US".equals(local)){
            System.out.println("message: " + messageSource.getMessage("my.i18n.name",null, Locale.ENGLISH));
        }

        return "i18n";
    }
}
