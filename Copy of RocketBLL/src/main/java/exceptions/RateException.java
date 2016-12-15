package exceptions;

public class RateException extends Exception {

	
	public RateDomainModel ratedm;
	
	public RateException(RateDomainModel ratedm){
		this.ratedm = ratedm;
	}
	
	public RateDomainModel getRateDomainModel(){
		return this.rdm;
	}
	
}
