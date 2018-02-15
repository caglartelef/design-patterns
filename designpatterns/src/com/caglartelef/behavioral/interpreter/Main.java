package com.caglartelef.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ThousandExpression thousandExpression = new ThousandExpression(); Context
		 * context = new Context("MMMMMM");
		 * 
		 * thousandExpression.interpret(context);
		 * System.out.println(context.getOutput());
		 */

		String roman = "MMXV";
		// String roman = "MCMXXVIII";
		// String roman = "MDLV";
		// String roman = "MCMVII";
		Context context = new Context(roman);

		// Build the 'parse tree'
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		// Interpret
		for (Iterator it = tree.iterator(); it.hasNext();) {
			Expression exp = (Expression) it.next();
			exp.interpret(context);
		}

		System.out.println(roman + " = " + Integer.toString(context.getOutput()));

	}

}
