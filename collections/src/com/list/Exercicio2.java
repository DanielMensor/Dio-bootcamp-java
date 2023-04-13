package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> respostas = new ArrayList<>();
		
		System.out.println("Farei alguma perguntas responda com S para Sim e N para Não");
		
		System.out.println("Telefonou para a vítima?");
		
		
		String resposta = scan.next();
		while(!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
			System.out.println("Resposta invalida digite novamente (S) ou (N)");
			resposta = scan.next();
		}
		
		respostas.add(resposta);
		
		
		System.out.println("Esteve no local do Crime?");
		resposta = scan.next();
		while(!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
			System.out.println("Resposta invalida digite novamente (S) ou (N)");
			resposta = scan.next();
		}
		respostas.add(resposta);
		
		
		System.out.println("Mora perto da Vítima?");
		resposta = scan.next();
		while(!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
			System.out.println("Resposta invalida digite novamente (S) ou (N)");
			resposta = scan.next();
		}
		respostas.add(resposta);
		
		
		
		System.out.println("Devia a vítima?");
		resposta = scan.next();
		while(!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
			System.out.println("Resposta invalida digite novamente (S) ou (N)");
			resposta = scan.next();
		}
		respostas.add(resposta);
		
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		while(!(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n"))) {
			System.out.println("Resposta invalida digite novamente (S) ou (N)");
			resposta = scan.next();
		}
		respostas.add(resposta);
		
		
		System.out.println(respostas);
		
		int soma=0;
		
		for (String string : respostas) {
			if(string.equalsIgnoreCase("s")) {
				soma++;
			}
		}
		
		switch (soma) {
		case 0:
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assasino");
			break;
			
			

		default:
			System.out.println("ERRO");;
		}
		
		
		scan.close();
	}
}
