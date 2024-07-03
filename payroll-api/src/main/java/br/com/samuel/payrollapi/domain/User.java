package br.com.samuel.payrollapi.domain;
import lombok.*;
import java.io.Serializable;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}
