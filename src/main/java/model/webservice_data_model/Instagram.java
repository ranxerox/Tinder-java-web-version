package model.webservice_data_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instagram {
    
    private int media_count;
    private String username;

    public int getMedia_count() {
        return media_count;
    }
    public void setMedia_count(int media_count) {
        this.media_count = media_count;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}