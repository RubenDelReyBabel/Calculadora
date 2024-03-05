package es.neesis.annotations.services;

import es.neesis.annotations.exceptions.OperationNotFound;

public interface ICalculadoraService {

    double compute(int operation, double operand1, double operand2) throws OperationNotFound;
}
