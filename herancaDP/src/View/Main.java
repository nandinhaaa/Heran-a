package View;

import herancaDP.*;

public class Main {

	public static void main(String[] args) {

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorContas adc = new AtualizadorContas(0.10);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
	}
}