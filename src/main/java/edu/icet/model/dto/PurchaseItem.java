package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseItem {
    private Integer purchaseItemId;
    private Integer purchaseId;
    private Integer medicineId;
    private Integer quantity;
    private Double buyPrice;
}
