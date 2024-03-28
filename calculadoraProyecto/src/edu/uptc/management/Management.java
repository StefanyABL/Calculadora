package edu.uptc.management;

import edu.uptc.logic.BinaryTreeExpresion;
import edu.uptc.logic.Node;
import edu.uptc.view.MainWindow;

public class Management {
	private BinaryTreeExpresion bt;
	private MainWindow mw;




	public Management() {

		bt= new BinaryTreeExpresion();



	}
	public BinaryTreeExpresion getBt() {
		return bt;
	}
	public void setBt(BinaryTreeExpresion bt) {
		this.bt = bt;
	}
	public MainWindow getMw() {
		return mw;
	}
	public void setMw(MainWindow mw) {
		this.mw = mw;
	}
	public Node construirArbol(String expresion){


		Node node= bt.construirArbol(expresion);
		return node;
	}

	public String calcular(Node node){
		return String.valueOf(bt.operacion(node));
	}


}
