package fsd;

import org.eiichiro.gig.Repository;
import org.eiichiro.jaguar.inject.Name;

@Name("fsd.WelcomeRepository")
@Repository
public class WelcomeRepository {

	public Welcome get() {
		// It's OK to get it from database.
		Welcome welcome = new Welcome();
		welcome.status = "READY";
		return welcome;
	}
	
}
