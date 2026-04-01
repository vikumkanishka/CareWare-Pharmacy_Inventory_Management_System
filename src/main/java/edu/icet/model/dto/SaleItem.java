package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleItem {
    private Integer saleItemId;
    private Integer saleId;
    private Integer medicineId;
    private Integer quantity;
    private Double unitPrice;
    private Double subTotal;
}
