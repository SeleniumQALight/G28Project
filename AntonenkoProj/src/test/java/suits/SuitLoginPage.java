package suits;


import loginTest.InvalidLoginWithParam;
import loginTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ValidLogin.class,
                InvalidLoginWithParam.class
        }
)
public class SuitLoginPage {

}
