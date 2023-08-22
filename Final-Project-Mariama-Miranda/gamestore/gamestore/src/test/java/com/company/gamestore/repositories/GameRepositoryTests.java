package com.company.gamestore.repositories;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameRepositoryTests {

    @Autowired
    GameRepository gameRepository;

    @BeforeEach
    public void setUp() throws Exception{
        gameRepository.deleteAll();
    }
}
