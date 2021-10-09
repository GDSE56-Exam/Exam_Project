/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.dao;

import lk.ijse.exam.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public class CrudUtil {
    public static <T> T execute(String sql,Object...args) throws SQLException, ClassNotFoundException {
        PreparedStatement stm= DBConnection.getInstance()
                .getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            stm.setObject((i+1),args[i]);
        }

        if (sql.startsWith("SELECT")){
            return (T)stm.executeQuery();
        }

        return ((T)(Boolean)(stm.executeUpdate()>0));

    }
}
