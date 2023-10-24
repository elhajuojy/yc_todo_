package ma.yc.todo_application.entites;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String username ;
    private String email ;
    @OneToMany(mappedBy = "user" ,fetch = FetchType.EAGER)
    private Collection<TodoEntity> todoEntities = new ArrayList<>();


}
