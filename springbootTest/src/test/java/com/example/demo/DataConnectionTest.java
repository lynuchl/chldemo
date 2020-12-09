/*
author:chaohl
*/
package com.example.demo;

//import org.junit.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class DataConnectionTest {

    /*
    JDBCDatasourceTest
     */
    @Autowired
    private DataSource dataSource;

    /*
    jdbcTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void JdbcTemplateTest()throws SQLException{

//        jdbcTemplate.execute("select * from user");
//        jdbcTemplate.query("select * from user",)
        System.out.println("dataSourceName:"+dataSource.getClass().getName());
        List<Map<String, Object>>lists= jdbcTemplate.queryForList("select * from user");
        System.out.println(lists.toString());
    }




//    @Test
//    public void JDataTest() throws SQLException {
////        dataSource.getConnection()
//        System.out.println(dataSource.getClass().getName());
//
//        Connection connection = dataSource.getConnection();
//        try (PreparedStatement preparedStatement = connection.prepareStatement("select * from user")) {
//            // ... add parameters to the SQL query using PreparedStatement methods:
//            //     setInt, setString, etc.
//            try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    // ... do something with result set
//                    int id = resultSet.getInt("id");
//                    String username = resultSet.getString("username");
//                    System.out.println("id:" + id + "\n" + "username:" + username);
//
//
////                    System.out.println(resultSet.getString(1));
//                }
//            }
//        } catch (SQLException e) {
//            // ... handle SQL exception
//        }
//
//    }
}
