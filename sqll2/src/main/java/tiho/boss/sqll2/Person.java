package tiho.boss.sqll2;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Embeddable
public class Person implements Serializable {
    private String name;
    private String surname;
    private Integer age;
}
