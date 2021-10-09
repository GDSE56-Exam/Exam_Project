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

import lk.ijse.exam.entity.SuperEntity;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public interface CrudDAO<T extends SuperEntity, ID> extends SuperDAO {
    public boolean save(T t) throws Exception;

}
