package com.example.SpringBootForArchiveSch.service;

import com.example.SpringBootForArchiveSch.repository.PrintAuditRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PrintAuditServiceImpl implements PrintAuditService{

    private  PrintAuditRepo printAuditRepo ;

    @Autowired
    public PrintAuditServiceImpl(PrintAuditRepo printAuditRepo) {
        this.printAuditRepo = printAuditRepo;
    }


    @Override
    public List<PrintAuditService> findAll() {
        return null;
    }

    @Override
    public Optional<PrintAuditService> findById(Long thePrintAuditService) {
        return Optional.empty();
    }

    @Override
    public PrintAuditService save(PrintAuditService thePrintAuditService) {
        return null;
    }

    @Override
    public void deleteById(PrintAuditService thePrintAuditService) {

    }
}
