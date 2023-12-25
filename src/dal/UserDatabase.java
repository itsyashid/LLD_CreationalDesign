package dal;

/*
Should be Singleton , Only one instance/object can be created
Classic example of Singleton Design Pattern
 */
public class UserDatabase {

    private static UserDatabase dbContext;
    private UserDatabase(){
        // Makes the constructor private (No one allowed to call this constructor to create object
        //hence need to create method to expose instance of the database
    }
    public static synchronized UserDatabase getInstance(){
        if(dbContext==null){
            dbContext=new UserDatabase();
        }
        return  dbContext;
    }
}
