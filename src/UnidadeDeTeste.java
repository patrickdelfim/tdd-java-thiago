import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;
import torneio.TorneioCalculator;

public class UnidadeDeTeste {
	private int x = 1; 
	private int y = 1;
	
	@Test
	public void testgrupo1() { 
		ArrayList<String> listaResultados = new ArrayList<String>();
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("v");

		assertEquals(TorneioCalculator.calcularResultadoTorneio(listaResultados), 1);
		}
	
	@Test
	public void testgrupo2() { 
		ArrayList<String> listaResultados = new ArrayList<String>();
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");

		assertEquals(TorneioCalculator.calcularResultadoTorneio(listaResultados), 2);
		}
	
	@Test
	public void testgrupo3() { 
		ArrayList<String> listaResultados = new ArrayList<String>();
		listaResultados.add("v");
		listaResultados.add("v");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");

		assertEquals(TorneioCalculator.calcularResultadoTorneio(listaResultados), 3);
		}
	
	@Test
	public void testSemGrupo() { 
		ArrayList<String> listaResultados = new ArrayList<String>();
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");
		listaResultados.add("f");

		assertEquals(TorneioCalculator.calcularResultadoTorneio(listaResultados), -1);
		}
}

