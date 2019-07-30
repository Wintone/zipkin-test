package demo.msa.zipkin.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        try{
            Thread.sleep(new Random().nextInt(1000));
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
