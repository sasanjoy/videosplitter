package com.airis.videosplitter.model;


public class VideoProcessingResponse {
    private String instanceId="";
    private String videofileStatus = "";
    private String framePath="";
    private String textfilePath="";
    
    
    public VideoProcessingResponse() {
    }

    public VideoProcessingResponse(String instanceId, String videofileStatus, String framePath, String textfilePath) {
        this.instanceId = instanceId;
        this.videofileStatus = videofileStatus;
        this.framePath = framePath;
        this.textfilePath = textfilePath;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getVideofileStatus() {
        return videofileStatus;
    }

    public void setVideofileStatus(String videofileStatus) {
        this.videofileStatus = videofileStatus;
    }

    public String getFramePath() {
        return framePath;
    }

    public void setFramePath(String framePath) {
        this.framePath = framePath;
    }

    public String getTextfilePath() {
        return textfilePath;
    }

    public void setTextfilePath(String textfilePath) {
        this.textfilePath = textfilePath;
    }

    @Override
    public String toString() {
        return "VideoProcessingResponse [instanceId=" + instanceId + ", videofileStatus=" + videofileStatus
                + ", framePath=" + framePath + ", textfilePath=" + textfilePath + "]";
    }
    
}