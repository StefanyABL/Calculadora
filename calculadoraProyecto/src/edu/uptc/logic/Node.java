package edu.uptc.logic;

public class Node {
    
    private String informacion;
    private Node padre;
    private Node nodoIzquierdo;
    private Node nodoDerecho;
    
    public Node(){
    this.informacion="";
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;  
    this.padre=null;
    }
    public Node(String informacion){
    this.informacion=informacion;
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;
    this.padre=null;    
    }

  public  Node(Node op1, String pop, Node op2) {
      this.nodoDerecho=op1;
      this.informacion=pop;
      this.nodoIzquierdo=op2;
      this.padre=null;
      
    }

  
    
    
    
    
    
    public Node getPadre() {
        return padre;
    }

    public void setPadre(Node padre) {
        this.padre = padre;
    }
    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Node getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Node nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Node getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Node nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
    
    
}
