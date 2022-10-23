package com.ucaldas.proyect_testing.utils.player;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void winner_player() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(3);

        Player player = new Player(dice, 3);
        assertFalse(player.play());

    }

    @Test
    void losser_player() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);

        Player player = new Player(dice, 5);
        assertTrue(player.play());


    }

    @Test
    void tablas() {
        Dice dice = Mockito.mock((Dice.class));
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 4);
        assertEquals(false, player.play());
    }
}