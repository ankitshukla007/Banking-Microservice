package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {
    @Schema(
            description = "Account Number of the Customer", example = "1234567890"
    )
    @NotEmpty(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "Account Number must be 10 digits")
    private Long account_number;

    @Schema(
            description = "Account Type of the Customer", example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be null or empty")
    private String account_type;

    @NotEmpty(message = "Branch Address cannot be null or empty")
    @Schema(
            description = "Branch Address of the Customer", example = "123 Kidwai Nagar"
    )
    private String branch_address;

}
