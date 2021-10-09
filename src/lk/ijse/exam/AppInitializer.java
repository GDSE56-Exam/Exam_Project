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
package lk.ijse.exam;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/MainForm.fxml"))));
        primaryStage.show();
    }
}
