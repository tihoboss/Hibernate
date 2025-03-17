package tiho.boss.sqll2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Persons {
    @Id
    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 255)
    private String phone_number;

    @Column(nullable = false, length = 1030)
    private String city_of_living;
}