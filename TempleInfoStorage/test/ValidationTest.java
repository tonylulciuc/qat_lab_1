/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import templeinfostorage.validate.*;

/**
 *
 * @author tonyl
 */
public class ValidationTest {
    Validate m_Number;
    Validate m_Name;
    
    public ValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m_Number = new NumberAsString();
        m_Name   = new NameAsString();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void shouldRecogniseNumber(){
        assertTrue("failed to recognise the number 123", m_Number.validate("123"));
    }
    
    @Test
    public void shouldNotRecogniseNumberInput(){
        assertFalse("recognised the value nln323lwkk5", m_Number.validate("nln323lwkk5"));
        assertFalse("recognised the value 123 123",     m_Number.validate("123 123"));
        assertFalse("recognised the value #$%@#$",      m_Number.validate("#$%@#"));
        assertFalse("recognised the value nln323lwkk5", m_Number.validate(null));
    }
    
    @Test
    public void shouldRecogniseName(){
        assertTrue("failed to recognise the name billy", m_Name.validate("billy"));
    }
    
    @Test
    public void shouldNotRecogniseNameInput(){
        assertFalse("recognised the value 312412",      m_Name.validate("312412"));
        assertFalse("recognised the value nln323lwkk5", m_Name.validate("nln323lwkk5"));
        assertFalse("recognised the value 123 123",     m_Name.validate("123 123"));
        assertFalse("recognised the value #$%@#$",      m_Name.validate("#$%@#"));
        assertFalse("recognised the value nln323lwkk5", m_Name.validate(null));
    }
}
