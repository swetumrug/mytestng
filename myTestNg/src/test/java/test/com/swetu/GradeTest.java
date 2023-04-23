/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.swetu;

import com.mycompany.mytestng.Grade;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class GradeTest {
    Grade grade; ///Declare
    Grade grade1;
    
    public GradeTest() {
    }

    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        grade = new Grade(60, 80, 90);   // Instantiation
        grade1 = new Grade(30,40,50);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testMath(){
        assertEquals(grade.getMath(), 60);
    }
    
    @Test
    public void testSci(){
        assertEquals(grade.getSci(), 80);
    }
    @Test
    public void testEnglish(){
        assertEquals(grade.getEng(), 90);
    }
    
    @Test
    public void testTotal(){
        assertEquals(grade.getTotal(), 230);
    }
    
    @Test
    public void testGrade(){
        assertEquals(grade.getGrade(), "Pass");
    }
    
    @Test
    public void testGradefail(){
        assertEquals(grade1.getGrade(), "Fail");
    }
    
    @Test
    public void testToString(){
        String result = "Grade{math=60, sci=80, eng=90}";
        assertEquals(grade.toString(), result);
    }
    
    
    
}
