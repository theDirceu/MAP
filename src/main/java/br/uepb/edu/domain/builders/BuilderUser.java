package br.uepb.edu.domain.builders;

import br.uepb.edu.domain.Users.User;
import br.uepb.edu.domain.Users.UserType;
import br.uepb.edu.domain.Users.User.UserBuilder;

public class BuilderUser implements Builder {
    private UserBuilder type;

    public void setUserType(UserBuilder type) {
        this.type = type;
    }

    public User getResult(){
        return new User(type);
    }

    @Override
    public void setUserType(UserType type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUserType'");
    }
}
