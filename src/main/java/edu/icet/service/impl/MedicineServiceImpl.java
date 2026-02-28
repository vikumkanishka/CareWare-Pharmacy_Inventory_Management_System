package edu.icet.service.impl;

import edu.icet.model.dto.Medicine;
import edu.icet.service.MedicineService;

import java.util.Date;
import java.util.List;

public class MedicineServiceImpl implements MedicineService {
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
    public List<Medicine> getAllMedicines() {
        return List.of();
    }
}
