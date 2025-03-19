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
    @EmbeddedId
    private Person id;

    @Column(name = "phone_number",nullable = false, length = 255)
    private String phoneNumber;

    @Column(name = "city_of_living", nullable = false, length = 255)
    private String cityOfLiving;
}
