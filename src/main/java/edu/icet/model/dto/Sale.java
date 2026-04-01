package edu.icet.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    private Integer saleId;
    private Integer customerId;
    private Integer userId;
    private Date saleDate;
    private Double totalAmount;
    private Double discount;
    private Double finalAmount;
    private String paymentMethod;
}
