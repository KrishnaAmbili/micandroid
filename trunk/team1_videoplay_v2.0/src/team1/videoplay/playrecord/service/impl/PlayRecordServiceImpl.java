package team1.videoplay.playrecord.service.impl;

import java.util.ArrayList;
import java.util.Properties;

import team1.videoplay.playrecord.dao.PlayRecordDao;
import team1.videoplay.playrecord.fatory.PlayRecordDaoFactory;
import team1.videoplay.playrecord.model.PlayRecord;
import team1.videoplay.playrecord.service.PlayRecordService;
import team1.videoplay.utils.FenYe;
import team1.videoplay.utils.PropUtils;

public class PlayRecordServiceImpl implements PlayRecordService {
	private static PlayRecordDao prd;
	private PlayRecordServiceImpl(){};
	private static PlayRecordService prs=new PlayRecordServiceImpl();
	public static PlayRecordService getInstance(){
		return prs;
	}
	static {
		Properties prop = PropUtils.loadProp(PlayRecordService.class, "/file.properties");//��ȡ�ļ�
		String name = prop.getProperty("playrecorddaoname");				//�õ��ļ����PayUserdaoname
		prd = PlayRecordDaoFactory.getInstance(name);						//ͨ�������õ�һ��AppealDao����
	}
	public int addPlayRecord(PlayRecord playRecord) {
		return prd.addPlayRecord(playRecord);
	}

	public int deletePlayRecord(int playrecordID) {
		return prd.deletePlayRecord(playrecordID);
	}

	public FenYe getAllPlayRecord(int page) {
		FenYe fenye = new FenYe();
		fenye.setPage(page);
		int playrecordCount = prd.getPlayRecordCount();//dao�����¼���������м�¼���ķ���
		int pageSize = FenYe.pageSize;//pageSize����FenYe���ﶨ��ĳ���
		fenye.setPagecount((int)Math.ceil((double)playrecordCount/pageSize));//�õ���ҳ��
		fenye.setList(prd.getAllPlayRecord(page, pageSize));
		return fenye;
	}

	public PlayRecord getPlayRecord(int playrecordID) {
		return prd.getPlayRecord(playrecordID);
	}

	public int getPlayRecordCount() {
		// TODO Auto-generated method stub
		return prd.getPlayRecordCount();
	}
	public ArrayList<PlayRecord> getPlayRecordByUserID(int userID){
		return prd.getPlayRecordByUserID(userID);
	}
	//��
	public ArrayList<PlayRecord> getAllPlayRecordByVideoID(int videoID){
		return prd.getAllPlayRecordByVideoID(videoID);
	}
	//��
	public ArrayList<PlayRecord> getAllPlayRecordByUserID(int userID) {
		return prd.getAllPlayRecordByUserID(userID);
	}

}
