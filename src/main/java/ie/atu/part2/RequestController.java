package ie.atu.part2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello how are you my dear friend.";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Howya " + name;
    }

    @GetMapping("/details")
    public String reqParam(@RequestParam String name, int age) {
        return "Hello " + name + ", you are " + age + " old.";
    }
}
