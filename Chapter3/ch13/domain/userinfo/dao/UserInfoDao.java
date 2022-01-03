package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

// User에 대한 DB operation 할 때 구현해야 하는 기능은 이거이거다 라고 선언
public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
