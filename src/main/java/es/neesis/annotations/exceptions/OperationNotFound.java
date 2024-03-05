package es.neesis.annotations.exceptions;

public class OperationNotFound extends Exception{

    public OperationNotFound(){
        super("Operación no válida");
    }
}
