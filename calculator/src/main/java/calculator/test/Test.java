package calculator.test;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Test {

	public static void main(String[] args) {

		
		Expression e = new ExpressionBuilder("pi ")
               
                .build();
               
        double result = e.evaluate();
        System.out.println(result);
	}
}
