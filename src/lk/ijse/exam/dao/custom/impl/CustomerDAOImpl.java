/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.dao.custom.impl;

import lk.ijse.exam.dao.CrudUtil;
import lk.ijse.exam.dao.custom.CustomerDAO;
import lk.ijse.exam.entity.Customer;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.execute
                ("INSERT INTO Customer VALUES(?,?,?,?)",
                        customer.getId(),customer.getName(),
                        customer.getAddress(),customer.getSalary());
    }
}
