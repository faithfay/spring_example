package example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Controller
public class FileController {

    @RequestMapping("/uploadfile")
    public String upload(Map<String,Object> map, @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println("OriginalFilename: " + file.getOriginalFilename());
        System.out.println("Size: " + file.getSize());
        System.out.println("InputStream: " + file.getInputStream());

        map.put("fileName",file.getName());
        return "fileupload";
    }
}
