package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return ConvertToDouble(numberOne) + ConvertToDouble(numberTwo);

    }

    private double ConvertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null  || strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value") ;
        String number  = strNumber.replaceAll(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null  || strNumber.isEmpty()) return false;
        String number  = strNumber.replaceAll(",", ".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return ConvertToDouble(numberOne) - ConvertToDouble(numberTwo);
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public double multiplication (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return ConvertToDouble(numberOne) * ConvertToDouble(numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public double division (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return ConvertToDouble(numberOne) / ConvertToDouble(numberTwo);
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public double mean (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return (ConvertToDouble(numberOne) + ConvertToDouble(numberTwo)) / 2;
    }

    @RequestMapping("/squareRoot/{numberOne}")
    public double squareRoot (
            @PathVariable("numberOne") String numberOne) throws Exception {

        if (!isNumeric(numberOne))
            throw new UnsupportedOperationException("Please set a numeric value");
        return Math.sqrt(ConvertToDouble(numberOne));
    }
}

