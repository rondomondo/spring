
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

// @Controller
//@RequestBody
//@ResponseBody

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String hello() {
        return "Hello World, DK has Spring Boot on the line";
    }
    
    @PostMapping("/echo")
    String echo() {
        return "Back at ya";
    }

}
