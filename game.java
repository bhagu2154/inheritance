package Inheritance;

public class game {
    game(){
        System.out.println("default constructor");
    }
}
class boardgame extends game{
    boardgame(){
        System.out.println("default constructor");
    }
}
class chess extends boardgame{
    chess(){
        System.out.println("default constructor");
    }
}
class gamedemo{
    public static void main(String[] args) {
        chess ch = new chess();
    }  }