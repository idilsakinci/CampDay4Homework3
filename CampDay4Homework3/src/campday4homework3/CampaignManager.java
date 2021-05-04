package campday4homework3;

public class CampaignManager implements CampaignService {

    @Override
    public void addCampaign(Campaign campaign, Game game) {
        System.out.println("Kampanya eklendi.");
	System.out.println(campaign.getDiscount()+ " oranında indirim" + 
                game.getName() + "oyununa uygulanmıştır.");
    }

    @Override
    public void updateCampaign(Campaign campaign, Game game) {
        System.out.println("Kampanya güncellendi.");
	System.out.println(game.getName() + "oyununa uygulanan" + 
                campaign.getDiscount() + "oranında indirim güncellenmiştir.");
    }

    @Override
    public void deleteCampaign(Campaign campaign, Game game) {
        System.out.println("Kampanya süresi doldu.");
	System.out.println(game.getName() + "oyununa uygulanan" + 
                campaign.getDiscount() + "oranında indirimin süresi dolmuştur.");
    }
    
}
