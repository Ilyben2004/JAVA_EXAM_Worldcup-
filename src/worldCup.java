public class worldCup {
    private  String Countryname;

    private  int anne;

    private String slug ;

    private  int nmbr_teams;

    private Tour tours[];

    private  Team teams_wins[];


    public worldCup(String countryname, int anne, String slug, int nmbr_teams, Tour[] tours, Team[] teams_wins) {
        Countryname = countryname;
        this.anne = anne;
        this.slug = slug;
        this.nmbr_teams = nmbr_teams;
        this.tours = tours;
        this.teams_wins = teams_wins;
    }

    public  int getGoalsfor(Tour t , Team te ){
        return  t.nmrGoal(te);
    }

}
