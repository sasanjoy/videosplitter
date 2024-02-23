package com.airis.videosplitter.model;


public class FrameProcessingAck {
    private String instanceId="";
    private String videofileStatus = "";
    
    
    public FrameProcessingAck() {
    }

    public FrameProcessingAck(String instanceId, String videofileStatus) {
        this.instanceId = instanceId;
        this.videofileStatus = videofileStatus;
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

    @Override
    public String toString() {
        return "FrameProcessingAck [instanceId=" + instanceId + ", videofileStatus=" + videofileStatus + "]";
    }
    
    
}