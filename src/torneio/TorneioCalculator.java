
package torneio;

import java.util.ArrayList;

public class TorneioCalculator {
	
	void constructor() {
		
	}
	
	public static int calcularResultadoTorneio(ArrayList<String> lista) {
		int countV = 0;

		for(int i = 0; i < lista.size(); i++) {
			String element = lista.get(i);

			if(element.equals("v")) {
				countV++;
			}
		}
		
		if(countV >= 5) {
			return 1;
		}
		if(countV >= 3 && countV <= 4) {
			return 2;
		}
		if(countV >= 1 && countV <= 2) {
			return 3;
		}
		
		return -1;
	}
}
