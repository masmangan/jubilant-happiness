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

	public int getResult() {
		return firstNumber + secondNumber;
	}
}
