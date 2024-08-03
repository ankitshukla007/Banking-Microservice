package com.easybytes.accounts.Mapper;

import com.easybytes.accounts.dto.CustomerDto;
import com.easybytes.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobilenumber(customer.getMobilenumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobilenumber(customerDto.getMobilenumber());
        return customer;
    }
}
