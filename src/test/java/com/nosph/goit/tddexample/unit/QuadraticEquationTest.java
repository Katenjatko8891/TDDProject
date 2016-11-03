package com.nosph.goit.tddexample.unit;

import static com.nosph.goit.tddexample.QuadraticEquationImpl.create;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.nosph.goit.tddexample.contract.QuadraticEquationResult;

/*******************************************************************************
 *
 * @author Serhii Holovchuk
 * Date: 03-11-2016
 * Time: 18:49:45
 *
 *******************************************************************************/
public class QuadraticEquationTest {

	/**
	 * Test case: 5x2 + 3x + 7
	 * solutions: no
	 */
	@Test
	public void hasNoSolutions() {
		QuadraticEquationResult result = create(5, 3, 7).solve();
		
		assertFalse(result.hasSolution());
	}
	
	/**
	 * Test case: x2 + 12x + 36
	 * solutions: -6
	 */
	@Test
	public void hasSingleSolution() {
		
		List<Double> expectedSolutions = Arrays.asList(-6.0);
		
		QuadraticEquationResult result = create(1, 12, 36).solve();
		List<Double> actualSolutions = result.getSolutions();
		
		assertThat(actualSolutions, hasSize(1));
		assertThat(actualSolutions, equalTo(expectedSolutions));
	}
	
	/**
	 * Test case: x2 − 2x − 3
	 * solutions: 3, -1
	 */
	@Test
	public void hasTwoSolutions_1() {
		List<Double> expectedSolutions = Arrays.asList(3.0, -1.0);
		
		QuadraticEquationResult result = create(1, -2, -3).solve();
		List<Double> actualSolutions = result.getSolutions();
		
		assertThat(actualSolutions, hasSize(2));
		assertThat(actualSolutions, equalTo(expectedSolutions));
	}
	
	/**
	 * Test case: −x2 − 2x + 15
	 * solutions: -5, 3
	 */
	@Test
	public void hasTwoSolutions_2() {
		List<Double> expectedSolutions = Arrays.asList(-5.0, 3.0);
		
		QuadraticEquationResult result = create(-1, -2, 15).solve();
		List<Double> actualSolutions = result.getSolutions();
		
		assertThat(actualSolutions, hasSize(2));
		assertThat(actualSolutions, equalTo(expectedSolutions));
	}
	
	/**
	 * Test case: 5x2 + 3x + 7
	 * solutions: no
	 */
	@SuppressWarnings("unused")
	@Test(expected = IllegalStateException.class)
	public void hasNoSolutionsAndInvokeGetSolutions() {
		QuadraticEquationResult result = create(5, 3, 7).solve();
		assertFalse(result.hasSolution());
		List<Double> solutions = result.getSolutions();
	}
}
