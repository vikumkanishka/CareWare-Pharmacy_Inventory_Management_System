package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {
    private Integer purchaseOrderId;
    private Integer supplierId;
    private Date orderDate;
    private Double totalAmount;
    private String status;
}
