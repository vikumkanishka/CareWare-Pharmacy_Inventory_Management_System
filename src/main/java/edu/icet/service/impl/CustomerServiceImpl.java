package edu.icet.service.impl;

import edu.icet.model.dto.Customer;
import edu.icet.repository.CustomerRepository;
import edu.icet.repository.impl.CustomerRepositoryImpl;
import edu.icet.service.CustomerService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public void addCustomer(Integer id, String name, String email, Integer phone, String address) {

    }

    @Override
    public void updateCustomer(Integer id, String name, String email, Integer phone, String address) {

    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    @Override
    public ObservableList<Customer> getAllCustomers() {

        ObservableList<Customer> customers = FXCollections.observableArrayList();

        ResultSet resultSet = customerRepository.getAllCustomers();
        try {
            while (resultSet.next()) {
                customers.add(new Customer(
                        resultSet.getInt("customer_id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("address"),
                        resultSet.getDate("created_at")
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customers;
    }
}
