package edu.icet.repository.impl;

import edu.icet.db.DBConnection;
import edu.icet.repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class CustomerRepositoryImpl implements CustomerRepository {


    @Override
    public void addCustomer(Integer id, String name, String email, String phone, String address) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer (customer_id, name, email, phone, address) VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setObject(1, id);
            preparedStatement.setObject(2, name);
            preparedStatement.setObject(3, email);
            preparedStatement.setObject(4, phone);
            preparedStatement.setObject(5, address);

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCustomer(Integer id, String name, String email, Integer phone, String address) {

    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    @Override
    public ResultSet getAllCustomers() {

        try {
            Connection connection = DBConnection.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer");

            return preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResultSet searchCustomerByName(String name) {
        return null;
    }
}
