package com.airis.videosplitter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VideoFile {
    @JsonProperty("file_path")
    private String filePath;

    @JsonProperty("duration")
    private int duration;

    @JsonProperty("startdatetime")
    private String startDatetime;


	

    public VideoFile() {
		super();
	}


	public VideoFile(String filePath, int duration, String startDatetime) {
		this.filePath = filePath;
		this.duration = duration;
		this.startDatetime = startDatetime;
		
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getStartDatetime() {
		return startDatetime;
	}


	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
	}


	

	@Override
	public String toString() {
		return "VideoFile [filePath=" + filePath + ", duration=" + duration + ", startDatetime=" + startDatetime
				+ "]";
	}
	
    
}


