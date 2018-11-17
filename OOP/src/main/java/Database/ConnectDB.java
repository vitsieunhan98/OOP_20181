package Database;

import com.franz.agraph.repository.AGCatalog;
import com.franz.agraph.repository.AGRepository;
import com.franz.agraph.repository.AGServer;

public class ConnectDB {
	
	public static AGRepository connectDB(String server_url, String catalog_id, String repository_id, String username, String password) {
		AGServer sv = new AGServer(server_url, username, password);
		AGCatalog catalog = sv.getCatalog(catalog_id);
		AGRepository myRepo = catalog.openRepository(repository_id);
		
		return myRepo;
	}
	
	public static void closeDB() {
		
	}
}
