package com.airis.videosplitter.model;

public class InteractionResponse {
    private Long frameDetailsId=0L;
	//private int frameId=0;
	//private String personId ="";
	//private String framePath = "";
	//private String instanceId = "";
    //private String name;
	//private String interactionType = "";
   // private int xcord=0;
   // private int ycord=0;
   private String objects;
    private int handInteractionStatus=0;
    private int interactionCategory = 0;
    public InteractionResponse() {
    }
    public InteractionResponse(Long frameDetailsId, String objects, int handInteractionStatus,
            int interactionCategory) {
        this.frameDetailsId = frameDetailsId;
        this.objects = objects;
        this.handInteractionStatus = handInteractionStatus;
        this.interactionCategory = interactionCategory;
    }
    public Long getFrameDetailsId() {
        return frameDetailsId;
    }
    public void setFrameDetailsId(Long frameDetailsId) {
        this.frameDetailsId = frameDetailsId;
    }
    public String getObjects() {
        return objects;
    }
    public void setObjects(String objects) {
        this.objects = objects;
    }
    public int getHandInteractionStatus() {
        return handInteractionStatus;
    }
    public void setHandInteractionStatus(int handInteractionStatus) {
        this.handInteractionStatus = handInteractionStatus;
    }
    public int getInteractionCategory() {
        return interactionCategory;
    }
    public void setInteractionCategory(int interactionCategory) {
        this.interactionCategory = interactionCategory;
    }
    @Override
    public String toString() {
        return "InteractionResponse [frameDetailsId=" + frameDetailsId + ", objects=" + objects
                + ", handInteractionStatus=" + handInteractionStatus + ", interactionCategory=" + interactionCategory
                + "]";
    }
    
    
}
