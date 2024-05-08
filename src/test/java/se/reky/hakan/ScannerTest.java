package se.reky.hakan;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTest {

    private Scanner instantiateScanner(String userInput) {

        return new Scanner(userInput);
    }

    @Test
    public void test() {
        Scanner input = instantiateScanner("");
        
    }
}
