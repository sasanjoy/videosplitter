package com.airis.videosplitter.model;

public class InteractionRequest {
	private Long frameDetailsId=0L;
	private int frameId=0;
	private String personId ="";
	private String frameTimestamp;
	private String framePath = "";
	private String instanceId = "";
	private int interactionCategory=0;
	
	
	public InteractionRequest() {
		super();
	}


    public InteractionRequest(Long frameDetailsId, int frameId, String personId, String frameTimestamp,
            String framePath, String instanceId,  int interactionCategory) {
        this.frameDetailsId = frameDetailsId;
        this.frameId = frameId;
        this.personId = personId;
        this.frameTimestamp = frameTimestamp;
        this.framePath = framePath;
        this.instanceId = instanceId;
        this.interactionCategory = interactionCategory;
    }


    public Long getFrameDetailsId() {
        return frameDetailsId;
    }


    public void setFrameDetailsId(Long frameDetailsId) {
        this.frameDetailsId = frameDetailsId;
    }


    public int getFrameId() {
        return frameId;
    }


    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }


    public String getPersonId() {
        return personId;
    }


    public void setPersonId(String personId) {
        this.personId = personId;
    }


    public String getFrameTimestamp() {
        return frameTimestamp;
    }


    public void setFrameTimestamp(String frameTimestamp) {
        this.frameTimestamp = frameTimestamp;
    }


    public String getFramePath() {
        return framePath;
    }


    public void setFramePath(String framePath) {
        this.framePath = framePath;
    }


    public String getInstanceId() {
        return instanceId;
    }


    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    public int getInteractionCategory() {
        return interactionCategory;
    }


    public void setInteractionCategory(int interactionCategory) {
        this.interactionCategory = interactionCategory;
    }


    @Override
    public String toString() {
        return "InteractionRequest [frameDetailsId=" + frameDetailsId + ", frameId=" + frameId + ", personId="
                + personId + ", frameTimestamp=" + frameTimestamp + ", framePath=" + framePath + ", instanceId="
                + instanceId + ", interactionCategory=" + interactionCategory
                + "]";
    }

	

	
	
}