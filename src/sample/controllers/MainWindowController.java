package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField height;

    @FXML
    private TextField diameter;

    @FXML
    private TextField ring12;

    @FXML
    private TextField ring11;

    @FXML
    private TextField ring10;

    @FXML
    private TextField ring9;

    @FXML
    private TextField ring8;

    @FXML
    private TextField ring7;

    @FXML
    private TextField ring6;

    @FXML
    private TextField ring5;

    @FXML
    private TextField ring4;

    @FXML
    private TextField ring3;

    @FXML
    private TextField ring2;

    @FXML
    private TextField ring1;

    @FXML
    private TextField bottom_center_thikness;

    @FXML
    private TextField bottom_rim_thikness;

    @FXML
    private TextField roof_thikness;

    @FXML
    private Button log_button;

    @FXML
    private Button calculate_button;

    @FXML
    private TextField insulation_weight;

    @FXML
    private TextField heater_weight;

    @FXML
    private TextField other_weight1;

    @FXML
    private TextField other_weight2;

    @FXML
    private TextField other_weight1_name;

    @FXML
    private TextField other_weight2_name;

    @FXML
    private MenuButton steel_menu;

    @FXML
    private TextField result_mass;

    @FXML
    private TextField ton_price;

    @FXML
    private TextField result_price;

    @FXML
    private Button information_button;

    @FXML
    void initialize() {
        information_button.setOnAction(event -> {
            information_button.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/sample/gui/Information.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}





//        assert height != null : "fx:id=\"height\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert diameter != null : "fx:id=\"diameter\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring12 != null : "fx:id=\"ring12\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring11 != null : "fx:id=\"ring11\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring10 != null : "fx:id=\"ring10\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring9 != null : "fx:id=\"ring9\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring8 != null : "fx:id=\"ring8\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring7 != null : "fx:id=\"ring7\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring6 != null : "fx:id=\"ring6\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring5 != null : "fx:id=\"ring5\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring4 != null : "fx:id=\"ring4\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring3 != null : "fx:id=\"ring3\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring2 != null : "fx:id=\"ring2\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring1 != null : "fx:id=\"ring1\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert bottom_center_thikness != null : "fx:id=\"bottom_center_thikness\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert bottom_rim_thikness != null : "fx:id=\"bottom_rim_thikness\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert roof_thikness != null : "fx:id=\"roof_thikness\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert stair_tower_flag != null : "fx:id=\"stair_tower_flag\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ring_stair_flag != null : "fx:id=\"ring_stair_flag\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert log_button != null : "fx:id=\"log_button\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert calculate_button != null : "fx:id=\"calculate_button\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert insulation_weight != null : "fx:id=\"insulation_weight\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert heater_weight != null : "fx:id=\"heater_weight\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert other_weight1 != null : "fx:id=\"other_weight1\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert other_weight2 != null : "fx:id=\"other_weight2\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert other_weight1_name != null : "fx:id=\"other_weight1_name\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert other_weight2_name != null : "fx:id=\"other_weight2_name\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert steel_menu != null : "fx:id=\"steel_menu\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert result_mass != null : "fx:id=\"result_mass\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert ton_price != null : "fx:id=\"ton_price\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert result_price != null : "fx:id=\"result_price\" was not injected: check your FXML file 'MainWindow.fxml'.";
//        assert information_button != null : "fx:id=\"information_button\" was not injected: check your FXML file 'MainWindow.fxml'.";
