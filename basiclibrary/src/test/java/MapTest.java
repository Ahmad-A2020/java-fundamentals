import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapTest {

    private Library mainClass;

    @BeforeEach
    public void setUp() throws Exception {
        mainClass = new Library();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(20, mainClass.Maps(weeklyMonthTemperatures),
                "Regular multiplication should work");
    }

    }

//    @Test
//    public void testMultiplyWithNegative() {
//        assertEquals(-20, student.Maps(4,-5),
//                "Negative multiplication should work");
//    }
//
//    @RepeatedTest(5)
//    @DisplayName("Ensure correct handling of zero")
//    public void testMultiplyWithZero() {
//        assertEquals(0, student.multiply(0,5), "Multiple with zero should be zero");
//        assertEquals(0, student.multiply(5,0), "Multiple with zero should be zero");
//    }
//}
