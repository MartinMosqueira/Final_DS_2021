package model;

import java.util.ArrayList;
import java.util.List;

public class NewRepository {
    private List<GitUser> users;

    public NewRepository() {
        this.users = new ArrayList<GitUser>();
    }

    public void ForkRepository(GitUser user){
        users.add(user);
    }
    public void DeleteRepository(GitUser user){
        users.remove(user);
    }

    public int viewRepositoryUsers(){
        return users.size();
    }

    public void notifyCommit(){
        for(GitUser user: users){
            user.pull();
        }
    }
}
