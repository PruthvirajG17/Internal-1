
package vvce.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalculateTotal() {
        int[] marks = {90, 85, 80, 95, 90};

        assertEquals(440, App.calculateTotal(marks));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(88.0, App.calculateAverage(440));
    }

    @Test
    public void testGradeAPlus() {
        assertEquals("A+", App.calculateGrade(95));
    }

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(85));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(75));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", App.calculateGrade(55));
    }

    @Test
    public void testGradeE() {
        assertEquals("E", App.calculateGrade(40));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", App.calculateGrade(30));
    }
}

