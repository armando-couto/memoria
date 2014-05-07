package br.unifor.so.memoria.algoritmo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.unifor.so.memoria.Principal;
import br.unifor.so.memoria.model.Processo;
import br.unifor.so.memoria.model.thread.ProcessoThreadBestFit;

/**
 * Best Fit.
 * 
 * @author armandocouto
 * @email coutoarmando@gmail.com
 * @date 20/03/2014
 */
public class BestFit extends Algoritmo implements ActionListener {

	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if (Principal.processamento != null)
			Principal.processamento.stop();

		Principal.processosAptos = new ArrayList<Processo>();
		Principal.processosEmExecucao = new ArrayList<Processo>();
		this.criarProcessos();
		montarNucleos();
		montarProcessos();
		
		Principal.processamento = new ProcessoThreadBestFit();
		Principal.processamento.start();
	}

	@Override
	public void criarProcessos() {
		super.criarProcessos();
//		Collections.sort(Principal.processosAptos, new Processo());
	}
}