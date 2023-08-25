package com.company.gamestore.controllers;

import com.company.gamestore.models.Invoice;
import com.company.gamestore.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceController {
    @Autowired
    InvoiceRepository invoiceRepository;

    //Create
    @PostMapping("/invoices")
    @ResponseStatus(HttpStatus.CREATED)
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return invoiceRepository.save(invoice);
    }

    //Read
    @GetMapping("/invoices/{id}")
    public Invoice getInvoiceById(@PathVariable int id){
        Optional<Invoice> returnVal = invoiceRepository.findById(id);
        if (returnVal.isPresent()){
            return returnVal.get();
        } else {
            return null;
        }
    }
    //Read All
    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices(){
        return invoiceRepository.findAll();
    }

    //By Customer Name
    @GetMapping("/invoices/name/{name}")
    public Optional<Invoice> getInvoiceByName(@PathVariable String name){
        Optional<Invoice> returnedInvoice = invoiceRepository.findByName(name);
        return returnedInvoice;
    }

}
