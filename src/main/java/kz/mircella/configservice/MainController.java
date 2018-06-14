package kz.mircella.configservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/main")
    String main(Map<String, Object> model){
        return "main";
    }

    @RequestMapping("/test")
    @ResponseBody
    String test(){
        return "test";
    }
}
