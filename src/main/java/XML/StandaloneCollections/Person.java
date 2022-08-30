package XML.StandaloneCollections;

import java.util.List;

public class Person {
    private List<String>friendList;

    public List<String> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<String> friendList) {
        this.friendList = friendList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friendList=" + friendList +
                '}';
    }
}
