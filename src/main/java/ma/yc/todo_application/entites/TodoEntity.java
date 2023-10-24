package ma.yc.todo_application.entites;

import jakarta.persistence.*;
import lombok.*;
import ma.yc.todo_application.enums.Status;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title ;
    private String Description ;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date createdAt = new Date();
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private UserEntity user;

}
