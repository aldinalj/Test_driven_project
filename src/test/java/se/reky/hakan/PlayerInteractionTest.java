package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerInteractionTest {

        private Player player;

        @BeforeEach
        public void instantiatePlayer() {
            player = new Player();
        }

    private PlayerInteraction initiatePlayerInteraction (String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);
    }

    @Test
    public void test() {
            PlayerInteraction playerInteraction = initiatePlayerInteraction("");
    }


}