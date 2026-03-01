package edu.icet.repository.impl;

import edu.icet.model.dto.Medicine;
import edu.icet.repository.MedicineRepository;

import java.sql.*;
import java.util.Date;


public class MedicineRepositoryImpl implements MedicineRepository {
    @Override
    public void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt) {

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
