package Abstract;

import Entities.Game;
import Entities.NewGamer;
import Entities.Sale;

public interface SaleService {
	
	void saleAdd(Sale sale, NewGamer gamer, Game game);
	void saleDelete(Sale sale, NewGamer gamer, Game game);
	void saleUpdate(Sale sale, NewGamer gamer, Game game);
	

}
