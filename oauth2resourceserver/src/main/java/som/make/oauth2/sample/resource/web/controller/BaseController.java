package som.make.oauth2.sample.resource.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("get")
public class BaseController {

    @RequestMapping("userInfo")
    public Map<String, String> base() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getPrincipal().toString());
        Map<String, String> map = new HashMap<>();
        map.put("username", "chengcheng");
        return map;
    }

}
