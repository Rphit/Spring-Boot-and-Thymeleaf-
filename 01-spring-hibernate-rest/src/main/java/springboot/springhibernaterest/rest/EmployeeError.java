package springboot.springhibernaterest.rest;

public class EmployeeError {
	
	
	private int status;
	private String message;
	private long timeOccured;
	public EmployeeError() {
		super();
	}
	public EmployeeError(int status, String message, long timeOccured) {
		super();
		this.status = status;
		this.message = message;
		this.timeOccured = timeOccured;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeOccured() {
		return timeOccured;
	}
	public void setTimeOccured(long timeOccured) {
		this.timeOccured = timeOccured;
	}
}


