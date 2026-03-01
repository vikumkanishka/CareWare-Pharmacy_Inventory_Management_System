package edu.icet.repository.impl;

import edu.icet.model.dto.Medicine;
import edu.icet.repository.MedicineRepository;

import java.sql.*;
import java.util.Date;


public class MedicineRepositoryImpl implements MedicineRepository {
    @Override
    public void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/careware", "root", "200004602360");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO medicine VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            preparedStatement.setObject(1, id);
            preparedStatement.setObject(2, name);
            preparedStatement.setObject(3, brand);
            preparedStatement.setObject(4, category);
            preparedStatement.setObject(6, expiryDate);
            preparedStatement.setObject(7, quantity);
            preparedStatement.setObject(8, unitPrice);
            preparedStatement.setObject(9, buyingPrice);
            preparedStatement.setObject(11, supplierId);
            preparedStatement.setObject(5, batchNumber);
            preparedStatement.setObject(10, reorderLevel);
            preparedStatement.setObject(12, createdAt);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt) {

    }

    @Override
    public void deleteMedicine(Integer id) {

    }

    @Override
    public Medicine searchMedicineById(Integer id) {
        return null;
    }

    @Override
    public ResultSet getAllMedicines() throws SQLException {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/careware", "root", "200004602360");

            System.out.println(connection);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM medicine");

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet;

    }
}
