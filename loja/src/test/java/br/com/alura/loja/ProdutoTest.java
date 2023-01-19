package br.com.alura.loja;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void test() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		assertEquals("teste", p.getNome());
		assertEquals(BigDecimal.TEN, p.getPreco());
	}

}
