package demo.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppUserRequest {

    @NotBlank(message = "Email required")
    @Email(message = "Email must be in correct format")
    private String email;

    @NotBlank(message = "Name required")
    @Size(max = 32, message = "Name must be shorter than 32 signs")
    private String name;

    @NotBlank(message = "Last name required")
    @Size(max = 32, message = "Last name must be shorter than 32 signs")
    private String lastName;

    @NotBlank(message = "Password required")
    @Size(max = 32, message = "Password must be shorter than 32 signs")
    private String password;

}
