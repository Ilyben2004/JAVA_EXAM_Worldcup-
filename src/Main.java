import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



// lets say that we did already inserted all the teams and the matches and all data ...
Tour tours[] = new Tour[5];
        Team morroco = new Team();
        worldCup worldCup = new worldCup("Qatar",2022, "Qatar2022",32,tours,new Team[3]);
        // 1 afficher dans le main le nombre de buts marqués par l’équipe national

        int buts_marqs= 0 ;
        for(int i = 0 ; i<tours.length;i++){
            buts_marqs+=tours[i].nmrGoal(morroco);
        }

        int buts_encasseais=0 ;




        //2 afficher dans le main le nombre de buts encaissés par l’équipe nationale.
        int nbr_goals_against_us=0;

        for(Tour t : tours){
            for(Match mm : t.getMatches()){
                if (mm.getTeams().contains(morroco)) {
                    if(mm.getTeams().get(0).equals(morroco)){
                   nbr_goals_against_us+=     mm.getGoalsFor(mm.getTeams().get(1));
                    }
                    else{
                        nbr_goals_against_us+=     mm.getGoalsFor(mm.getTeams().get(0));
                    }


                }
            }
        }









        // 3 faites appel à la fonction pour faire un changement d’un attaquant dans le 2eme match du premier tour.

        // lets start by getting the second Morroco's match of the first tour

Match m ;
int match_number=0;

for (Match mm : tours[0].getMatches()){
    if(mm.getTeams().contains(morroco)){
        match_number ++;
        if(match_number ==2){
            m=mm;
        }

    }
}

        // here we can change players

//m.changerPlayer(nayf_akred , yamiq);










    }
}