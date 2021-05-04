package campday4homework3;

public class SaleManager implements SaleService{
    
    @Override
    public void sell(Player player, Game game, Campaign campaign) {
        System.out.println(game.getName() + " oyununda " + campaign.getDiscount() + " oranında indirim vardır.");
    }
    
}
