package PensionerDetails.exception;

@SuppressWarnings("serial")
public class MyCustomException extends RuntimeException {
	
	MyCustomException(String message)
	{
		super(String.format("AadharNumberNotFound" ,message));
	}
}

