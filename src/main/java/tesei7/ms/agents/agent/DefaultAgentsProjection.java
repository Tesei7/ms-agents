package tesei7.ms.agents.agent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "defaultAgentsProjection", types = { Agent.class })
public interface DefaultAgentsProjection {
    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();

    String getEmail();

    String getPhone();
}
