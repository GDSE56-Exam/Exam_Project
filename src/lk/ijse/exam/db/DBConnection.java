/*
        *
        *  * ----------------------------------------------------------------------------------------------------------------
        *  * copyright (c) GDSE-Exam. All rights received.
        *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
        *  *  *----------------------------------------------------------------------------------------------
        *  *
        *
        */
/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/

package lk.ijse.exam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam_GIT", "root", "1212");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {

        return (dbConnection==null)?(dbConnection= new DBConnection()):(dbConnection);
    }

    public Connection getConnection(){
        return connection;
    }
}
