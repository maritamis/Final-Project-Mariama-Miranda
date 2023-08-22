package com.company.gamestore.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TshirtRepositoryTests {

    @Autowired
    TshirtRepository tshirtRepository;

    @BeforeEach
    public void setUp() throws Exception{
        tshirtRepository.deleteAll();
    }
}
