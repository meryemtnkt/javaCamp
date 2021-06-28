package kodlamaio.nortwind.business.absracts;

import kodlamaio.nortwind.core.entities.User;
import kodlamaio.nortwind.core.utilities.result.DataResult;
import kodlamaio.nortwind.core.utilities.result.Result;

public interface UserService {
	
	Result add(User user);
	
	DataResult<	User> findByEmail(String email);

}
