package com.airis.videosplitter.model;

public class DemographicRequest {
    private String instance_id;
	private String person_id;
	private String age;
	private String gender;
	private String crops_folder;
	private String crops_folder_path;
	private String unique_person_id;
    private String person_status;
    public DemographicRequest() {
    }
    public DemographicRequest(String instance_id, String person_id, String age, String gender, String crops_folder,
            String crops_folder_path, String unique_person_id, String person_status) {
        this.instance_id = instance_id;
        this.person_id = person_id;
        this.age = age;
        this.gender = gender;
        this.crops_folder = crops_folder;
        this.crops_folder_path = crops_folder_path;
        this.unique_person_id = unique_person_id;
        this.person_status = person_status;
    }
    public String getInstance_id() {
        return instance_id;
    }
    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }
    public String getPerson_id() {
        return person_id;
    }
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
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
    public String getCrops_folder() {
        return crops_folder;
    }
    public void setCrops_folder(String crops_folder) {
        this.crops_folder = crops_folder;
    }
    public String getCrops_folder_path() {
        return crops_folder_path;
    }
    public void setCrops_folder_path(String crops_folder_path) {
        this.crops_folder_path = crops_folder_path;
    }
    public String getUnique_person_id() {
        return unique_person_id;
    }
    public void setUnique_person_id(String unique_person_id) {
        this.unique_person_id = unique_person_id;
    }
    public String getPerson_status() {
        return person_status;
    }
    public void setPerson_status(String person_status) {
        this.person_status = person_status;
    }
    @Override
    public String toString() {
        return "DemographicResponse [instance_id=" + instance_id + ", person_id=" + person_id + ", age=" + age
                + ", gender=" + gender + ", crops_folder=" + crops_folder + ", crops_folder_path=" + crops_folder_path
                + ", unique_person_id=" + unique_person_id + ", person_status=" + person_status + "]";
    }
    
}
