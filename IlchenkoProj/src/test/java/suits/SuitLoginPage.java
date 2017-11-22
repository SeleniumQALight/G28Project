package suits;


import loginTest.UnValidLogInWithParams;
import loginTest.ValidLogIn;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ValidLogIn.class,
                UnValidLogInWithParams.class
        }
)
public class SuitLoginPage {
}
