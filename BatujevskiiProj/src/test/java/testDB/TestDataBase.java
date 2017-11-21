package testDB;


import lib.Database;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestDataBase {
    Logger logger = Logger.getLogger(getClass());
    Database database;


    @Before
    public void setUp() throws SQLException, IOException, ClassNotFoundException {
        database = new Database("MySQL_PADB_DB", "MySQL"); // передаем стринг коннекта и тип базы
    }


    @After
    public void tearDown() throws SQLException {
        database.quit();
    }

    @Test
    public void testWithDataBase() throws SQLException {
        List<Map<String, String>> testData = database.selectTable("select login from seleniumTable");

        logger.info(testData);
  //      System.out.println(testData);
        //
       database.modifyTable("CREATE TABLE seleniumTable1 (idNumber int,login varchar(255), passWord varchar(255))");
//
//        database.modifyTable("INSERT INTO seleniumTable VALUES (2,'Assa','TEST')");
//        logger.info(database.selectTable("select login from seleniumTable where login='Assa'"));
        logger.info(database.selectTable("select login from seleniumTable1 where login='Assa'"));
    }


}
