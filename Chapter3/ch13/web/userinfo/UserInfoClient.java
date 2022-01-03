package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		// 파일 읽어들이기
		FileInputStream fis = new FileInputStream("db.properties");

		// key, value 값을 쌍으로(페어) 읽어들이는 객체.
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");	// 이에 해당되는 value 값을 반환
	
		// 지금은 웹페이지가 없으므로 객체 생성해서.
		UserInfo userInfo = new UserInfo();	
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;	// 어떤 것을 쓸지 아직 안정함.
	
		if( dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} 
		else if( dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
