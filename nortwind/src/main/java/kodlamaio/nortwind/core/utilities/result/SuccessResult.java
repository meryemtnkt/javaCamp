package kodlamaio.nortwind.core.utilities.result;

public class SuccessResult extends Result {

	//işlem sonucu başarılı
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
		
	}

}
