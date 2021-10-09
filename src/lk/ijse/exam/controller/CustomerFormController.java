/*
 *
 *  * ----------------------------------------------------------------------------------------------------------------
 *  * copyright (c) GDSE-Exam. All rights received.
 *  *  Licensed under the Sri Lankan Information License.See License.txt in the project root for the license.
 *  *  *----------------------------------------------------------------------------------------------
 *  *
 *
 */

package lk.ijse.exam.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.exam.bo.custom.CustomerBO;
import lk.ijse.exam.dto.CustomerDTO;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 09/10/2021
 **/
public class CustomerFormController {
    public TextField txtId;
    public TextField txtAddress;
    public TextField txtSalary;

    public TextField txtName;
    CustomerBO bo;

    public void saveOnAction(ActionEvent actionEvent) throws Exception {

        boolean isSaved = bo.saveCustomer(
                new CustomerDTO(txtId.getText(),
                        txtName.getText(),
                        txtAddress.getText(),
                        Double.parseDouble(txtSalary.getText()))
        );
        System.out.println(isSaved);
    }

}
