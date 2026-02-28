package edu.icet.service;

import edu.icet.model.dto.Medicine;

import java.util.Date;
import java.util.List;

public interface MedicineService {

    void addMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt);

    void updateMedicine(Integer id, String name, String brand, String category, Date expiryDate, Integer quantity, Double unitPrice, Double buyingPrice, Integer supplierId, String batchNumber, Integer reorderLevel, Date createdAt);

    void deleteMedicine(Integer id);

    Medicine searchMedicineById(Integer id);

    List<Medicine> getAllMedicines();
}
