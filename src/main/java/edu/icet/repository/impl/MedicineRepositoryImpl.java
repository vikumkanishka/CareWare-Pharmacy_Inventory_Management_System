package edu.icet.repository.impl;

import edu.icet.db.DBConnection;
import edu.icet.model.dto.Medicine;
import edu.icet.repository.MedicineRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;


public class MedicineRepositoryImpl implements MedicineRepository {
    @Override
    public void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
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
        try {

            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE medicine SET name=?, brand=?, category=?, expiry_date=?, quantity=?, unit_price=?, buying_price=?, supplier_id=?, batch_number=?, reorder_level=?, created_at=? WHERE medicine_id=?");
            preparedStatement.setObject(1, name);
            preparedStatement.setObject(2, brand);
            preparedStatement.setObject(3, category);
            preparedStatement.setObject(4, expiryDate);
            preparedStatement.setObject(5, quantity);
            preparedStatement.setObject(6, unitPrice);
            preparedStatement.setObject(7, buyingPrice);
            preparedStatement.setObject(8, supplierId);
            preparedStatement.setObject(9, batchNumber);
            preparedStatement.setObject(10, reorderLevel);
            preparedStatement.setObject(11, createdAt);
            preparedStatement.setObject(12, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteMedicine(Integer id) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM medicine WHERE medicine_id=?");
            preparedStatement.setObject(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Medicine> searchMedicineByName(String name) {
        return null;
    }

    @Override
    public ResultSet getAllMedicines() throws SQLException {

            Connection connection = DBConnection.getInstance().getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM medicine");

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet;
    }
}
