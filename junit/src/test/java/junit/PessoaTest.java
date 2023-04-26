package junit;


import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.Pessoa;

class PessoaTest {

	@Test
	void validarCalculoDeIdade() {
		Pessoa pessoa = new Pessoa("Maria",LocalDate.of(2000, 5, 18));
		Assertions.assertEquals(22, pessoa.getIdade());
	}

}
