package suite;

import logInTest.UnValidLogInWithParamsWithDataFromExel;
import logInTest.UnValidTest;
import logInTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)  //класс со сьютом
@Suite.SuiteClasses(        //какие классы использовать
        {
                ValidLogin.class,
                UnValidTest.class,
                UnValidLogInWithParamsWithDataFromExel.class

        }
)


public class souiteLoginPage {

}
