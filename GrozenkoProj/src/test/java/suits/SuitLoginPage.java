package suits;

import loginTest.UnValidLogInWithParams;
import loginTest.ValidLogin;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) // junit-у говорим что клас с сьютом
@Suite.SuiteClasses(  {
        ValidLogin.class,
        UnValidLogInWithParams.class
}
)
// какие классы мы хотим запустить

public class SuitLoginPage {
}
