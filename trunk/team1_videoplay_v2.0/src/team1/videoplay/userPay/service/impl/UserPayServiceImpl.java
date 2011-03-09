package team1.videoplay.userPay.service.impl;

import java.util.ArrayList;
import java.util.Properties;

import team1.videoplay.userPay.dao.UserPayDao;
import team1.videoplay.userPay.factory.UserPayDaoFactory;
import team1.videoplay.userPay.model.UserPay;
import team1.videoplay.userPay.service.UserPayService;
import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;

public class UserPayServiceImpl implements UserPayService {
	//����ʵ�֣���������дÿ��service��
	private static UserPayDao upd;
	private UserPayServiceImpl(){};
	private static UserPayService ups=new UserPayServiceImpl();
	public static UserPayService getInstance(){
		return ups;
	}
	static {
		Properties prop = PropUtils.loadProp(UserPayService.class, "/file.properties");//��ȡ�ļ�
		String name = prop.getProperty("userpaydaoname");				//�õ��ļ����appealdaoname
		upd = UserPayDaoFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
	}
	public int addUserPay(UserPay userpay) {
		return upd.addUserPay(userpay);
	}

	public int deleteUserPay(int userpay_id) {
		return upd.deleteUserPay(userpay_id);
	}

	public FenYe getAllUserPay(int page) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int userpayCount = upd.getUserPayCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)userpayCount/pageSize));//�õ���ҳ��
		fenye.setList(upd.getAllUserPay(page, pageSize));
		return fenye;
	}

	public UserPay getUserPay(int userpay_id) {
		return upd.getUserPay(userpay_id);
	}

	public int getUserPayCount() {
		return upd.getUserPayCount();
	}
	//��
	public ArrayList<UserPay> getAllUserPayByUserID(int userID){
		return upd.getAllUserPayByUserID(userID);
	}
}
