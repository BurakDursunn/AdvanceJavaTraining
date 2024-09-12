package ConstructerVsStaticFactory;

public class Main {
    public static void main(String[] args) {

        //constructor
        SoccerTeam team1 = new SoccerTeam(9);
        System.out.println("The team has " + team1.getPlayerNumber() + " players.");

        //create a new SoccerTeam object using the static factory method
        SoccerTeam team = SoccerTeam.createWithPlayerNumber(11);
        System.out.println("The team has " + team.getPlayerNumber() + " players.");

        System.out.println(Boolean.valueOf(1>9));
    }
}
