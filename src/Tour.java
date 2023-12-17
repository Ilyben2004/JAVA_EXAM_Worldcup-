import java.util.ArrayList;
import java.util.Objects;

public class Tour {
    private  String nom ;
    private  int nbr_teams;
 private  ArrayList <Team> teams ;
    private  ArrayList <Match> matches ;

    private  ArrayList <Team> winning_teams ;

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public Tour(String nom, int nbr_teams, ArrayList<Team> teams) {
        this.nom = nom;
        this.nbr_teams = nbr_teams;
        this.teams = teams;
    }
    void lister(){
        for(Match m : this.matches){
            m.lister();
        }
    }
   public void updateResult( Match match){



    }

    public  int  nmrGoal(Team team){
        int nmbrGoals = 0;

        for(Match m :this.matches){

            nmbrGoals+=m.getGoalsFor(team);
        }


        return nmbrGoals;
    }

}

