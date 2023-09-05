package game;

public class guesstheword {
    private boolean play = false;
    private words randomwords = new words();
    public void start(){

        do {
            showword();
            getinput();
            checkinput();
        } while (play);
    }
    void showword(){
        System.out.println(randomwords);
    }
    void getinput(){
        System.out.println("getinput");
    }
    void checkinput(){
        System.out.println("checkinput");
    }
    
}
