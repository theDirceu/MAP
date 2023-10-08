package br.uepb.edu.domain.builders;

import br.uepb.edu.domain.Users.User;
import br.uepb.edu.domain.Users.UserType;

public class BuilderUser implements Builder {
    private UserType type;

    public void setUserType(UserType type) {
        this.type = type;
    }

    public User getResult(){
        return new User(type);
    }
}
