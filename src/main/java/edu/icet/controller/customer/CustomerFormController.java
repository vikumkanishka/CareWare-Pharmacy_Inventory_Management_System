package edu.icet.controller.customer;

import com.jfoenix.controls.JFXTextField;
import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import edu.icet.service.impl.CustomerServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable {

    @FXML
    private TableColumn<?, ?> colAddress;

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
    private DatePicker dateCreatedAt;

    @FXML
    private Label lblRole;

    @FXML
    private TableView<Customer> tblCustomerDetails;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtCustomerId;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXTextField txtPhone;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    private JFXTextField txtxCustomerEmail;

    CustomerService customerService = new CustomerServiceImpl();

    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException {
        Integer id = Integer.parseInt(txtCustomerId.getText());
        String name = txtCustomerName.getText();
        String email = txtxCustomerEmail.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();

        customerService.addCustomer(id, name, email,phone, address);
        loadtable();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        customerService.deleteCustomer(Integer.parseInt(txtCustomerId.getText()));
        loadtable();
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        Integer id = Integer.parseInt(txtCustomerId.getText());
        String name = txtCustomerName.getText();
        String email = txtxCustomerEmail.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();

        customerService.updateCustomer(id, name, email, phone, address);
        loadtable();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCreatedAt.setCellValueFactory(new PropertyValueFactory<>("createdAt"));

        loadtable();
    }

    private void loadtable() {
        tblCustomerDetails.setItems(customerService.getAllCustomers());
    }
}
