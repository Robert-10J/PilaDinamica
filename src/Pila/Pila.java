package Pila;
import javax.swing.*;
public class Pila {

    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String lista = "";

    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }

    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia(){
        return ultimoValorIngresado == null;
    }

    //Metodo para insertar un nodo en la pila
    public void insertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siquiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;
        tamano++;
    }

    //Metodo para eliminar un nodo de la pila
    public int eliminarNodo(){
        int aux = ultimoValorIngresado.info;
        ultimoValorIngresado = ultimoValorIngresado.siquiente;
        tamano--;
        return aux;
    }

    //Metodo para conocer el ultimo valor ingresado
    public int mostrarUltimoValorIngresado(){
        return ultimoValorIngresado.info;
    }

    //Metodo para conocer el tamaño de la pila
    public int tamanoPila(){
     return tamano;
    }

    //Metodo para vaciar pila
    public void vaciarPila(){
        while(!pilaVacia()){
            eliminarNodo();
        }
    }

    //Metodo para mostrar datos de la pila
    public void mostrarDatos(){
        Nodo recorrer = ultimoValorIngresado;
        while(recorrer != null){
            lista += recorrer.info + " ";
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}
