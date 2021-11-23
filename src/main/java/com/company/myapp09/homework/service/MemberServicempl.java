package com.company.myapp09.homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.myapp09.homework.dao.MemberDao;
import com.company.myapp09.homework.vo.Member;


@Service("memberServcie")
public class MemberServicempl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public int insertMember(Member member) throws Exception {
		return memberDao.insertMember(member);
	}
}
