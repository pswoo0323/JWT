package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import practice.dto.JoinDTO;
import practice.service.JoinService;

@ResponseBody
@Controller
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService){//joinservice 주입

        this.joinService = joinService;
    }
    @PostMapping("/join")
    public String JoinProcess(JoinDTO joinDTO){

        joinService.JoinProcess(joinDTO);

        return "ok";
    }
}
