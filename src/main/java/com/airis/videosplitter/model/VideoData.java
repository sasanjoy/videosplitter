package com.airis.videosplitter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VideoData {
    @JsonProperty("tmp_store_path")
    private String tmpStorePath;

    @JsonProperty("source_path")
    private String sourcePath;

    //@JsonProperty("tmp_path")
    //private String tmpPath;

    @JsonProperty("instanceID")
    private String instanceID;

    @JsonProperty("video_list")
    private List<VideoFile> videoList;

    
    
    
    
	public VideoData() {
		super();
	}





    public VideoData(String tmpStorePath, String sourcePath, String instanceID, List<VideoFile> videoList) {
        this.tmpStorePath = tmpStorePath;
        this.sourcePath = sourcePath;
        this.instanceID = instanceID;
        this.videoList = videoList;
    }





    public String getTmpStorePath() {
        return tmpStorePath;
    }





    public void setTmpStorePath(String tmpStorePath) {
        this.tmpStorePath = tmpStorePath;
    }





    public String getSourcePath() {
        return sourcePath;
    }





    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }





    public String getInstanceID() {
        return instanceID;
    }





    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }





    public List<VideoFile> getVideoList() {
        return videoList;
    }





    public void setVideoList(List<VideoFile> videoList) {
        this.videoList = videoList;
    }





    @Override
    public String toString() {
        return "VideoData [tmpStorePath=" + tmpStorePath + ", sourcePath=" + sourcePath + ", instanceID=" + instanceID
                + ", videoList=" + videoList + "]";
    }



    
    
}


