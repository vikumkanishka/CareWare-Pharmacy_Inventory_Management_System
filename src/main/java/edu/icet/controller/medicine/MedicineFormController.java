package edu.icet.controller.medicine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class MedicineFormController {
    @FXML
    private Button btnAddNewMedicine;

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
    private Label lblRole;

    @FXML
    private TableView<?> tblMedicineDetails;

    @FXML
    private TextField txtSearch;

    @FXML
    public void btnAddNewMedicineOnAction(ActionEvent event) {

    }

    public void btnUpdateMedicineOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteMedicineOnAction(ActionEvent actionEvent) {
    }
}
