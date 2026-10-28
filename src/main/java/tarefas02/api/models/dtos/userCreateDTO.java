package tarefas02.api.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class userCreateDTO {
    
    //nome de usuario obrigatorio na criação
    @NotBlank 
    @Size (min= 2,max= 100)
    private String username;

    //senha obrigatoria na criação
    @NotBlank
    @Size (min= 8,max= 60)
    private String password;

    
}
