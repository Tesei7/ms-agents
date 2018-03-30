package tesei7.ms.agents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AgentsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgentsApplication.class, args);
    }
}
