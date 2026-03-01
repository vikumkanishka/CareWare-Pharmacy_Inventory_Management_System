package edu.icet.service.impl;

import edu.icet.model.dto.Medicine;
import edu.icet.repository.MedicineRepository;
import edu.icet.repository.impl.MedicineRepositoryImpl;
import edu.icet.service.MedicineService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class MedicineServiceImpl implements MedicineService {

    MedicineRepository repository = new MedicineRepositoryImpl();

    @Override
    public void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt) {
        repository.addMedicine(id, name, brand, category, expiryDate, quantity, unitPrice, buyingPrice, supplierId, batchNumber, reorderLevel, createdAt);
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
    public ObservableList<Medicine> getAllMedicines() {

        ObservableList<Medicine> medicines = FXCollections.observableArrayList();

        try {
            ResultSet resultSet = repository.getAllMedicines();
            while (resultSet.next()){
                medicines.add(new Medicine(
                        resultSet.getInt("medicine_id"),
                        resultSet.getString("name"),
                        resultSet.getString("brand"),
                        resultSet.getString("category"),
                        resultSet.getDate("expiry_date"),
                        resultSet.getInt("quantity"),
                        resultSet.getDouble("unit_price"),
                        resultSet.getDouble("buying_price"),
                        resultSet.getInt("supplier_id"),
                        resultSet.getString("batch_number"),
                        resultSet.getInt("reorder_level"),
                        resultSet.getDate("created_at")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medicines;
    }
}
