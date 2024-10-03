package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class BankAccount {
    @Id
    private Long accountNumber;
    private String ifsc;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "bankAccount")
    private Employee employee;
}
