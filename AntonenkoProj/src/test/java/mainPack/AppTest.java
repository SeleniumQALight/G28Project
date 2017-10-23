package mainPack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App. Change 1
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case TestCaseAnt4
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested antonenkoTest
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * Antonenko Comment Comment
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
