package com.company.gamestore.controllers;

import com.company.gamestore.repositories.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsoleController {

    @Autowired
    ConsoleRepository consoleRepository;
}
