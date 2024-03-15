package ConstructerVsStaticFactory;

//Constructor and static factory method
public class SoccerTeam {

    private int playerNumber;
    //constructor
    public SoccerTeam(int playerNumber){
        this.playerNumber = playerNumber;
    }
    //static factory method
    public static SoccerTeam createWithPlayerNumber(int playerNumber){
        return new SoccerTeam(playerNumber);
    }
    //getter and setters
    public int getPlayerNumber() {
        return playerNumber;
    }

}
