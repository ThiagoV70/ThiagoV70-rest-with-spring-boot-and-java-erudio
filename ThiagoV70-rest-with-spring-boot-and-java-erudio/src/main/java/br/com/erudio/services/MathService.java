package br.com.erudio.services;

import br.com.erudio.util.NumberConverter;

public class MathService {

    public Double sum(String numberOne, String numberTwo) {
        return NumberConverter.ConvertToDouble(numberOne) + NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo) {
        return NumberConverter.ConvertToDouble(numberOne) - NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) {
        return NumberConverter.ConvertToDouble(numberOne) * NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) {
        return NumberConverter.ConvertToDouble(numberOne) / NumberConverter.ConvertToDouble(numberTwo);
    }

    public Double mean(String numberOne, String numberTwo) {
        return (NumberConverter.ConvertToDouble(numberOne) + NumberConverter.ConvertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String numberOne) {
        return Math.sqrt(NumberConverter.ConvertToDouble(numberOne));
    }
}
