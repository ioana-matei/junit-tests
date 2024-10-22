package com.opentext.mada;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GraderTest {


//
//    @Test
//   public void fiftyNineShouldReturnF () {
//        Grader grader = new Grader();
//        System.out.println("-------------------fiftyNineShouldReturnF--------------------------");
//        assertEquals('F',grader.determineLetterGrade(59));
//    }
//
//    @Test
//    public void sixtyNineShouldReturnD () {
//        Grader grader = new Grader();
//        System.out.println("-------------------sixtyNineShouldReturnD--------------------------");
//        assertEquals('D',grader.determineLetterGrade(69));
//    }
//
//    @Test
//    @Disabled
//    public void seventyNineShouldReturnC () {
//        Grader grader = new Grader();
//        System.out.println("-------------------seventyNineShouldReturnC--------------------------");
//        assertEquals('C',grader.determineLetterGrade(79));
//    }
//
//    @Test
//    public void eightyNineShouldReturnB () {
//        Grader grader = new Grader();
//        System.out.println("-------------------eightyNineShouldReturnB--------------------------");
//        assertEquals('B',grader.determineLetterGrade(89));
//    }
//
//    @Test
//    public void ninetyNineShouldReturnA () {
//        Grader grader = new Grader();
//        System.out.println("-------------------ninetyNineShouldReturnA--------------------------");
//        assertEquals('A',grader.determineLetterGrade(99));
//    }
//
//    @Test
//    public void eightyShouldReturnB () {
//        Grader grader = new Grader();
//        System.out.println("-------------------eightyShouldReturnB--------------------------");
//        assertEquals('B',grader.determineLetterGrade(80));
//    }

    @ParameterizedTest
    @ValueSource(ints = {25,50,75})
    public void parameterizedGrade(int grade) {
        System.out.println("-------------------ParameterizedTest - " + grade + "--------------------------");
        Grader grader = new Grader();
        System.out.println("-------------------ParameterizedTest - " + grader.determineLetterGrade(grade) + "--------------------------");
        assertEquals('C',grader.determineLetterGrade(grade));
    }

    @Test
    public void zOneHundredShouldReturnA () {
        Grader grader = new Grader();
        System.out.println("-------------------zOneHundredShouldReturnA--------------------------");
        assertEquals('A',grader.determineLetterGrade(100));
    }

//    @Test
//    public void negativeOneShouldReturnIllegalArgumentException() {
//        Grader grader = new Grader();
//        System.out.println("-------------------zOneHundredShouldReturnA--------------------------");
//        assertThrows(IllegalArgumentException.class, () -> {
//            grader.determineLetterGrade(-1);
//        });
//    }

//    @Test
//    public void parameterCase() {
//        Grader grader = new Grader();
//        assertEquals(System.getProperty("param"),String.valueOf(grader.determineLetterGrade(80)));
//
//    }

//    @Test
//    public void environmentCase() {
//        Grader grader = new Grader();
//        System.out.println("-------------------environmentCase--------------------------");
//        System.out.println(System.getProperty("ENV"));
//    }
//
//    @Test
//    public void $data_Driven_Properties() {
//        Grader grader = new Grader();
//        System.out.println("-------------------$data_Driven_Properties--------------------------");
//        System.out.println(System.getProperty("DataSet1"));
//    }
//
//    @Test
//    public void _predefinedParameters() {
//        Grader grader = new Grader();
//        System.out.println("-------------------_predefinedParameters--------------------------");
//        System.out.println(System.getProperty("#sctm_keywords"));
//        System.out.println(System.getProperty("SILK Test Name"));
//
//    }

    @Test
    public void systemParameters() {
        Grader grader = new Grader();
        System.out.println("-------------------systemParameters--------------------------");
        System.out.println(System.getProperty("#sctm_execdef_name"));
        System.out.println(System.getProperty("#sctm_product"));
        System.out.println(System.getProperty("#sctm_test_name"));
        System.out.println(System.getProperty("#sctm_test_id"));

    }

}
