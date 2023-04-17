package com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Exercicio1 {

	public static void main(String[] args) {

		Set<String> coresDoArcoIres = new HashSet<>(){{
			add("Vermelho");
			add("Laranja");
			add("Amarelo");
			add("Verde");
			add("Azul");
			add("Anil");
			add("Violeta");
		}};
		
		for (String cores : coresDoArcoIres) {
			System.out.println(cores);
		}
		
		System.out.println("O arco ires tem " + coresDoArcoIres.size() + " cores");
		
		
		Set<String> coresDoArcoIres2 = new TreeSet<>(coresDoArcoIres);
		System.out.println(coresDoArcoIres2);
		
		List<String> coresDoArcoIres3 = new LinkedList<>(){{
			add("Vermelho");
			add("Laranja");
			add("Amarelo");
			add("Verde");
			add("Azul");
			add("Anil");
			add("Violeta");
		}};
		System.out.println(coresDoArcoIres3);
		Collections.reverse(coresDoArcoIres3);
		System.out.println(coresDoArcoIres3);
		
		
		for (String cor : coresDoArcoIres) {
			if(cor.startsWith("V")) {
				System.out.println(cor);
			}
			
		}
		
		Iterator<String> iterator1 = coresDoArcoIres.iterator();
		while(iterator1.hasNext()) {
			if(!iterator1.next().startsWith("V")) iterator1.remove();
		}
		
		System.out.println(coresDoArcoIres);
		
		coresDoArcoIres.clear();
		System.out.println(coresDoArcoIres);
		
		System.out.println(coresDoArcoIres.isEmpty());
		
	}

}
