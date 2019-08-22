package th.co.trainee.library.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class User {

    @NotNull
    @Column(name = "FirstName")
    protected String userFirstName;

    @NotNull
    @Column(name = "LastName")
    protected String userLastName;

    @NotNull
    @Column(name = "UserName")
    protected String userName;

    @NotNull
    @Column(name = "Password")
    protected String userPassword;

    public User(){

    }

    public User(@NotNull String userFirstName, @NotNull String userLastName, @NotNull
            String userName, @NotNull String userPassword) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
