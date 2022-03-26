package chainofresponsibility.middleware.bean;

public class Request {
	private String email;
	private String password;
	private String ip;
	
	public Request(String email, String password, String ip) {
		this.email = email;
		this.password = password;
		this.ip = ip;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getIp() {
		return ip;
	}
	
}
