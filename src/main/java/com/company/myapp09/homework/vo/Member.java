package com.company.myapp09.homework.vo;

import java.sql.Date;

//MEMBER_ID	VARCHAR2(30 BYTE)
//MEMBER_PWD	VARCHAR2(100 BYTE)
//MEMBER_NM	VARCHAR2(15 BYTE)
//MEMBER_ENROLL_DT	DATE

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberNm;
	private Date enrollDt;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public Date getEnrollDt() {
		return enrollDt;
	}
	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm + ", enrollDt="
				+ enrollDt + "]";
	}
	
	
	
	
}
