package srp;

 interface User {
     boolean login(String username,String password);
     boolean register(String username,String password,String email);
}
interface Email {
    boolean sendEmail(String email);
}
interface LogError {
    void logerror(String email);
}
