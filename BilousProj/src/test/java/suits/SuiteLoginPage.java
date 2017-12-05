package suits;

import loginTest.UnvalidLoginWithDataFromExcel;
import loginTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {
                ValidLogin.class,
                UnvalidLoginWithDataFromExcel.class
        }
)
public class SuiteLoginPage {

}
