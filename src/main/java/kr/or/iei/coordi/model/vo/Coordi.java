package kr.or.iei.coordi.model.vo;

import java.sql.Date;

public class Coordi {
	private int coordiNo;
	private String userId;
	private String coordiContent;
	private String gender;
	private String season;
	private String temperature;
	private Date regDate;
	private String hashTag;
	private char delYN;
	private String coordiImgOriginalName;
	private String coordiImgChangedName;
	private String filePath;
	
	
	public Coordi() {
		super();
	}
	
	public Coordi(int coordiNo, String userId, String coordiContent, String gender, String season, String temperature,
			Date regDate, String hashTag, char delYN, String coordiImgOriginalName, String coordiImgChangedName,
			String filePath) {
		super();
		this.coordiNo = coordiNo;
		this.userId = userId;
		this.coordiContent = coordiContent;
		this.gender = gender;
		this.season = season;
		this.temperature = temperature;
		this.regDate = regDate;
		this.hashTag = hashTag;
		this.delYN = delYN;
		this.coordiImgOriginalName = coordiImgOriginalName;
		this.coordiImgChangedName = coordiImgChangedName;
		this.filePath = filePath;
	}
	public int getCoordiNo() {
		return coordiNo;
	}
	public void setCoordiNo(int coordiNo) {
		this.coordiNo = coordiNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCoordiContent() {
		return coordiContent;
	}
	public void setCoordiContent(String coordiContent) {
		this.coordiContent = coordiContent;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getHashTag() {
		return hashTag;
	}
	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}
	public char getDelYN() {
		return delYN;
	}
	public void setDelYN(char delYN) {
		this.delYN = delYN;
	}
	public String getCoordiImgOriginalName() {
		return coordiImgOriginalName;
	}
	public void setCoordiImgOriginalName(String coordiImgOriginalName) {
		this.coordiImgOriginalName = coordiImgOriginalName;
	}
	public String getCoordiImgChangedName() {
		return coordiImgChangedName;
	}
	public void setCoordiImgChangedName(String coordiImgChangedName) {
		this.coordiImgChangedName = coordiImgChangedName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
