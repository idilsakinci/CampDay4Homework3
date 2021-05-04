package campday4homework3;

public class GameManager implements GameService {

    @Override
    public void addGame(Game game) {
        System.out.println("Oyun eklendi: " + game.getName());
    }
    
    @Override
    public void updateGame(Game game) {
        System.out.println("Oyun güncellendi: " + game.getName());
    }
    
    @Override
    public void deleteGame(Game game) {
        System.out.println("Oyun silindi: " + game.getName());
    }
    
}
