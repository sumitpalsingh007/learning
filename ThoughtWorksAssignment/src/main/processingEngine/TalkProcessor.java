package main.processingEngine;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import main.data.Talk;
import main.data.Tracks;

public class TalkProcessor {

	public List<Tracks> getTracks() {
		return tracks;
	}
	private static Date lunchStartTime;
	private static Date lunchEndTime;
	private static Date networkingStartTime;
	private static Date networkingEndTime;
	public TalkProcessor(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY,12);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND, 0);
		lunchStartTime=new Date(cal.getTimeInMillis());

		cal.set(Calendar.HOUR_OF_DAY,13);
		cal.set(Calendar.MINUTE,0);
		lunchEndTime=new Date(cal.getTimeInMillis());
		cal.set(Calendar.HOUR_OF_DAY,16);
		cal.set(Calendar.MINUTE,0);
		networkingStartTime=new Date(cal.getTimeInMillis());
		cal.set(Calendar.HOUR_OF_DAY,17);
		cal.set(Calendar.MINUTE,0);
		networkingEndTime=new Date(cal.getTimeInMillis());
	}

	List<Tracks> tracks= new ArrayList();

	public void processTask(Talk talk){

		for(Tracks track :tracks){

			Calendar cal = Calendar.getInstance();
			cal.setTime(track.getEndingTime());
			if(cal.getTime().before(lunchStartTime)){
				cal.add(Calendar.MINUTE, talk.getDuration());
				if(cal.getTime().before(lunchStartTime)){
					track.setEndingTime(cal.getTime());
					track.getTalks().add(talk);
					return;
				}
			}
			if(cal.getTime().after(lunchStartTime) && cal.getTime().before(lunchEndTime)){
				cal.setTime(lunchEndTime);
				cal.add(Calendar.MINUTE, talk.getDuration());
				if(cal.getTime().before(networkingEndTime)){
					track.setEndingTime(cal.getTime());
					track.getTalks().add(talk);
					return;
				}
			}
			if(cal.getTime().after(lunchEndTime) && cal.getTime().before(networkingStartTime)){
				cal.add(Calendar.MINUTE, talk.getDuration());
				if(cal.getTime().before(networkingEndTime)){
					track.setEndingTime(cal.getTime());
					track.getTalks().add(talk);
					return;
				}
			}
		}
		tracks.add(createNewTrack(talk));
	}

	private Tracks createNewTrack(Talk t){
		Tracks track = new Tracks();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY,9);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND, 0);
		track.setBeginningiIme(cal.getTime());
		cal.add(Calendar.MINUTE, t.getDuration());
		track.setEndingTime(cal.getTime());
		track.getTalks().add(t);
		return track;
	}

}
