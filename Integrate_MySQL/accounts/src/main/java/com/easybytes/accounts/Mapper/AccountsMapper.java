package com.easybytes.accounts.Mapper;

import com.easybytes.accounts.dto.AccountsDto;
import com.easybytes.accounts.entity.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccount_number(accounts.getAccount_number());
        accountsDto.setAccount_type(accounts.getAccount_type());
        accountsDto.setBranch_address(accounts.getBranch_address());

        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {

        accounts.setAccount_type(accountsDto.getAccount_type());
        accounts.setAccount_number(accountsDto.getAccount_number());
        accounts.setBranch_address(accountsDto.getBranch_address());
        return accounts;
    }
}
