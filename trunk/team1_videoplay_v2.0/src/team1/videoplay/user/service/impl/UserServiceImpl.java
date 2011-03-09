package team1.videoplay.user.service.impl;
import java.util.Properties;

import team1.videoplay.exception.PasswordIsErrorException;
import team1.videoplay.exception.UserNotFoundException;
import team1.videoplay.user.dao.UserDao;
import team1.videoplay.user.factory.UserDaoFactory;
import team1.videoplay.user.model.User;
import team1.videoplay.user.service.UserService;
import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;

public class UserServiceImpl implements UserService {
	//����ʵ�֣���������дÿ��service��
	private static UserDao ud;
	private UserServiceImpl(){};
	private static UserService us=new UserServiceImpl();
	public static UserService getInstance(){
		return us;
	}
	static {
		Properties prop = PropUtils.loadProp(UserService.class, "/file.properties");//��ȡ�ļ�
		String name = prop.getProperty("userdaoname");				//�õ��ļ����appealdaoname
		ud = UserDaoFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
	}
	
	public int addUser(User user) {
		return ud.addUser(user);
	}

	public int deleteUser(int userId) {
		return ud.deleteUser(userId);
	}
	/**
	 * һ��Ҫע�⣬ֻҪ�Ƿ�ҳ�Ĳ�ѯ������д�������£�utils������һ��FenYe��װ�࣬�������������ԣ� pageSize; page;pagecount;list;
	 * pageSize�ƶ�ÿҳ��ʾ�ļ�¼����page�ǵ�ǰҳ��pagecount����ҳ����list�ǲ��ҳ������н���������Ӧ�ã�������һ������
	 */
	public FenYe getAllUser(int page) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int userCount = ud.getUserCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)userCount/pageSize));//�õ���ҳ��
		fenye.setList(ud.getAllUser(page, pageSize));
		return fenye;
	}

	public User getUser(int userId) {
		return ud.getUser(userId);
	}
	public int getUserCount(){
		return ud.getUserCount();
	}

	public User getUserByUserName(String username) {
		return ud.getUserByUserName(username);
	}

	public int updateUser(User userId) {
		return ud.updateUser(userId);
	}

	public int updateUserStatus(User user) {
		return ud.updateUserStatus(user);
	}

	public int userMoneyModify(float money, int userId) {
		return ud.userMoneyModify(money, userId);
	}
	
	 public User Login(String username,String password){
    	 User user=ud.getUserByUserName(username);
    	 if(user==null){
    		 throw new UserNotFoundException();//����Ա��Ϊ�գ��׳��쳣 UserNotFoundException()
    	 }else{
    		 if(!password.equals(user.getUser_password())){
    			 throw new PasswordIsErrorException();//�����벻��ȷ���׳��쳣 PasswordIsErrorException()
    		 }
    	 }
    	 return user;
     }
	 public int userScoreModify(long userPoint, int userId){
		 return ud.userScoreModify(userPoint, userId);
	 }
	public User getUserByEmail(String email) {
		return ud.getUserByEmail(email);
	}
}
