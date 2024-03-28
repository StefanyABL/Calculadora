package edu.uptc.logic;
import java.util.*;

public class BinaryTreeExpresion {

	private Stack < Node > pilaOperandos; 
	private Stack < String > pilaOperadores;
	private String operadores;       
	private Node raiz;



	public BinaryTreeExpresion() {
		raiz= new Node();
		pilaOperadores= new Stack<String>();
		pilaOperandos= new Stack<Node>();
		operadores = ")+-*/%("; 
	}



	public Node construirArbol(String expresion) {

		StringTokenizer tokenizer;
		String token;
		tokenizer = new StringTokenizer(expresion, operadores, true);
		while (tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();

			if (operadores.indexOf(token) < 0) {
				// Es operando y lo guarda como nodo del arbol
				//Node a;
				pilaOperandos.push( new Node(token));
			} else if(token.equals(")")) { // Saca elementos hasta encontrar (
				while (!pilaOperadores.empty() && !pilaOperadores.peek().equals("(")) {
					guardarSubArbol();
				}
				pilaOperadores.pop();  // Saca el parentesis izquierdo
			} else {
				if (!token.equals("(") && !pilaOperadores.empty()) {
					//operador diferente de cualquier parentesis
					String op = (String) pilaOperadores.peek();
					while (!op.equals("(") && !pilaOperadores.empty()
							&& operadores.indexOf(op) >= operadores.indexOf(token)) {
						guardarSubArbol();
						if (!pilaOperadores.empty()) 
							op = (String)pilaOperadores.peek();
					}
				}
				pilaOperadores.push(token);  //Guarda el operador
			}
		}
		try {
			raiz = (Node)pilaOperandos.peek();
		} catch (EmptyStackException e) {
			System.out.println("La pila esta vacia");
			// TODO: handle exception
		}

		while (!pilaOperadores.empty()) {
			if (pilaOperadores.peek().equals("(")) {
				pilaOperadores.pop();
			} else {
				guardarSubArbol();
				raiz = (Node) pilaOperandos.peek() ;
			}
		}
		return raiz;
	}

	private void guardarSubArbol() {
		Node op2 = (Node) pilaOperandos.pop();
		Node op1 = (Node)pilaOperandos.pop();
		pilaOperandos.push( new Node(op2, pilaOperadores.pop(), op1));

	}



	public boolean Hoja(Node R)
	{
		return ((R.getNodoIzquierdo()==null)&&(R.getNodoDerecho()==null));
	}

	public Double  operacion(Node n){
		{
			double res=0;
			if(n==null)
				return res=0;
			else
			{
				if(Hoja(n)) 
				{
					String aux = n.getInformacion();
					try {
						res = Double.parseDouble(aux);
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("error de conversion");
					}

				}else
				{
					double vizq =operacion(n.getNodoIzquierdo());
					double vder = operacion(n.getNodoDerecho());
					String op =n.getInformacion();

					switch(op)
					{
					case "+" : res = vizq + vder;break;
					case "-" : res = vizq - vder;break;
					case "*" : res = vizq * vder;break;
					case "/" : res = vizq / vder;break;
					case "%" : res = vizq % vder;break;
					default:; break;
					}
				}  
			}
			return res;
		}


	}


}

