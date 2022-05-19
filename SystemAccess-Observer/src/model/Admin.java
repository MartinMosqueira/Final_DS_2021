package model;

import java.time.LocalDateTime;

public class Admin implements Observer{
    User systemUser;

    @Override
    public String enter() {
        return "User logged \n" +
                "name: "+systemUser.getName()+"\n" +
                "Date: "+LocalDateTime.now();
    }

}
