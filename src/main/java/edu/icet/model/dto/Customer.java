package edu.icet.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private Integer phone;
    private String address;
    private Date createdAt;
}
