package com.company.myapp09.homework.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.myapp09.homework.vo.Member;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;
	
	public int insertMember(Member member) {
		System.out.println("member: "+ member);
		return sqlSession.insert("Member.signUp", member);
	}
	
}
