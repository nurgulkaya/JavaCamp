package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAttribute(Game game) {
		System.out.println("Oyun adý: " + game.getGameName() + "\n" + 
		                   "Oyun Fiyatý: " + game.getUnitPrice());
		

	}

}
