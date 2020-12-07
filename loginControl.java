
class loginControl{
	private DataManager dataManager;
	
	public bool checkUsername(String userID, String sha1){
		return dataManager.login(userID, sha1);
	}
	
	public String convertPassword(String password){
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes());
		
		byte[] md = md.digest();
		
		StringBuffer hex = new StringBuffer();
		
		for(int i = 0; i < digest.length; i++){
			hex.append(Integer.toHexString(0xFF & digest[i]));
		}
		
		return hex.toString();
	}
	
	public UserAccount getUserObject(String userID){
		return dataManager.getUserObject(userID);
	}
	
	
}