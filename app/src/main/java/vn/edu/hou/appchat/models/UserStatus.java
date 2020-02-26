package vn.edu.hou.appchat.models;



public class UserStatus {
    public boolean isOnline;
    public long timestamp;

    public UserStatus(){
        isOnline = false;
        timestamp = 0;
    }
}
