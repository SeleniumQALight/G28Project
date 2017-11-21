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

// работа с базой данных
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
        // переменная для результаnf testData
        List<Map<String, String>> testData
                //= database.selectTable("select * from seleniumTable");
                = database.selectTable("select login from seleniumTable");
        //logger.info(testData);
        logger.info(testData.get(1));

        // creating base
        //database.modifyTable("CREATE TABLE seleniumTable (idNumber int,login varchar(255), passWord varchar(255))");

        //create person
        database.modifyTable("INSERT INTO seleniumTable VALUES (2,'max','pass')");
        database.selectTable("select * from seleniumTable where login='max'");
    }



}
