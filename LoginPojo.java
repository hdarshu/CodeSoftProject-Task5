
public class LoginPojo {

	 public String u,p;

	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginPojo(String u, String p) {
		super();
		this.u = u;
		this.p = p;
	}

	public String getU() {
		return u;
	}

	public void setU(String u) {
		this.u = u;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "LoginPojo [u=" + u + ", p=" + p + "]";
	}
	 
	 
	
}
