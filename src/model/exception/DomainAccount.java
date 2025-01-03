package model.exception;

public class DomainAccount extends RuntimeException {
	private static final long serialVersionUID = 1L;

	
	public DomainAccount(String msg) {
		super(msg);
	}
	

}
