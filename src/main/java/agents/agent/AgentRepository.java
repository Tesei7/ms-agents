package agents.agent;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AgentRepository extends PagingAndSortingRepository<Agent, Long> {
    List<Agent> findByEmail(@Param("email") String email);
}
