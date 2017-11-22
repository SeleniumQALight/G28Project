package suits;

import logInTest.UnvalidLoginWithParam;
import logInTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ValidLogin.class,
                UnvalidLoginWithParam.class
        }

)

public class SuitLoginPage {
}
