package controller;

import java.io.File;
import java.io.IOException;

import model.Arquivo;

public class Controller_Arq {

	public void listarExtenssao() throws IOException {

		Arquivo arquivo = new Arquivo();
		Controller_Dir controller_Dir = new Controller_Dir();

		File file = new File(controller_Dir.PegarDir());
		arquivo.setArquivo(file);
		arquivo.setListaArquivos(arquivo.getArquivo().listFiles());
		String extenssao;
		int i = 0;
		for (int j = arquivo.getListaArquivos().length; i < j; i++) {
			File arquivos = arquivo.getListaArquivos()[i];
			extenssao = arquivos.getName().substring(arquivos.getName().lastIndexOf("."), arquivos.getName().length());
			System.out.println(extenssao);
		}

	}
	
	public void validar_Extenssao() {

		String vetor[] = new String[3];
		vetor[0] = "Wiliam";
		vetor[1] = "Willian";
		vetor[2] = "Wiliam";

		for (int i = 0; i < vetor.length; i++) {

			for (int j = 0; j < i; j++) {
				if (vetor[i] != vetor[j]) {
					System.out.println(vetor[i]);
				} else {
					System.out.println("Nome repetido");
				}
			}
		}

	}

}
