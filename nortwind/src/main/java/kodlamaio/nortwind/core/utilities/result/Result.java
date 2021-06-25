package kodlamaio.nortwind.core.utilities.result;

public class Result { //super type
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success=success;
		
	}
	public Result(boolean success,String message) {
		this.success=success;
		this.message=message;
	}
	
	//getter
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}

}
