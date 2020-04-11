package com.example.calculadora;

import java.text.DecimalFormat;

public class SalarioLiquido {
    public static String calcular(Double valor){
        Double salario = 0.0;
        /*Máscara de formato de valor*/
        DecimalFormat df2 = new DecimalFormat("#.00");
        if (valor <= 1800.00) {
            salario = (valor * 0.91);
        }
        else if (valor > 1800.00 && valor <= 2750.00){
            salario = (valor * 0.90);
        }else if (valor > 2750.00 && valor <= 4780.00){
            salario = (valor * 0.895);
        }else if (valor > 4780.00){
            salario = (valor * 0.88);
        }
        return "R$ "+df2.format(salario);
    }
}
