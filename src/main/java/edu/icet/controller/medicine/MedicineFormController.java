package edu.icet.controller.medicine;

import edu.icet.model.dto.Medicine;
import edu.icet.service.MedicineService;
import edu.icet.service.impl.MedicineServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class MedicineFormController implements Initializable {

    MedicineService medicineService = new MedicineServiceImpl();

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
    private TableView<Medicine> tblMedicineDetails;

    @FXML
    private TextField txtSearch;

    @FXML
    public void btnAddNewMedicineOnAction(ActionEvent event) {

    }

    public void btnUpdateMedicineOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteMedicineOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colExpiryDate.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colBuyingPrice.setCellValueFactory(new PropertyValueFactory<>("buyingPrice"));
        colSupplierID.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colBatchNumber.setCellValueFactory(new PropertyValueFactory<>("batchNumber"));
        colReOrderLevel.setCellValueFactory(new PropertyValueFactory<>("reorderLevel"));
        colCreatedAt.setCellValueFactory(new PropertyValueFactory<>("createdAt"));

        loadAllMedicines();
    }

    void loadAllMedicines() {
        tblMedicineDetails.setItems(medicineService.getAllMedicines());
    }
}
