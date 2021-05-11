package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SaleManager implements SaleService {

	@Override
	public void sale(Member member, Game game, Campaign campaign) {
		
		System.out.println("Oyun Fiyatı: "+ game.getUnitPrice() + " TL'dir.");
	        System.out.println(member.getFirstName()+ " "  + member.getLastName() + " adlı üye " +        
				  game.getGameName() + " oyununu " + campaign.getCampaignName() +
				  " %"+campaign.getDiscount() + " indirim oranı ile satın aldı.");
	}
	
	
	

}
