package za.co.mocoder;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fundamentals Assessment Tests")
class FundamentalsTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    private String getOutput() {
        return outputStream.toString().trim().replace("\r\n", "\n");
    }

    // ============================
    // Question 1 — stayCalm
    // ============================
    @Nested
    @DisplayName("Question 1: stayCalm()")
    class StayCalmTests {

        @Test
        @DisplayName("stayCalm(2) returns true — 1 + 4 = 5 (divisible by 5)")
        void testStayCalmTwo() {
            assertTrue(Fundamentals.stayCalm(2));
        }

        @Test
        @DisplayName("stayCalm(3) returns false — 1 + 4 + 9 = 14")
        void testStayCalmThree() {
            assertFalse(Fundamentals.stayCalm(3));
        }

        @Test
        @DisplayName("stayCalm(4) returns true — sum of squares is 30")
        void testStayCalmFour() {
            assertTrue(Fundamentals.stayCalm(4));
        }

        @Test
        @DisplayName("stayCalm(6) returns false — sum of squares is 91")
        void testStayCalmSix() {
            assertFalse(Fundamentals.stayCalm(6));
        }

        @Test
        @DisplayName("stayCalm(10) returns true — sum of squares is 385")
        void testStayCalmTen() {
            assertTrue(Fundamentals.stayCalm(10));
        }
    }

    // ============================
    // Question 2 — countUpOdd
    // ============================
    @Nested
    @DisplayName("Question 2: countUpOdd()")
    class CountUpOddTests {

        @Test
        @DisplayName("countUpOdd(7) prints 1, 3, 5, 7")
        void testCountUpOddSeven() {
            Fundamentals.countUpOdd(7);
            assertEquals("1\n3\n5\n7", getOutput());
        }

        @Test
        @DisplayName("countUpOdd(6) prints 1, 3, 5 — stops before an even limit")
        void testCountUpOddSix() {
            Fundamentals.countUpOdd(6);
            assertEquals("1\n3\n5", getOutput());
        }

        @Test
        @DisplayName("countUpOdd(1) prints only 1")
        void testCountUpOddOne() {
            Fundamentals.countUpOdd(1);
            assertEquals("1", getOutput());
        }

        @Test
        @DisplayName("countUpOdd(0) prints nothing")
        void testCountUpOddZero() {
            Fundamentals.countUpOdd(0);
            assertEquals("", getOutput());
        }

        @Test
        @DisplayName("countUpOdd(11) prints 1, 3, 5, 7, 9, 11")
        void testCountUpOddEleven() {
            Fundamentals.countUpOdd(11);
            assertEquals("1\n3\n5\n7\n9\n11", getOutput());
        }
    }

    // ============================
    // Question 3 — checkPassphrase
    // ============================
    @Nested
    @DisplayName("Question 3: checkPassphrase()")
    class CheckPassphraseTests {

        @Test
        @DisplayName("null passphrase returns Invalid")
        void testNull() {
            assertEquals("Invalid", Fundamentals.checkPassphrase(null));
        }

        @Test
        @DisplayName("empty or blank passphrase returns Invalid")
        void testEmptyAndBlank() {
            assertEquals("Invalid", Fundamentals.checkPassphrase(""));
            assertEquals("Invalid", Fundamentals.checkPassphrase("     "));
        }

        @Test
        @DisplayName("passphrase shorter than 8 characters returns Weak")
        void testShort() {
            assertEquals("Weak", Fundamentals.checkPassphrase("Ab1@xyz"));
        }

        @Test
        @DisplayName("upper, lower and digits (no symbol) returns Medium")
        void testMedium() {
            assertEquals("Medium", Fundamentals.checkPassphrase("Secure2026"));
        }

        @Test
        @DisplayName("upper, lower, digits and symbol returns Strong")
        void testStrong() {
            assertEquals("Strong", Fundamentals.checkPassphrase("Secure2026#"));
        }

        @Test
        @DisplayName("long passphrase with only lowercase letters returns Weak")
        void testLowercaseOnly() {
            assertEquals("Weak", Fundamentals.checkPassphrase("justlowercase"));
        }

        @Test
        @DisplayName("missing an uppercase letter is not Medium")
        void testNoUppercase() {
            assertEquals("Weak", Fundamentals.checkPassphrase("secure2026@"));
        }
    }

    // ============================
    // Question 4 — capitaliseWords
    // ============================
    @Nested
    @DisplayName("Question 4: capitaliseWords()")
    class CapitaliseWordsTests {

        @Test
        @DisplayName("basic sentence is capitalised")
        void testBasic() {
            assertEquals("Hello World", Fundamentals.capitaliseWords("hello world"));
        }

        @Test
        @DisplayName("mixed casing is normalised")
        void testMixedCase() {
            assertEquals("Hello World", Fundamentals.capitaliseWords("hELLo wORLD"));
        }

        @Test
        @DisplayName("extra spaces are collapsed to a single space")
        void testExtraSpaces() {
            assertEquals("Java Is Fun", Fundamentals.capitaliseWords("java   is  fun"));
        }

        @Test
        @DisplayName("leading and trailing spaces are removed")
        void testLeadingTrailing() {
            assertEquals("Johannesburg Rocks", Fundamentals.capitaliseWords("  johannesburg rocks  "));
        }

        @Test
        @DisplayName("single word is capitalised")
        void testSingleWord() {
            assertEquals("Hello", Fundamentals.capitaliseWords("hello"));
        }

        @Test
        @DisplayName("null or blank input returns an empty string")
        void testNullAndBlank() {
            assertEquals("", Fundamentals.capitaliseWords(null));
            assertEquals("", Fundamentals.capitaliseWords("   "));
        }
    }
}
