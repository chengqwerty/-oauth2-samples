package som.make.oauth2.sample.server.web.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("get")
public class BaseUserController {

    @RequestMapping("userInfo")
    public Map<String, String> getUser(HttpServletRequest request, HttpServletResponse response) {
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String name = enumeration.nextElement();
            System.out.println(request.getHeader(name));
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Map<String, String> map = new HashMap<>();
        map.put("username", "chengcheng");
        return map;
    }

}
