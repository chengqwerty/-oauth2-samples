package som.make.oauth2.resource2.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class BaseController {

    @RequestMapping("user")
    public String user() {
        return "abc";
    }

}
