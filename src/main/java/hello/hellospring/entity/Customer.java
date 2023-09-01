package hello.hellospring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private Date birthday;
    private Integer age;
    private String profilePicture;
    private String gender;
    private String interests;

}
