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

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new IllegalArgumentException();
        return ConvertToDouble(numberOne) + ConvertToDouble(numberTwo);

    }

    private double ConvertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null  || strNumber.isEmpty()) throw new IllegalArgumentException();
        String number  = strNumber.replaceAll(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null  || strNumber.isEmpty()) return false;
        String number  = strNumber.replaceAll(",", ".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }
}

