package com.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Exercicio2 {

	public static void main(String[] args) {
		
		Set<LinguagemFavorita> lista = new HashSet<>();
		lista.add(new LinguagemFavorita("JAVA", 1991, "Eclipse"));
		lista.add(new LinguagemFavorita("Python", 1992, "Pycharm"));
		lista.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
		System.out.println(lista);
		
		Set<LinguagemFavorita> lista2 = new LinkedHashSet<>(
				Arrays.asList(
						new LinguagemFavorita("JAVA", 1991, "Eclipse"),
						new LinguagemFavorita("Python", 1991, "Pycharm"),
						new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"))
				);
		System.out.println(lista2);
		
		
		Set<LinguagemFavorita> lista3 = new TreeSet<>(lista);
		System.out.println(lista3);
		
		Set<LinguagemFavorita> lista4 = new TreeSet<>(new ComparatorIDE());
		lista4.addAll(lista);
		System.out.println(lista4);
		
		Set<LinguagemFavorita> lista5 = new TreeSet<>(new ComparatorAnoDeCriacaoENome());
		lista5.addAll(lista);
		System.out.println(lista5);
		
		Set<LinguagemFavorita> lista6 = new TreeSet<>(new ComparatorAnoDeCriacaoEIDE());
		lista6.addAll(lista);
		System.out.println(lista6);

	}

}


class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	 public String nome;
	 public int anoDeCriacao;
	 public String ide;
	 
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
		
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nome: " + nome + ", Ano: " + anoDeCriacao + ", IDE: " + ide ;
		}

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		return this.nome.compareTo(linguagem.nome);
	}
	
	
	 
	 
}


class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		return l1.ide.compareToIgnoreCase(l2.ide);
	}
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ano = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
		if(ano!=0) {
			return ano;
		}
		return l1.nome.compareToIgnoreCase(l2.nome);
	}
	
}

class ComparatorAnoDeCriacaoEIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int ano = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
		if(ano!=0) {
			return ano;
		}
		return l1.ide.compareToIgnoreCase(l2.ide);
	}
	
}


