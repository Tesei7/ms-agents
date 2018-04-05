package tesei7.ms.agents.agent;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "zip_code")
public class ZipCode {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "zip_code")
    private String zipCode;
    @ManyToMany(mappedBy = "zipCodes")
    private List<Agent> agents;
}
