import static org.junit.jupiter.api.Assertions.*;

import org.example.EliminatingA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EliminatinginitialATest {


    //A is removed if it is present in first 2 characters
    /*1. ABCD=>BCD
     2.AACD=>CD
     3.BBAA=>BBAA
     4.AABAA=>BAA
     5.EMPTY:""=>""
     6.BACD=>BCD
     */
        EliminatingA a = null ;
        @BeforeEach
        public  void setup() {
            a= new EliminatingA();
        }

        @Test
        void testfirstA() {

            assertEquals("BCD",a.omitA("ABCD"));

        }
        @Test
        void testsecondA() {

            assertEquals("BCD",a.omitA("BACD"));

        }
        @Test
        void firstsecondA() {

            assertEquals("CD",a.omitA("AACD"));

        }
        @Test
        void noA() {

            assertEquals("BBAA",a.omitA("BBAA"));

        }
        @Test
        void firstseecondAnchars() {
            assertEquals("BAA",a.omitA("AABAA"));

        }

    }