/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg.apc.jmeter.vizualizers;

import kg.apc.jmeter.util.TestJMeterUtils;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author z000205
 */
public class TotalTransactionsPerSecondGuiTest
{

    public TotalTransactionsPerSecondGuiTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        TestJMeterUtils.createJmeterEnv();
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getMenuCategories method, of class TotalTransactionsPerSecondGui.
     */
    @Test
    public void testGetMenuCategories()
    {
        System.out.println("getMenuCategories");
        TotalTransactionsPerSecondGui instance = new TotalTransactionsPerSecondGui();
        Collection result = instance.getMenuCategories();
        assertTrue(result.isEmpty());
    }
}
