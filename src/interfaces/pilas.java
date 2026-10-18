package interfaces;

import Excepciones.ExcepcionDesbordamientoDeDatos;
import Excepciones.ExcepcionPilaVacia;

public interface pilas<E> {
    void push (E item) throws ExcepcionDesbordamientoDeDatos;
    E pop () throws ExcepcionPilaVacia;
    boolean isEmpty();
    E peek() throws ExcepcionPilaVacia;
    int search (E item) throws ExcepcionPilaVacia;
    int length();
}
