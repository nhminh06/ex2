public class authour {
    private String name;
    private String email;
    public authour (String name , String email){
        this.name=name;
        this.email=email;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    public String toString(){
        return "name="+name+"email="+email;
    }
}
