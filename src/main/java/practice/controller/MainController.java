package practice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import practice.config.SecurityConfig;

import java.util.Collection;
import java.util.Iterator;

@Controller
@ResponseBody
public class MainController {

    @GetMapping("/")
    public String mainP(){

        String email = SecurityContextHolder.getContext().getAuthentication().getName();
                            //세션 현재 사용자 아이디
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        //세션 현재 사용자 role
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Iterator<? extends GrantedAuthority> iter = authorities.iterator();
        GrantedAuthority auth = iter.next();
        String role = auth.getAuthority();

       // String name = SecurityContextHolder.getContext().getAuthentication().getName();

        return "Main Controller : "+ email + role;
    }
}
