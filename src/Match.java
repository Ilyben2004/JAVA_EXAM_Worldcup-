import java.util.*;

public class Match {

    private String nom;

    private Arbitre arbitre;
    private ArrayList<Team> teams;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    private Map<Team, Integer> reasults;

    private Map<Team, Map<Player, Player>> changments;


    public Match(String nom, Arbitre arbitre, ArrayList<Team> teams) {
        this.nom = nom;
        this.arbitre = arbitre;
        this.teams = teams;
        changments = new HashMap<>();
        changments.put(teams.get(0), new HashMap<Player, Player>());
        changments.put(teams.get(1), new HashMap<Player, Player>());


    }

    public void lister() {
        int i = 0;
        Team team1 = new Team();
        Team team2 = new Team();

        for (Map.Entry<Team, Integer> entry : reasults.entrySet()) {
            if (i == 0) {
                team1 = entry.getKey();
                i++;
                break;
            }
            team2 = entry.getKey();

        }
        System.out.println(team1.getTeam_name() + " ( " + reasults.get(team1) + " - " + reasults.get(team2) + " ) " + team2.getTeam_name());
    }


    // as always the player1 who will enter the main team
    // lets check which team using player 2
    public void changerPlayer(Player player1, Player player2) {
        if (teams.get(0).mainPlayers.contains(player2)) {
            teams.get(0).changerPlayer(player1, player2);
            changments.get(teams.get(0)).put(player1, player2);
        } else {
            teams.get(1).changerPlayer(player1, player2);
            changments.get(teams.get(1)).put(player1, player2);
        }


    }

    public void lister_changments() {

        for (Map.Entry<Team, Map<Player, Player>> entry : changments.entrySet()) {

            System.out.println(" ALL THE CHANGES FOR THE FIRST TEAM TEAM  : " + entry.getKey().getTeam_name() + "\n");
            for (Map.Entry<Player, Player> entry1 : entry.getValue().entrySet()) {
                System.out.println(" PLAYER  : " + entry1.getKey().getNom() + " changed wuith " + entry1.getValue().getNom() + " \n ");
            }
        }


    }

    public int getGoalsFor(Team t) {
        if (this.reasults.containsKey(t))
            return this.reasults.get(t);


return  0 ;


    }




  }

