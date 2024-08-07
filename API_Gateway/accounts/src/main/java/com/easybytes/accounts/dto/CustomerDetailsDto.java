package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer Details",
        description = "Schema to hold Customer, Account, Cards and Loans Information"
)
public class CustomerDetailsDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Schema(
            description = "Name of the Customer", example = "Ankit Shukla"
    )
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email Address cannot be null or empty")
    @Email(message = "Email Address should be valid value")
    @Schema(
            description = "Email of the Customer", example = "shuklaankit@gmail.com"
    )
    private String email;

    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile Number of the Customer", example = "8299278482"
    )
    private String mobilenumber;

    @Schema(
            description = "Accounts Details of the Customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Cards Details of the Customer"
    )
    private CardsDto cardsDto;

    @Schema(
            description = "Loans Details of the Customer"
    )
    private LoansDto loansDto;
}
