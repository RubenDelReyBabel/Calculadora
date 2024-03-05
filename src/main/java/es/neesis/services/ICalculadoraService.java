package es.neesis.services;

import es.neesis.exceptions.OperationNotFound;

public interface ICalculadoraService {

    double compute(int operation, double operand1, double operand2) throws OperationNotFound;
}
