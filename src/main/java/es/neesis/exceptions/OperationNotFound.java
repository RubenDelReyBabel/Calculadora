package es.neesis.exceptions;

public class OperationNotFound extends Exception{

    public OperationNotFound(){
        super("Operación no válida");
    }
}
