package br.com.erudio.util;

public class NumberConverter {

    public static Double ConvertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null  || strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value") ;
        String number  = strNumber.replaceAll(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null  || strNumber.isEmpty()) return false;
        String number  = strNumber.replaceAll(",", ".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }

    public static void validateNumbers(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
    }
    public static void validateNumber(String number) {
        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedOperationException("Please set a numeric value");
        }
    }
}
