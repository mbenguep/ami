import org.junit.jupiter.api.Test;

import javax.print.attribute.HashPrintServiceAttributeSet;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldTest {
    @Test
    void wordTest() {

        String a = "abcde";
        String b = new String(a);
        assertTrue(a.equals(b));

    }
}