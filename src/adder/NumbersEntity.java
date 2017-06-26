package adder;

/**
 * 
 * @author 10067320
 *
 */
public class NumbersEntity {

	private int firstNumber;

	private int secondNumber;

	/**
	 * 
	 */
	public NumbersEntity() {
		super();
	}

	/**
	 * 
	 * @param firstNumber
	 */
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	/**
	 * 
	 * @param secondNumber
	 */
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getResult() {
		// TODO: write JML/OCL for this!
		// See: testGetResultWhenFirstNumberIsMAX_VALUEAndSecondIsOne()
		return firstNumber + secondNumber;
	}
}
