package edu.icet.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Supplier {
    private Integer id;
    private String name;
    private String companyName;
    private String phone;
    private String email;
    private String address;
    private Date createdAt;
}
