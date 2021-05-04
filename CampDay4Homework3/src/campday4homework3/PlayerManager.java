package campday4homework3;

public class PlayerManager implements PlayerService {

    @Override
    public void signUpPlayer(Player player) {
        System.out.println("Oyuncu kaydedildi: " + player.getFirstName() + player.getLastName());
    }

    @Override
    public void updatePlayer(Player player) {
        System.out.println("Oyuncu güncellendi: " + player.getFirstName() + player.getLastName());
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println("Oyuncu silindi " + player.getFirstName() + player.getLastName());
    }

    @Override
    public void signIn(Player player, int id, String firstName, String lastName, String tcNo, String birthYear, 
            String email, String password) {
        
        if(player.getTcNo()==tcNo && player.getFirstName()==firstName && player.getLastName()==lastName &&
                player.getBirthYear()==birthYear) {
            System.out.println("Oyuncu giriş yaptı: " + player.getFirstName() + player.getLastName());
	}
        else {
            System.out.println("Kullanici bilgileri yanlis. Lutfen bilgilerinizi kontrol ediniz.");
	}
    }
    
}
