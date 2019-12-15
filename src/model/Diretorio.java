package model;

import javax.swing.JFileChooser;

public class Diretorio {
	
	private String enderecoDiretorio;
	private JFileChooser menuDiretorios;
	
	public String getEnderecoDiretorio() {
		return enderecoDiretorio;
	}
	public JFileChooser getMenuDiretorios() {
		return menuDiretorios;
	}
	public void setEnderecoDiretorio(String enderecoDiretorio) {
		this.enderecoDiretorio = enderecoDiretorio;
	}
	public void setMenuDiretorios(JFileChooser menuDiretorios) {
		this.menuDiretorios = menuDiretorios;
	}
	
	

}
