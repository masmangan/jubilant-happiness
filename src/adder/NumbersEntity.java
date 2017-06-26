package adder;

public class NumbersEntity {

	private int firstNumber;

	private int secondNumber;

	public NumbersEntity() {
		super();
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	/**
	 * 
	 * @return
	 */
	public int getResult() {
		// TODO: write OCL for this!
		// See: testGetResultWhenFirstNumberIsMAX_VALUEAndSecondIsOne()
		return firstNumber + secondNumber;
	}
}
