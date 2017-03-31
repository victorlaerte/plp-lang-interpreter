package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Este valor primitivo encapsula um valor Real.
 */
public class ValorReal extends ValorConcreto<Double> {

	public ValorReal(double valor) {
		super(valor);
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * 
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao amb) {
	
		return TipoPrimitivo.REAL;
	}

	@Override
	public String toString() {
		return String.format("%s", super.toString());
	}
}
