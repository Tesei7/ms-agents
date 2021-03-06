package tesei7.ms.agents.agent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Value("${tesei7.agents.greeting}")
    private String defaultGreeting;
    @Value("${tesei7.agents.password}")
    private String password;

    @GetMapping("/greeting")
    public String getGreeting() {
        log.debug("Hello service invoked");
        return String.format("%s, your password is %s", defaultGreeting, password);
    }
}
