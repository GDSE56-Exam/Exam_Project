/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.bo.custom;

import lk.ijse.exam.dto.CustomerDTO;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public interface CustomerBO {
    public boolean saveCustomer(CustomerDTO dto)throws Exception;
}
