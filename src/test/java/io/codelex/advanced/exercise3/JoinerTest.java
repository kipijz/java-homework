package io.codelex.advanced.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void isSeperatedByStars() {
        Joiner joiner = new Joiner("*");
        String joinedNumbers = joiner.join(1, 2, 3, 4);

        Assertions.assertEquals("1*2*3*4", joinedNumbers);
    }

    @Test
    void doesntPrintJoinerForLastCharacter() {
        Joiner joiner = new Joiner("=");
        String joinedStrings = joiner.join("yes", "no", "maybe");

        Assertions.assertEquals('e', joinedStrings.charAt(joinedStrings.length() - 1));
    }

    @Test
    void containsFiveCharacters() {
        Joiner joiner = new Joiner(")");
        String joinedStrings = joiner.join(9, 8, 1);

        Assertions.assertEquals(5, joinedStrings.length());
    }
}
