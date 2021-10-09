/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.bo;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public class BoFactory {


    //1st Step
    private static BoFactory boFactory;

    //2nd Step
    private BoFactory() {
    }

    //3rd Step
    public static BoFactory getInstance() {
        return (boFactory == null) ?
                (boFactory = new BoFactory()) : (boFactory);
    }

    //4th Step
    public enum BOType {
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
    }

    //5th Step
    public <T> T getBo(BOType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            case ITEM:
                return (T) new ItemBOImpl();
            case ORDER:
                return null;
            case ORDER_DETAIL:
                return null;
            default:
                return null;
        }
    }

}
