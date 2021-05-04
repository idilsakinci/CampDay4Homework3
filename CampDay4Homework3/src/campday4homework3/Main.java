package campday4homework3;

public class Main {

    public static void main(String[] args) {
        
        PlayerManager playerManager = new PlayerManager();
        Player player1 = new Player();
        player1.setFirstName("İdil");
	player1.setLastName("Sakıncı");
	player1.setBirthYear("2000");
	player1.setId(1);
	player1.setTcNo("12345678910");       
	playerManager.signUpPlayer(player1);
	playerManager.signIn(player1, 1, "İdil", "Sakıncı", "12345678910", "2000",
                "idilsakincii6@gmail.com", "1234");
		
	Game game1 = new Game();
	game1.setId(1);
	game1.setName("Sims");
        game1.setYear("2007");
	game1.setPrice(1000);
	
	GameManager gameManager = new GameManager();
	gameManager.addGame(game1);
	gameManager.updateGame(game1);
	gameManager.deleteGame(game1);
		
	Campaign campaign1 = new Campaign();
	campaign1.setId(1);
	campaign1.setDiscount(20);
	
		
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.addCampaign(campaign1, game1);
	campaignManager.deleteCampaign(campaign1, game1);
	campaignManager.updateCampaign(campaign1, game1);
	
        SaleManager saleManager = new SaleManager();
	saleManager.sell(player1,game1,campaign1);
    }
    
}
