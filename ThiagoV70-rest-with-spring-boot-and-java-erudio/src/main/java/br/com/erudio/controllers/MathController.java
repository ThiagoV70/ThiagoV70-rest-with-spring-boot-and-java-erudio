package br.com.erudio.controllers;

import br.com.erudio.services.MathService;
import br.com.erudio.util.NumberConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.erudio.util.NumberConverter.validateNumber;
import static br.com.erudio.util.NumberConverter.validateNumbers;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService =  new MathService();

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum (@PathVariable String numberOne, @PathVariable String numberTwo) {
        validateNumbers(numberOne, numberTwo);
        return mathService.sum(numberOne, numberTwo);
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction (@PathVariable String numberOne, @PathVariable String numberTwo) {
        validateNumbers(numberOne, numberTwo);
        return mathService.subtraction(numberOne, numberTwo);
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication (@PathVariable String numberOne, @PathVariable String numberTwo) {
        validateNumbers(numberOne, numberTwo);
        return mathService.multiplication(numberOne, numberTwo);
    }

    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division (@PathVariable String numberOne, @PathVariable String numberTwo) {
        validateNumbers(numberOne, numberTwo);
        return mathService.division(numberOne, numberTwo);
    }

    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean (@PathVariable String numberOne, @PathVariable String numberTwo) {
        validateNumbers(numberOne, numberTwo);
        return mathService.mean(numberOne, numberTwo);
    }

    @GetMapping("/squareRoot/{numberOne}")
    public Double squareRoot (@PathVariable String numberOne) {
        validateNumber(numberOne);
        return mathService.squareRoot(numberOne);
    }
}

