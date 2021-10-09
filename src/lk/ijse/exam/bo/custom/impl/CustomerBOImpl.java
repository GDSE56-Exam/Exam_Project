/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.bo.custom.impl;

import lk.ijse.exam.bo.custom.CustomerBO;
import lk.ijse.exam.dao.DaoFactory;
import lk.ijse.exam.dao.custom.CustomerDAO;
import lk.ijse.exam.dto.CustomerDTO;
import lk.ijse.exam.entity.Customer;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public class CustomerBOImpl implements CustomerBO {
    private CustomerDAO dao= DaoFactory.getInstance()
            .getDao(DaoFactory.DAOType.CUSTOMER);


    @Override
    public boolean saveCustomer(CustomerDTO dto) throws Exception {
        return dao.save(new Customer(dto.getId(),
                dto.getName(),dto.getAddress(),dto.getSalary()));
    }


}
