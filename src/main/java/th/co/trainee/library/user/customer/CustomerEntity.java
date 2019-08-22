package th.co.trainee.library.user.customer;

import th.co.trainee.library.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerEntity extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int customerId;

    public static CustomerEntity create(@NotNull String userFirstName, @NotNull String userLastName,
                                 @NotNull String userName, @NotNull String userPassword){
        var customerEntity = new CustomerEntity();
        customerEntity.setUserFirstName(userFirstName);
        customerEntity.setUserLastName(userLastName);
        customerEntity.setUserName(userName);
        customerEntity.setUserPassword(userPassword);
        return customerEntity;
    }
}
