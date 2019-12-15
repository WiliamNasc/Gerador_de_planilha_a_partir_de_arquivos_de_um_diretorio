package controller;

import java.io.IOException;

import javax.swing.JFileChooser;

import model.Diretorio;

public class Controller_Dir {

	public String PegarDir() throws IOException {

		Diretorio diretorio = new Diretorio();
		Controller_Dir controller_Dir = new Controller_Dir();
		diretorio.setEnderecoDiretorio(controller_Dir.EscolherDir());

		return diretorio.getEnderecoDiretorio();

	}

	public String EscolherDir() throws IOException {

		JFileChooser chooserDiretorio = new JFileChooser();
		chooserDiretorio.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooserDiretorio.showDialog(null, "Mostrar");

		return chooserDiretorio.getSelectedFile().getAbsolutePath();

	}

}
