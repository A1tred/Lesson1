package human;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HumanTest {

    Human man = new Human("Ivan", "Ivanovich", "Ivanov", 33);
    Human woman = new Human();

    @Test
    void setFirstName() {
        woman.setFirstName("Julia");
        assertEquals("Julia", woman.getFirstName(), () -> "Should return firstname.");
    }

    @Test
    void getFirstName() {
        assertNull(woman.getFirstName(), () -> "Should return firstname.");
    }

    @Test
    void setSecondName() {
        woman.setSecondName("Sergeevna");
        assertEquals("Sergeevna", woman.getSecondName(), () -> "Should return secondname.");
    }

    @Test
    void getSecondName() {
        assertNull(woman.getSecondName(), () -> "Should return secondname.");
    }

    @Test
    void setLastName() {
        woman.setLastName("Smirnova");
        assertEquals("Smirnova", woman.getLastName(), () -> "Should return lastname.");
    }

    @Test
    void getLastName() {
        assertNull(woman.getLastName(), () -> "Should return lastname.");
    }

    @Test
    void setAge() {
        woman.setAge(21);
        assertEquals(21, woman.getAge(), () -> "Should return age.");
    }

    @Test
    void getAge() {
        assertEquals(33, man.getAge(), () -> "Should return age.");
    }

    @Test
    void testToString() {
        assertEquals("FIO: Ivanov Ivan Ivanovich. AGE: 33 year(s).", man.toString(), () -> "Should return FIO and age.");
    }

    @Test
    void testAllGet() {
        assertAll("Should return firstname, secondname, lastname and age.",
                () -> assertEquals("Ivan", man.getFirstName()),
                () -> assertEquals("Ivanovich", man.getSecondName()),
                () -> assertEquals("Ivanov", man.getLastName()),
                () -> assertEquals(33, man.getAge()),
                () -> assertEquals("FIO: Ivanov Ivan Ivanovich. AGE: 33 year(s).", man.toString())
        );
    }

}