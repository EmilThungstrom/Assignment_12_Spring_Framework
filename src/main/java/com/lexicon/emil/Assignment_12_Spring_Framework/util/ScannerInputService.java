package com.lexicon.emil.Assignment_12_Spring_Framework.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    private Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        String input;
        do {
            input = scanner.nextLine();
        } while(input.matches("[1-9][0-9]?"));

        return Integer.parseInt(input);
    }
}
