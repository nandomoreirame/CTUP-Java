package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class Principal
{
	public static void main(String[] args) {
		// ===================================================
		// 1. PA (Progressão Aritmética)
		// a1 = 10, n = 7, r = 3. Resultado: an = 28
		// ===================================================
		Pa pa = new Pa();
		pa.setA1(10);
		pa.setN(7);
		pa.setR(3);
		System.out.println(pa.resultPA());
		
		// ===================================================
		// 2. Distância
		// p1(0, 5), p2(10, 20). Resultado: distancia = 10
		// ===================================================
		Distancia dis = new Distancia();
		dis.setX1(0);
		dis.setX2(10);
		dis.setY1(5);
		dis.setY2(20);
		System.out.println(dis.getDistacia());
		
		// ===================================================
		// 3. Média Aritmética
		// n1 = 10.0, n2 = 5.5, n3 = 8.0. Resultado: media = 7.83
		// ===================================================
		MediaAritmetica media = new MediaAritmetica();
		media.setN1(10);
		media.setN2(5.5);
		media.setN3(8);
		System.out.println(media.getMedia());
		
		// ===================================================
		// 4. Média Ponderada
		// n1 = 10.0, n2 = 5.5, n3 = 8.0, p1 = 5, p2 = 3, p3 = 2.
		// Resultado: media = 8.25
		// ===================================================
		MediaPonderada mediaP = new MediaPonderada();
		mediaP.setN1(10);
		mediaP.setN2(5.5);
		mediaP.setN3(8);
		mediaP.setP1(5);
		mediaP.setP2(3);
		mediaP.setP3(2);
		System.out.println(mediaP.getMedia());
		
		// ===================================================
		// 5. Média Harmônica
		// n1 = 10.0, n2 = 5.5, n3 = 8.0. Resultado: media = 7.37
		// ===================================================
		MediaHarmonica mediaA = new MediaHarmonica();
		mediaA.setN1(10);
		mediaA.setN2(5.5);
		mediaA.setN3(8);
		System.out.println(mediaA.getMedia());
		
		// ===================================================
		// 6. Conversão de temperaturas
		// c = 30. Resultado: f = 86
		// ===================================================
		ConverterTemperatura convTemp = new ConverterTemperatura();
		convTemp.setCelsius(30);
		System.out.println(convTemp.getFahrenheit());

		// ===================================================
		// 7. Volume de um cilindro
		// raio = 10, altura = 15. Resultado: volume = 4710
		// ===================================================
		Volume vol = new Volume();
		vol.setRaio(10);
		vol.setAltura(15);
		System.out.println(vol.getVolume());

		// ===================================================
		// 8. Consumo
		//
		// ===================================================
		Consumo cons = new Consumo();
		cons.setTempo(3);
		cons.setVelocidadeMedia(120);
		System.out.println(cons.getLitros());

		// ===================================================
		// 9. Porcentagem
		// inicial = 100.00, porcentagem = 15. Resultado: 115.00
		// ===================================================
		Porcentagem porc = new Porcentagem();
		porc.setValorInicial(100);
		porc.setPorcentagem(15);
		System.out.println(porc.getTotal());
	}
}
