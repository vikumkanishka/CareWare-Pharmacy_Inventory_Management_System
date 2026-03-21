package edu.icet.controller.supplier;

import com.jfoenix.controls.JFXTextField;
import edu.icet.service.SupplierService;
import edu.icet.service.impl.SupplierServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class SupplierFromController implements Initializable {

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCompanyName;

    @FXML
    private TableColumn<?, ?> colCreatedAt;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private Label lblRole;

    @FXML
    private TableView<?> tblSupplierDetails;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtCompanyName;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPhone;

    @FXML
    private JFXTextField txtSearch;

    SupplierService supplierService = new SupplierServiceImpl();

    @FXML
    void btnAddOnAction(ActionEvent event) {
        Integer id = Integer.valueOf(txtId.getText());
        String name = txtName.getText();
        String companyName = txtCompanyName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();

        supplierService.addSupplier(id, name, companyName, email, phone, address);
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtId.clear();
        txtName.clear();
        txtCompanyName.clear();
        txtPhone.clear();
        txtEmail.clear();
        txtAddress.clear();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        supplierService.deleteSupplier(Integer.valueOf(txtId.getText()));
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        Integer id = Integer.valueOf(txtId.getText());
        String name = txtName.getText();
        String companyName = txtCompanyName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();

        supplierService.updateSupplier(id, name, companyName, email, phone, address);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
