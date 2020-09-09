package som.make.oauth2.sample.server.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("get")
public class BaseUserController {

    @RequestMapping("userInfo")
    public Map<String, String> getUser() {
        Map<String, String> map = new HashMap<>();
        map.put("username", "chengcheng");
        return map;
    }

}
