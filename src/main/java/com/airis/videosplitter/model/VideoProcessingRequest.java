package com.airis.videosplitter.model;



public class VideoProcessingRequest {
   private String source_path;
    private String tmp_path;
    private int cut_duration;
    private String instanceID;
    private String startdatetime;
    
    public VideoProcessingRequest() {
    }

    public VideoProcessingRequest(String source_path, String tmp_path, int cut_duration, String instanceID,
            String startdatetime) {
        this.source_path = source_path;
        this.tmp_path = tmp_path;
        this.cut_duration = cut_duration;
        this.instanceID = instanceID;
        this.startdatetime = startdatetime;
    }

    public String getSource_path() {
        return source_path;
    }

    public void setSource_path(String source_path) {
        this.source_path = source_path;
    }

    public String getTmp_path() {
        return tmp_path;
    }

    public void setTmp_path(String tmp_path) {
        this.tmp_path = tmp_path;
    }

    public int getCut_duration() {
        return cut_duration;
    }

    public void setCut_duration(int cut_duration) {
        this.cut_duration = cut_duration;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getStartdatetime() {
        return startdatetime;
    }

    public void setStartdatetime(String startdatetime) {
        this.startdatetime = startdatetime;
    }

    @Override
    public String toString() {
        return "VideoProcessingRequest [source_path=" + source_path + ", tmp_path=" + tmp_path + ", cut_duration="
                + cut_duration + ", instanceID=" + instanceID + ", startdatetime=" + startdatetime + "]";
    }
    
     
}
