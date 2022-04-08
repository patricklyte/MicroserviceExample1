package ch.meng.patrick.demo1;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
class LocationEntityMother {

    public static LocationEntity horw() {
        return LocationEntity.builder()
                .name("Horw")
                .zip("6048")
                .build();
    }

    public static LocationEntity luzern() {
        return LocationEntity.builder()
                .name("Luzern")
                .zip("6000")
                .build();
    }
}
