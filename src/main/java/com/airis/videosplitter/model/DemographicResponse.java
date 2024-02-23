package com.airis.videosplitter.model;

public class DemographicResponse {
    private String instanceId;
	private String personId;
	private String age;
	private String gender;
	private String cropsFolder;
	private String cropsFolderPath;
	private String uniquePersonId;
    private String personStatus;
    public DemographicResponse() {
    }
    public DemographicResponse(String instanceId, String personId, String age, String gender, String cropsFolder,
            String cropsFolderPath, String uniquePersonId, String personStatus) {
        this.instanceId = instanceId;
        this.personId = personId;
        this.age = age;
        this.gender = gender;
        this.cropsFolder = cropsFolder;
        this.cropsFolderPath = cropsFolderPath;
        this.uniquePersonId = uniquePersonId;
        this.personStatus = personStatus;
    }
    public String getInstanceId() {
        return instanceId;
    }
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCropsFolder() {
        return cropsFolder;
    }
    public void setCropsFolder(String cropsFolder) {
        this.cropsFolder = cropsFolder;
    }
    public String getCropsFolderPath() {
        return cropsFolderPath;
    }
    public void setCropsFolderPath(String cropsFolderPath) {
        this.cropsFolderPath = cropsFolderPath;
    }
    public String getUniquePersonId() {
        return uniquePersonId;
    }
    public void setUniquePersonId(String uniquePersonId) {
        this.uniquePersonId = uniquePersonId;
    }
    public String getPersonStatus() {
        return personStatus;
    }
    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }
    @Override
    public String toString() {
        return "DemographicResponse [instanceId=" + instanceId + ", personId=" + personId + ", age=" + age + ", gender="
                + gender + ", cropsFolder=" + cropsFolder + ", cropsFolderPath=" + cropsFolderPath + ", uniquePersonId="
                + uniquePersonId + ", personStatus=" + personStatus + "]";
    }
    
    
}
