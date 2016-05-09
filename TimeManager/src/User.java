/**
 * Created by love_polyanskaya on 07.05.16.
 */
public class User {

    private int userId;
    private String  userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return userName;
    }
}
