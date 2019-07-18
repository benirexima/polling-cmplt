package polling;

class Voter {
	private int voterid;
	private String username;
	private String password;
	
Voter(){}
	

	public Voter(int voterid, String username, String password) {
	super();
	this.voterid = voterid;
	this.username =username;
	this.password = password;
}


	public int getVoterId() {
		return voterid;
	}

	public void setVoterId(int id) {
		this.voterid = voterid;
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


	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ",username=" + username + ", password=" + password + "]";
	}

	
	
}
