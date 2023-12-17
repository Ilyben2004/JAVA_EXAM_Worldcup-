import java.util.Objects;

public class Coach extends Personne {
private  String nickname;
private  diplome diplome ;

    public Coach(String nom, String prenom, String nickname, diplome diplome) {
        super(nom, prenom);
        this.nickname = nickname;
        this.diplome = diplome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(diplome diplome) {
        this.diplome = diplome;
    }

    @Override
    public String toString() {
        return super.toString()+ "Coach{" +
                "nickname='" + nickname + '\'' +
                ", diplome=" + diplome +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coach coach = (Coach) o;
        return Objects.equals(this.getPrenom(), coach.getPrenom()) && Objects.equals(this.getNom(), coach.getNom()) && Objects.equals(nickname, coach.nickname) && diplome == coach.diplome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, diplome);
    }
}
