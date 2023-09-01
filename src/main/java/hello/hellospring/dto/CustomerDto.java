package hello.hellospring.dto;

import hello.hellospring.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDto {

    private String name;
    private String password;
    private Date birthday;
    private Integer age;
    private String profilePicture;
    private String gender;
    private String interests;

    public Customer entityToDto(CustomerDto dto){
        return Customer.builder()
                .name(dto.getName())
                .password(dto.getPassword())
                .birthday(dto.getBirthday())
                .age(dto.getAge())
                .profilePicture(dto.getProfilePicture())
                .gender(dto.getGender())
                .interests(dto.getInterests())
                .build();
    }
}
