package com.revature.beans;

public class VideoGame {
	// need to match HTML form names
	private int vgID;
	private String vgName;
	private int vgMetaScore;
	
	public VideoGame() {
		super();
	}
	public VideoGame(int vgID, String vgName, int vgMetaScore) {
		super();
		this.vgID = vgID;
		this.vgName = vgName;
		this.vgMetaScore = vgMetaScore;
	}

	public int getVgID() {
		return vgID;
	}

	public void setVgID(int vgID) {
		this.vgID = vgID;
	}

	public String getVgName() {
		return vgName;
	}

	public void setVgName(String vgName) {
		this.vgName = vgName;
	}

	public int getVgMetaScore() {
		return vgMetaScore;
	}

	public void setVgMetaScore(int vgMetaScore) {
		this.vgMetaScore = vgMetaScore;
	}

	@Override
	public String toString() {
		return "VideoGame [vgID=" + vgID + ", vgName=" + vgName + ", vgMetaScore=" + vgMetaScore + "]";
	}

}
