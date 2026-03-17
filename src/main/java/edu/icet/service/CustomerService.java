package edu.icet.service;

import edu.icet.model.dto.Customer;
import javafx.collections.ObservableList;

public interface CustomerService {

    void addCustomer(Integer id, String name, String email, Integer phone, String address);

    void updateCustomer(Integer id, String name, String email, Integer phone, String address);

    void deleteCustomer(Integer id);

    ObservableList<Customer> getAllCustomers();
}
