package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

    private long customerId;

    @Id
    private long account_number;

    private String account_type;

    private String branch_address;

    @Column(name = "communication_sw")
    private Boolean communicationSw;


}
