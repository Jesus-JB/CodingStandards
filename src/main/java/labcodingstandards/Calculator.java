// Copyright (C) 2025

package labcodingstandards;

import java.util.Scanner;


/**
 * Calculadora de consola con las cuatro operaciones basicas.
 *
 * @author Jesus-JB
 */
public class Calculator {	
	
	/**
	 * Punto de entrada: lee el operador y dos numeros e imprime el resultado.
	 *
	 * @param args argumentos de linea de comandos (no se usan)
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}

	/**
	 * Aplica la operacion indicada sobre los dos operandos.
	 *
	 * @param first primer operando
	 * @param second segundo operando
	 * @param operator codigo de la operacion ('1' suma, '2' resta, '3' multiplicacion, '4' division)
	 * @return mensaje con el resultado o con el error si el operador no es valido
	 */
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
