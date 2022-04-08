package ch.meng.patrick.demo1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LocationEntityTests {
    @Test
    void buildHorw_IsNotNull() {
        // when
        final var location = LocationEntityMother.horw();
        // then
        assertThat(location).isNotNull();
    }

    @Test
    void buildLuzern_IsNotNull() {
        // when
        final var location = LocationEntityMother.luzern();
        // then
        assertThat(location).isNotNull();
    }
}
