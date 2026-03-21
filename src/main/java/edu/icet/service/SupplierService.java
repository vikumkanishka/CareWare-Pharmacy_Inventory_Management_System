package edu.icet.service;

import edu.icet.model.dto.Supplier;
import javafx.collections.ObservableList;

public interface SupplierService {

    void addSupplier(Integer id, String name, String companyName, String email, String phone, String address);

    void updateSupplier(Integer id, String name, String companyName, String email, String phone, String address);

    void deleteSupplier(Integer id);

    ObservableList<Supplier> getAllSuppliers();
}
