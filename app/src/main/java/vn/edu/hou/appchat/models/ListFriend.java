package vn.edu.hou.appchat.models;

import java.util.ArrayList;


public class ListFriend {
    private ArrayList<Friend> listFriend;

    public ArrayList<Friend> getListFriend() {
        return listFriend;
    }

    public ListFriend(){
        listFriend = new ArrayList<>();
    }

    public String getAvatarById(String id){
        for(Friend friend: listFriend){
            if(id.equals(friend.id)){
                return friend.avatar;
            }
        }
        return "";
    }

    public void setListFriend(ArrayList<Friend> listFriend) {
        this.listFriend = listFriend;
    }
}
