package at.ac.fhcampuswien;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void checkPasswordLong(){
        String password = "23111dHasasdasdasd32e123134124124124124124#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkPasswordShort(){
        String password = "231";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkConsecutiveLowerCase() {
        String password = "AAAAAAAAA23114#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkDigit() {
        String password = "AAAAAAAAA#er#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkConsecutiveUpperCase() {
        String password = "aaaaaaa3114#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkConsecutiveNumbers() {
        String password = "2333abdseHas#";

        assertEquals(true, App.checkPassword(password));
    }
    @Test
    public void checkIncreasingNumbers() {
        String password = "23abdseHas#";

        assertEquals(true, App.checkPassword(password));
    }

}