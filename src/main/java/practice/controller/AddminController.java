package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AddminController {

    @GetMapping("/admin")
    public String adminP(){

        return "Admin Controller";
    }
}
