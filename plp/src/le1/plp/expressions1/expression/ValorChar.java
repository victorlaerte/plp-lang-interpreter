package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

public class ValorChar extends ValorConcreto<Character> {

	public ValorChar(Character valor) {
		super(valor);
	}

	@Override
	public Tipo getTipo(AmbienteCompilacao amb) {

		return TipoPrimitivo.CHAR;
	}

}
