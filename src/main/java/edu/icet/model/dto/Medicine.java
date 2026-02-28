package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Medicine {
     private Integer Id;
     private String name;
     private String brand;
     private String category;
     private Date expiryDate;
     private Integer quantity;
     private Double unitPrice;
     private Double BuyingPrice;
     private Integer supplierId;
     private String batchNumber;
     private Integer reorderLevel;
     private Date createdAt;
}
