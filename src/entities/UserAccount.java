package entities;

public class UserAccount {

    private  String userName;
    private String password;

    private UserAccount(UserAccountBuilder builder){
        this.userName= builder.userName;
        this.password= builder.password;;
    }
    // nested userAccountBuilder class inside userAccount class
    public static class UserAccountBuilder{
        private final String userName;
        private final String password;

        public UserAccountBuilder(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
        public UserAccount build(){
            return new UserAccount(this);
        }
    }

}
