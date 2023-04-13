package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<>();
		
		System.out.println("Qual a temperattura de Janeiro?");
		temperaturas.add(scan.nextDouble());
		System.out.println("Qual a temperattura de Fevereiro?");
		temperaturas.add(scan.nextDouble());
		System.out.println("Qual a temperattura de Março?");
		temperaturas.add(scan.nextDouble());
		System.out.println("Qual a temperattura de Abril?");
		temperaturas.add(scan.nextDouble());
		System.out.println("Qual a temperattura de Maio?");
		temperaturas.add(scan.nextDouble());
		System.out.println("Qual a temperattura de Junho:?");
		temperaturas.add(scan.nextDouble());
		
		
		//calculando e imprimindo media
		double soma=0;
		double media;
		for (Double double1 : temperaturas) {
			soma += double1;
		}
		media = soma/6;
		System.out.println(media);
		
		//imprimindo valores maiores que a media
		int count=0;
		for (Double double1 : temperaturas) {
			if(double1>media) {
				switch (count) {
				case 0: {
					System.out.println("janeiro: " + double1 + " graus");
					break;
				}
				case 1: 
					System.out.println("Fevereiro: " + double1 + " graus");
					break;
				case 2: 
					System.out.println("Março: " + double1 + " graus");
					break;
				case 3: 
					System.out.println("Abril: " + double1 + " graus");
					break;
				case 4: 
					System.out.println("Maio: " + double1 + " graus");
					break;
				case 5:
					System.out.println("Junho: " + double1 + " graus");
					break;
				default:
					System.out.println("Não houve temperatura acima da media");
				}
			}
			count++;
		}
		
		scan.close();
	}
}
