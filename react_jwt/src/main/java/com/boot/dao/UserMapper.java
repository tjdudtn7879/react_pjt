package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.UserAuth;
import com.boot.dto.Users;

@Mapper
public interface UserMapper {
	//	회원 등록
	public int insert(Users users);
	//	회원 조회
	public Users select(int userNo);
	//	로그인
	public Users login(String user_id);
	//	회원 수정
	public int update(Users users);
	//	회원 삭제
	public int delete(String user_id);
	//	회원 권한 등록
	public int insertAuth(UserAuth userAuth);
}
