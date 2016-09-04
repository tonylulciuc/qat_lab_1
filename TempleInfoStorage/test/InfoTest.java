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

import templeinfostorage.acc.properties.*;

/**
 *
 * @author tonyl
 */
public class InfoTest {
    private Info m_InfoOne;
    private Info m_InfoTwo;
    
    public InfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m_InfoOne = new UserInfo();
        m_InfoTwo = new UserInfo();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /**
     * Attempts to copy all of the users information
     */
    @Test
    public void shouldCopyUsersInformation(){
        assertTrue("[failed to copy user information!]", m_InfoOne.copyInfo(m_InfoTwo));
        assertFalse("[copied data when it should not have don so.]", m_InfoOne.copyInfo(null));
    }
}
