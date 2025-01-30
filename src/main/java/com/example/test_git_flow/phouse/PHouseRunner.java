package com.example.test_git_flow.phouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PHouseRunner implements CommandLineRunner {
    @Autowired
    private PHousePrintService printService;

    @Override
    public void run(String... args) throws Exception {
        printService.printPHouses();
    }
}
