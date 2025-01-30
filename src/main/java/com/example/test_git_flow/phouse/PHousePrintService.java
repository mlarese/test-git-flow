package com.example.test_git_flow.phouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PHousePrintService {
    @Autowired
    private PHouse laTerza;

    @Autowired
    private PHouse laQuarta;

    @Autowired
    private PHouse laQuinta;


    public void printPHouses() {
        System.out.println("Elenco librerie");
        System.out.println(laTerza);
        System.out.println(laQuarta);
        System.out.println(laQuinta);
    }
}
