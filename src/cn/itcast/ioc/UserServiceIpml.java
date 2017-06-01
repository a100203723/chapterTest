package cn.itcast.ioc;

public class UserServiceIpml implements UserService {
	private UserDao userDao;

	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		this.userDao.save();
		System.out.println("spring:hello world");
	}

}
