package cc.code;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ValidationHadukenTest {

	@Test
	public void telefoneDeveTerNoMinimo8Digitos()
	{
		//dado
		String telefone = "1234567";
		List<String> validaTamanhoTelefone = init(telefone);
		//entao
		assertEquals(1,validaTamanhoTelefone.size());
	}
		
	@Test 
	public void deveTelefoneCom8DigitosEValido(){
		//dado
		String telefone = "12345678";
		//quando
		List<String> validaTamanhoTelefone = init(telefone);
		//entao
		assertEquals(0,validaTamanhoTelefone.size());		
	}
	
	@Test
	public void validarListagemCelulares() {
		//dado
		String telefone = "12345678";
		//quando
		List<String> validaTelefoneCel = init(telefone);
		//entao
		assertEquals(0, validaTelefoneCel.size());
	}

	private List<String> init(String telefone) {
		ValidationHaduken v = new ValidationHaduken();
		List<String> constraints = new ArrayList<String>();
		List<String> validaTamanhoTelefone = v.validaTamanhoTelefone(constraints, telefone);
		return validaTamanhoTelefone;
	}
}
