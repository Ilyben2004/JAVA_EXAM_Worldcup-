import java.util.ArrayList;

public class Team {

    private  String team_name;
    ArrayList<Player> mainPlayers;
    ArrayList<Player> secondaryPlayers;

    public Team(String team_name, ArrayList<Player> mainPlayers, ArrayList<Player> secondaryPlayers) {
        this.team_name = team_name;
        this.mainPlayers = mainPlayers;
       this.secondaryPlayers = secondaryPlayers;
    }

    public Team() {

    }

    public  void lister(){
        for(Player p : this.mainPlayers){
            System.out.println(p);
        }
    }


    // player1 will replace the player2 (player2 already in the main list )
    void changerPlayer(Player player1, Player player2){
        if(mainPlayers.contains(player2)&& secondaryPlayers.contains(player1)){
            mainPlayers.remove(player2);
            secondaryPlayers.remove(player1);
            mainPlayers.add(player1);
            secondaryPlayers.add(player2);

        }
        else{
            System.out.println("\n error check that the players are in the lists \n ");
        }

    }

    public String getTeam_name() {
        return team_name;
    }
}
