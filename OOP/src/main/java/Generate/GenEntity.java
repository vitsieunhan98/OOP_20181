package Generate;

import Entity.*;

public class GenEntity {
	
	public Entity genEntity() {
		int random = (int) (Math.random() * 6 + 0);
		
		switch (random) {
		case 0:
			return new GenPerson().generate();
		case 1:
			return new GenOrganization().generate();
		case 2:
			return new GenLocation().generate();
		case 3:
			return new GenEvent().generate();
		case 4:
			return new GenCountry().generate();
		default:
			break;
		}
		return null;
	}
	
}
