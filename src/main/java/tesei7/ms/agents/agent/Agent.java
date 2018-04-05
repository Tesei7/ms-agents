package tesei7.ms.agents.agent;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Agent {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "agent_zipcode",
            joinColumns = @JoinColumn(name = "agent_id"),
            inverseJoinColumns = @JoinColumn(name = "zipcode_id"))
    private List<ZipCode> zipCodes;
}
