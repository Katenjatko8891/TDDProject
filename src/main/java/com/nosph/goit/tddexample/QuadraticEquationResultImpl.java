package com.nosph.goit.tddexample;

import java.util.List;

import com.nosph.goit.tddexample.contract.QuadraticEquationResult;

/*******************************************************************************
 *
 * @author Serhii Holovchuk
 * Date: 03-11-2016
 * Time: 18:48:09
 *
 *******************************************************************************/
public class QuadraticEquationResultImpl implements QuadraticEquationResult {

	@Override
	public boolean hasSolution() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Double> getSolutions() throws IllegalStateException {
		throw new UnsupportedOperationException();
	}
}
