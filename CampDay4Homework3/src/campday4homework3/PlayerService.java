package campday4homework3;

public interface PlayerService {
    
    void signUpPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(Player player);
    void signIn(Player player, int id, String firstName, String lastName, String tcNo, String birthYear,
            String email, String password);

}
