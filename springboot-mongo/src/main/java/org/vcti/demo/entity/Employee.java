package org.vcti.demo.entity;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeAddress;
    private String employeeEmail;

}
