package at.ac.fhcampuswien;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    @DisplayName("Test if password is too long")
    public void checkPasswordLong(){
        String password = "aBcde#32f89";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password is too short")
    public void checkPasswordShort(){
        String password = "23ACc#df321";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password contains lower case")
    public void checkLowerCase() {
        String password = "aBcde#32f89";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password contains digits")
    public void checkDigit() {
        String password = "AAAAAA2AAA#er#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password contains upper case")
    public void checkUpperCase() {
        String password = "aaaVaaaa3114#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password contains consecutive numbers")
    public void checkConsecutiveNumbers() {
        String password = "2333abdseHas#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    @DisplayName("Test if password contains increasing numbers")
    public void checkIncreasingNumbers() {
        String password = "23abdseHas#";

        assertEquals(true, App.checkPassword(password));
    }

}