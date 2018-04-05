package tesei7.ms.agents.agent;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = DefaultAgentsProjection.class)
public interface AgentRepository extends PagingAndSortingRepository<Agent, Long> {
    List<Agent> findByEmail(@Param("email") String email);
    @RestResource(path = "findByZipCode")
    List<Agent> findByZipCodes_ZipCode(@Param("zipCode") String zipCode);
}
