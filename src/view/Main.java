package view;

import java.io.IOException;

import controller.Controller_Arq;

public class Main {

	public static void main(String[] args) throws IOException {

		Controller_Arq controller_Arq = new Controller_Arq();
//		controller_Arq.listarExtenssao();
		controller_Arq.validar_Extenssao();

	}

}
