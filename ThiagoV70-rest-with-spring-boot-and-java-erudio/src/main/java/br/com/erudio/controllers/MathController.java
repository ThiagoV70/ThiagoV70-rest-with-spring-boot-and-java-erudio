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

    private double ConvertToDouble(String number) {
        return 1D;
    }

    private boolean isNumeric(String number) {
        return true;
    }
}

