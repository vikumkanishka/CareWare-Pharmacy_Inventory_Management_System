package edu.icet.repository.impl;

import edu.icet.model.dto.Customer;
import edu.icet.repository.CustomerRepository;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.util.Date;

public class CustomerRepositoryImpl implements CustomerRepository {


    @Override
    public void addCustomer(Integer id, String name, String email, Integer phone, String address, Date createdAt) {

    }

    @Override
    public void updateCustomer(Integer id, String name, String email, Integer phone, String address, Date createdAt) {

    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    @Override
    public ResultSet getAllCustomers() {
        return null;
    }

    @Override
    public ResultSet searchCustomerByName(String name) {
        return null;
    }
}
