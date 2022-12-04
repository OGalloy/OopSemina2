package oopseminar2.view;

import java.util.List;

import oopseminar2.data.User;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users){

        Logger logger = Logger.getAnonymousLogger();

        for (User user: users){
            logger.info(user.toString());
        }

    }
    
}
