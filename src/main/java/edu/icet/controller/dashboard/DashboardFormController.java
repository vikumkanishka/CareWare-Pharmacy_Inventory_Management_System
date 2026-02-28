package edu.icet.controller.dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import javax.swing.event.TreeModelEvent;
import java.io.IOException;
import java.net.URL;

public class DashboardFormController {

    @FXML
    private Button btnCustomer;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnMedicine;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnPOS;

    @FXML
    private Button btnSupplier;

    @FXML
    private AnchorPane dashRoot;

    @FXML
    void btnCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {

    }

    @FXML
    void btnHelpOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnMedicineOnAction(ActionEvent event) {
        try {

            URL resource = this.getClass().getResource("/view/Medicine.fxml");

            assert resource != null;

            Parent parent = FXMLLoader.load(resource);


            dashRoot.getChildren().clear();

            dashRoot.getChildren().add(parent);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) {

    }

    @FXML
    void btnPOSOnAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) {

    }

    public void btnSalesOnAction(ActionEvent actionEvent) {
    }
}
