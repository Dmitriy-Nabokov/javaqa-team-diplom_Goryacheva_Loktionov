package netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }

    // другие ваши тесты
    @Test
    public void ShoulSumHoursWhenGameInstalled() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Player player = new Player("Кузя");
        player.installGame(game);
        int actual = player.play(game, 5);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void ShoulSumHoursWhenGameNotInstalled() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Player player = new Player("Кузя");
        assertThrows(RuntimeException.class, () -> player.play(game, 5));
    }

    @Test
    public void ReturnMustUsableGameByGenre() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Креш Бантикот", "Аркады");

        Player player = new Player("Кузя");
        player.installGame(game1);
        player.installGame(game2);
        player.play(game1, 6);
        player.play(game2, 12);
        Game expected = game2;
        Game actual = player.mostPlayerByGenre("Аркады");
        Assertions.assertEquals(expected, actual);
    }
}