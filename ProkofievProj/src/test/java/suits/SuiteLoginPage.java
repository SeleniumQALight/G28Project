package suits;

import logInTest.UnvalidLogInWithParam;
import logInTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ValidLogin.class,
                UnvalidLogInWithParam.class
        }
)

public class SuiteLoginPage {
}
