package com.example.Pr20.service;

import com.example.Pr20.models.Bank;
import com.example.Pr20.repository.BankRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public void save(Bank bank) {
        log.info("Method save has been started...");
        bankRepository.save(bank);
    }

    public void delete(Long id) {
        log.info("Method delete has been started...");
        bankRepository.delete(findBankById(id));
    }

    public Bank findBankById(Long id) {
        log.info("Method findBankById has been started...");
        return bankRepository.findOneById(id);
    }

    public List<Bank> findBanksByName(String name) {
        log.info("Method findBanksByName has been started...");
        return bankRepository.findAllByName(name);
    }

    public List<Bank> findBanksByAddress(String address) {
        log.info("Method findBanksByAddress has been started...");
        return bankRepository.findAllByAddress(address);
    }

    public List<Bank> getAllBanks() {
        log.info("Method getAllBanks has been started...");
        return bankRepository.findAll();
    }

}
