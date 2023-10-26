package projects.exception;

@SuppressWarnings("serial")
public class DbExceptions extends RuntimeException {

	public DbExceptions(String message) {
		super(message);
	}
	
	public DbExceptions(Throwable cause) {
		super(cause);
	}
	
	public DbExceptions(String message, Throwable cause) {
		super(message,cause);
	}

}
