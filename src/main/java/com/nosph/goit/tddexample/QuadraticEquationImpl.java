package com.nosph.goit.tddexample;

import com.nosph.goit.tddexample.contract.QuadraticEquation;
import com.nosph.goit.tddexample.contract.QuadraticEquationResult;

/*******************************************************************************
 *
 * @author Serhii Holovchuk
 * Date: 03-11-2016
 * Time: 18:46:20
 *
 *******************************************************************************/
public class QuadraticEquationImpl implements QuadraticEquation {

	public static QuadraticEquationImpl create(double a, double b, double c){
		return new QuadraticEquationImpl(a, b ,c);
	}
	
	private QuadraticEquationImpl(double a, double b, double c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public QuadraticEquationResult solve() {
		throw new UnsupportedOperationException();
	}
}
