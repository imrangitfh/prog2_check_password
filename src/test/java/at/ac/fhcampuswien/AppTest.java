package at.ac.fhcampuswien;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private static final String VALID_PASSWORD_REGEX_LENGTH =  "^.{8,25}$";
    private static final String VALID_PASSWORD_REGEX_LETTERS =  "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*$";
    private static final String VALID_PASSWORD_REGEX_NUMBERS =  "^(?=.*[0-9])[a-zA-Z0-9]*$";
    private static final String VALID_PASSWORD_REGEX_SYMBOLS =  ".*[()#$?!%/@].*";

    App a1 = new App();

    @Test
    public void checkPasswordLength(){
        a1.setPassword("123456556655655678");
        boolean actual = a1.password.matches(VALID_PASSWORD_REGEX_LENGTH);

        assertTrue(actual);
    }
    @Test
    public void checkPasswordLetters(){
        a1.setPassword("Aasdd2324esadd3");
        boolean actual = a1.password.matches(VALID_PASSWORD_REGEX_LETTERS);

        assertTrue(actual);
    }
    @Test
    public void checkPasswordNumbers(){
        a1.setPassword("nonumberaddedtothis");
        boolean actual = a1.password.matches(VALID_PASSWORD_REGEX_NUMBERS);

        assertTrue(actual);
    }
    @Test
    public void checkPasswordSymbols(){
        a1.setPassword("nonumbera!ddedtothis");
        boolean actual = a1.password.matches(VALID_PASSWORD_REGEX_SYMBOLS);

        assertTrue(actual);
    }
}