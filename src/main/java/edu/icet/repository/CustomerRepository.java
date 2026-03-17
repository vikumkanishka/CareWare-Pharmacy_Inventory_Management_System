package edu.icet.repository;

import edu.icet.model.dto.Customer;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.util.Date;

public interface CustomerRepository {

    void addCustomer(Integer id, String name, String email, Integer phone, String address);

    void updateCustomer(Integer id, String name, String email, Integer phone, String address);

    void deleteCustomer(Integer id);

    ResultSet getAllCustomers();

    ResultSet searchCustomerByName (String name);
}
