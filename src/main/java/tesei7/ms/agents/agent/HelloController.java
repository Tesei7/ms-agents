package tesei7.ms.agents.agent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${tesei7.agents.greeting}")
    private String defaultGreeting;

    @GetMapping("/greeting")
    public String getGreeting(){
        return defaultGreeting;
    }
}
