package testDB;

import libs.Database;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class testDataBase {
    Logger logger = Logger.getLogger(getClass());
    Database database;

    @Before
    public void setUp() throws SQLException, IOException, ClassNotFoundException {
        database = new Database("MySQL_PADB_DB", "MySQL");
    }

    @After
    public void tearDown() throws SQLException {
        database.quit();
    }

    @Test
    public void testWithDataBase() throws SQLException {
        List<Map<String, String>> testData = database.selectTable("select * from seleniumTable");
        logger.info(testData.get(1));

        //database.modifyTable("CREATE TABLE seleniumTable (idNumber int,login varchar(255), passWord varchar(255))");
        database.modifyTable("INSERT INTO seleniumTable VALUES (666,'inkognito','topsecret')");
        logger.info(database.selectTable("select * from seleniumTable where login = 'inkognito'"));
    }
}
