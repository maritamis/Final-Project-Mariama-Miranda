package com.company.gamestore.controllers;

import com.company.gamestore.repositories.TshirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TshirtController {

    @Autowired
    TshirtRepository tshirtRepository;
}
