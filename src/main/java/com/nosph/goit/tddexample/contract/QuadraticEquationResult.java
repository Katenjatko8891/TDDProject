/**
 * 
 */
package com.nosph.goit.tddexample.contract;

import java.util.List;

/*******************************************************************************
 *
 * @author Serhii Holovchuk
 * Date: 03-11-2016
 * Time: 18:43:11
 *
 *******************************************************************************/
public interface QuadraticEquationResult {
	boolean hasSolution();
	List<Double> getSolutions() throws IllegalStateException;
}
