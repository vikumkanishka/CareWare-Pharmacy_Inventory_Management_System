package edu.icet.repository;

import edu.icet.model.dto.Customer;
import javafx.collections.ObservableList;

import java.util.Date;

public interface CustomerRepository {

    void addCustomer(Integer id, String name, String email, Integer phone, String address, Date createdAt);

    void updateCustomer(Integer id, String name, String email, Integer phone, String address, Date createdAt);

    void deleteCustomer(Integer id);

    ObservableList<Customer> getAllCustomers();

    ObservableList<Customer> searchCustomerByName (String name);
}
