package day4;

public enum MyAppErrors {
	
	ERROR1(101,"Your Username entered is %s, Username must be minimum 3 chars"),
	ERROR2(102,"Your Passoword entered is %s, Password must be minimum 8 chars");
	
	private int errorCode;
	private String errorMessage;
	
	private MyAppErrors(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
