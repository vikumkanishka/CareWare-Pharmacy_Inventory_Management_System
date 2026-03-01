package edu.icet.repository;

import edu.icet.model.dto.Medicine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface MedicineRepository {

    void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt);

    void updateMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt);

    void deleteMedicine(Integer id);

    Medicine searchMedicineById(Integer id);

    ResultSet getAllMedicines() throws SQLException;
}
