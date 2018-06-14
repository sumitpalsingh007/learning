package main.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tracks {
	
	private Date beginningiIme;
	private Date endingTime;
	private List<Talk> talks=new ArrayList();
	
	
	public Date getBeginningiIme() {
		return beginningiIme;
	}
	public void setBeginningiIme(Date beginningiIme) {
		this.beginningiIme = beginningiIme;
	}
	public Date getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(Date endingTime) {
		this.endingTime = endingTime;
	}
	public List<Talk> getTalks() {
		return talks;
	}
	public void setTalks(List<Talk> talks) {
		this.talks = talks;
	}

	
}
