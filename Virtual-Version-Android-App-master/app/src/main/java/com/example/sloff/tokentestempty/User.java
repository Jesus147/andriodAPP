package com.example.sloff.tokentestempty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {
    public String tname;
    public String username;
    public String email;
    public String password;

    public User(String tname, String username, String email, String password){
        this.tname = tname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("token")
    @Expose
    private String token;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
