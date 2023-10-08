package br.uepb.edu.domain.Users;

public class User {
    private final UserType userType;

    public User(UserType userType){
        this.userType = userType;
    }

    public UserType getUserType(){
        return userType;
    }
}
