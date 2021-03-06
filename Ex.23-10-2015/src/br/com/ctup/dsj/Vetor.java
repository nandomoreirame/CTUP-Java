package br.com.ctup.dsj;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Vetor extends Helpers
{
	/*
	// Exercício 01.
	*/
	public void MostraVetor(Vector<Integer> vet)
	{
		int count = 0;
		
		for (int i = 0; i < vet.size(); i++) {
		    System.out.print(vet.get(i));
		    
		    count = i + 1;
		    if(count < vet.size()) {
		    	System.out.print(", ");
		    }
		}
	}

	/*
	// Exercício 02.
	*/
	public int MaiorElemento(Vector<Integer> vet)
	{
		int maior = 0, num = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if(num > maior) {
				maior = num;
			}
		}
		
		return maior;
	}

	/*
	// Exercício 03.
	*/
	public int MenorElemento(Vector<Integer> vet)
	{
		int menor = vet.get(0),
			num = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if (menor > num) {
				menor = num;
			}
		}
		
		return menor;
	}

	/*
	// Exercício 04.
	*/
	public void VetorInverso(Vector<Integer> vet)
	{
		System.out.println("\n--- Exercício 04 ---");
		
		for (int i = (vet.size()-1); i >= 0; i--) {
			System.out.print(vet.get(i));
		    
		    if(i != 0) {
		    	System.out.print(", ");
		    }
		}
	}

	/*
	// Exercício 05.
	*/
	public Vector<Double> MultiplicaVetores(Vector<Double> v1, Vector<Double> v2)
	{
		Vector<Double> vet = new Vector<Double>(v1.size());
		
		for (int i = 0; i < v1.size(); i++) {
			vet.addElement(v1.get(i) * v2.get(i));
		}
		
		return vet;
	}

	/*
	// Exercício 06.
	*/
	public void ProdutoEscalar(Vector<Double> v1, Vector<Double> v2)
	{
		System.out.println("\n\n--- Exercício 06 ---");
		
		Double produtoEscalar = 0.0;
		Vector<Double> vetMultiplicado = this.MultiplicaVetores(v1, v2);
        
		for (int i = 0; i < vetMultiplicado.size(); i++) {
			produtoEscalar += vetMultiplicado.get(i);
		}
		
		System.out.println("Produto escalar de v1 e v2 é: " + produtoEscalar);
	}

	/*
	// Exercício 07.
	*/
	public Integer ProdutorioDeElementos(Vector<Integer> vet)
	{
		int num = 0, produtorio = 1;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if (num > 0 && num%2 == 0) {
				produtorio *= num;
			}
		}
		
		return produtorio;
	}

	/*
	// Exercício 08.
	*/
	public void OrdemaMaior(double[] vet)
	{
		System.out.println("\n--- Exercício 08 ---");
		double aux;
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	/*
	// Exercício 09.
	*/
	public void VetorDeFibonacci(int limit)
	{
		System.out.println("\n\n--- Exercício 09 ---");
		if(limit > 0) {
			for (int i = 0; i < limit; i++) {
				System.out.print(fibo(i) + " ");
			}
		}
	}


	/*
	// Exercício 10.
	*/
	public Vector<Integer> VetorBdeA(Vector<Integer> vetorA)
	{
		Vector<Integer> vetorB = new Vector<Integer>();
		
		vetorB.addElement(this.MaiorElemento(vetorA));
		vetorB.addElement(this.MenorElemento(vetorA));
		vetorB.addElement(this.SomaValoresVetor(vetorA));
		vetorB.addElement(this.MediaValoresVetor(vetorA));
		
		return vetorB;
	}


	/*
	// Exercício 11.
	*/
	public Vector<Integer> MesclaVetores(Vector<Integer> vetA, Vector<Integer> vetB)
	{
		Vector<Integer> vetC = new Vector<Integer>();
		
		for (int i = 0; i < vetA.size(); i++) {
			if(i%2 == 0) {
				vetC.addElement(vetA.get(i));
			} else {
				vetC.addElement(vetB.get(i));
			}
		}
		
		return vetC;
	}


	/*
	// Exercício 12.
	*/
	public String ElementosRepetidos(Vector<Integer> vet)
	{
		String message = "";
		int num, cont = 1;
		
		Collections.sort(vet);
		
		for (int i = 0; i < vet.size()-1; i++) {
			num = vet.get(i);
			
			if(num == vet.get(i+1)) {
				cont++;
			} else {
				if(cont > 1) {
					message += cont + "x o " + num + " \n";
					cont = 1;
				}
			}
		}
		return message;
	}

	/*
	// Exercício 13.
	*/
	public Vector<Integer> PreencheValor(Integer length)
	{
		Vector<Integer> vet = new Vector<Integer>();
		int n1, n2 = 0;
		String msg = "";
		
		for (int i = 0; i < length; i++) {
			do {
				msg = (i == 0) ? "Digite o " + (i+1) + "º numero.." : "Digite um numero maior que o " + i + "º..";
				n1 = Integer.parseInt(JOptionPane.showInputDialog(msg));
			} while (n1 <= n2);
			
			vet.addElement(n1);
			n2 = n1;
		}
		return vet;
	}

	/*
	// Exercício 14.
	*/
	public Vector<Integer> ConcatVetores(Vector<Integer> vetA, Vector<Integer> vetB)
	{
		Vector<Integer> vetC = new Vector<Integer>();
		
		for (int i = 0; i < vetA.size(); i++) {
			vetC.addElement(vetA.get(i));
		}
		for (int i = 0; i < vetB.size(); i++) {
			vetC.addElement(vetB.get(i));
		}
		
		return vetC;
	}

	/*
	// Exercício 15.
	*/
	public int[] UnirVetores(int[] vetA, int[] vetB)
	{
		//
		// TODO
		//
		return null;
	}

	/*
	// Exercício 16.
	*/
	public int[] Intersecao(int[] vetA, int[] vetB)
	{
		//
		// TODO
		//
		return null;
	}

	/*
	// Exercício 17.
	*/
	public void ShowMatriz(int[][] matriz)
	{
		for(int i = 0 ; i < matriz.length + 1; i++) {
            for(int j = 0; j < matriz.length + 1; j++) {
                System.out.printf("\t %d \t", matriz[i][j]);
            }
            System.out.println();
        }
	}
}
