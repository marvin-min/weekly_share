	/**
	 * if user is not exist retun null;
	 * @param uid
	 * @return
	 */
	public String getUserAddress(String uid) {
		//dosomething
		User u = findById(uid);
		if(u!=null) {
			return u.getuserID();
		}
		return  null;
	}