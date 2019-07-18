package polling;

public class candidate {

	 private String username;
	 private String password;
	private String party;
	 candidate(){}
	public candidate(String username, String password, String party) {
		super();
		this.username = username;
		this.password = password;
		this.party = party;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "candidate [username=" + username + ", password=" + password + ", party=" + party + "]";
	}
	 
	 
}	