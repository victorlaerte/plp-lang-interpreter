package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

/**
 * Um objeto desta classe representa uma Expressao de tamanho de String.
 */
public class ExpToASCII extends ExpUnaria {

	/**
	 * Controi uma Expressao de tamanho com a expressao especificada
	 * assume-se que <code>exp</code> &eacute; uma expressao cuja avaliacao
	 * resulta num <code>ValorString</code>
	 */
	public ExpToASCII(Expressao exp) {
		super(exp, "toASCII");
	}

	/**
	 * Retorna o valor da Expressao de ASCII code de um Char.
	 * 
	 * @param amb
	 *            o ambiente de execu��o.
	 */
	@Override
	public Valor avaliar(AmbienteExecucao amb) {

		return new ValorInteiro((((ValorChar) getExp().avaliar(amb)).valor().charValue()));
	}

	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @param amb
	 *            o ambiente de compila��o.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *         <code>false</code> caso contrario.
	 */
	@Override
	protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb) {

		return (getExp().getTipo(amb).eChar());
	}

	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * 
	 * @return os tipos possiveis desta expressao.
	 */
	@Override
	public Tipo getTipo(AmbienteCompilacao amb) {

		return TipoPrimitivo.INTEIRO;
	}

}
