package edu.icet.controller.medicine;

import edu.icet.model.dto.Medicine;
import edu.icet.service.MedicineService;
import edu.icet.service.impl.MedicineServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class MedicineFormController implements Initializable {

    MedicineService medicineService = new MedicineServiceImpl();

    public TextField txtId;
    public Button btnUpdateMedicine;
    public Button btnDeleteMedicine;
    public TextField txtName;
    public TextField txtBrand;
    public TextField txtCategory;
    public TextField txtSupplierId;
    public TextField txtUnitPrice;
    public DatePicker dateExpiryDate;
    public TextField txtBuyingPrice;
    public TextField txtReOrderLevel;
    public TextField txtBatchNo;
    public DatePicker dateCreatedAt;
    public TextField txtQuantity;

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
        Integer id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String brand = txtBrand.getText();
        String category = txtCategory.getText();
        Integer supplierId = Integer.parseInt(txtSupplierId.getText());
        Integer quantity = Integer.parseInt(txtQuantity.getText());
        Double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        Double buyingPrice = Double.parseDouble(txtBuyingPrice.getText());
        Integer reOrderLevel = Integer.parseInt(txtReOrderLevel.getText());
        String batchNo = txtBatchNo.getText();
        Date expiryDate = java.sql.Date.valueOf(dateExpiryDate.getValue());
        Date createdAt =java.sql.Date.valueOf(dateCreatedAt.getValue());

        medicineService.addMedicine(id, name, brand, category, expiryDate, quantity, unitPrice, buyingPrice, supplierId, batchNo, reOrderLevel, createdAt);

        loadAllMedicines();
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
