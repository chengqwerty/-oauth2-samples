package som.make.oauth2.sample.client.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseController {

    @RequestMapping()
    public String base() {
        return "This is base";
    }

}
