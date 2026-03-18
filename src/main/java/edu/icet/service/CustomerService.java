package edu.icet.service;

import edu.icet.model.dto.Customer;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface CustomerService {

    void addCustomer(Integer id, String name, String email, String phone, String address) throws SQLException;

    void updateCustomer(Integer id, String name, String email, String phone, String address);

    void deleteCustomer(Integer id);

    ObservableList<Customer> getAllCustomers();
}
