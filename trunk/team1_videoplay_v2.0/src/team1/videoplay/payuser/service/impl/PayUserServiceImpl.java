package team1.videoplay.payuser.service.impl;

import java.util.ArrayList;
import java.util.Properties;

import team1.videoplay.payuser.dao.PayUserDao;
import team1.videoplay.payuser.factory.PayUserDaoFactory;
import team1.videoplay.payuser.model.PayUser;
import team1.videoplay.payuser.service.PayUserService;
import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;

public class PayUserServiceImpl implements PayUserService {
	private static PayUserDao pd;
	private PayUserServiceImpl(){};
	private static PayUserService ps=new PayUserServiceImpl();
	public static PayUserService getInstance(){
		return ps;
	}
	static {
		Properties prop = PropUtils.loadProp(PayUserService.class, "/file.properties");//��ȡ�ļ�
		String name = prop.getProperty("payuserdaoname");				//�õ��ļ����PayUserdaoname
		pd = PayUserDaoFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
	}
	
	public int addPayUser(PayUser payuser) {
		return pd.addPayUser(payuser);
	}

	public int deletePayUser(int payuserId) {
		return pd.deletePayUser(payuserId);
	}

	public FenYe getAllPayUser(int page) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int payuserCount = pd.getPayUserCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)payuserCount/pageSize));//�õ���ҳ��
		fenye.setList(pd.getAllPayUser(page, pageSize));
		return fenye;
	}

	public PayUser getPayUser(int payuserId) {
		return pd.getPayUser(payuserId);
	}

	public int getPayUserCount() {
		return pd.getPayUserCount();
	}

	public int updatePayUser(float supplyMoney, int payuserID) {
		return pd.updatePayUser(supplyMoney,payuserID);
	}
	//��
	public ArrayList<PayUser> getAllPayUserByUserID(int userID) {
		return pd.getAllPayUserByUserID(userID);
	}
}
