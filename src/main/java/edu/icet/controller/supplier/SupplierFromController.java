package edu.icet.controller.supplier;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SupplierFromController {

    @FXML
    private Button btnAddNewMedicine;

    @FXML
    private Button btnDeleteMedicine;

    @FXML
    private Button btnUpdateMedicine;

    @FXML
    private TableColumn<?, ?> colBatchNumber;

    @FXML
    private TableColumn<?, ?> colBrand;

    @FXML
    private TableColumn<?, ?> colBuyingPrice;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colCreatedAt;

    @FXML
    private TableColumn<?, ?> colExpiryDate;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colQuantity;

    @FXML
    private TableColumn<?, ?> colReOrderLevel;

    @FXML
    private TableColumn<?, ?> colSupplierID;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private DatePicker dateCreatedAt;

    @FXML
    private DatePicker dateExpiryDate;

    @FXML
    private Label lblRole;

    @FXML
    private TableView<?> tblSupplierDetails;

    @FXML
    private TextField txtBatchNo;

    @FXML
    private TextField txtBrand;

    @FXML
    private TextField txtBuyingPrice;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TextField txtReOrderLevel;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    private TextField txtSupplierId;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    void btnAddNewMedicineOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteMedicineOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateMedicineOnAction(ActionEvent event) {

    }

}

