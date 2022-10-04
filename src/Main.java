import java.util.*;  
import torneio.TorneioCalculator;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<String> listaResultados = new ArrayList<String>();
		System.out.println("Digite os 6 resultados linha a linha para receber sua classificação :)");  
		System.out.println("Valores aceitos: V - venceu e p - perdeu");  
		
		Scanner sc= new Scanner(System.in);
		for(int i= 0; i<=6; i++) {
			System.out.println("A colocação de numero: "+ i);  
			String a = sc.nextLine();
			if(a.equals("v") || a.equals("f")) {
				listaResultados.add(a);
				continue;
			}
			throw new Exception("Valor inserido precisa ser V ou F");

		}
		System.out.println("seu grupo é: "+ TorneioCalculator.calcularResultadoTorneio(listaResultados));
	}

}
