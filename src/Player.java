import java.util.Objects;

public class Player extends  Personne{

    private Poste post;
    private  int numero;

    private  String equipe_origine;


    public Player(String nom, String prenom, Poste post, int numero, String equipe_origine) {
        super(nom, prenom);
        this.post = post;
        this.numero = numero;
        this.equipe_origine = equipe_origine;
    }

    public Poste getPost() {
        return post;
    }

    public void setPost(Poste post) {
        this.post = post;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipe_origine() {
        return equipe_origine;
    }

    public void setEquipe_origine(String equipe_origine) {
        this.equipe_origine = equipe_origine;
    }

    @Override
    public String toString() {
        return super.toString()+"Player{" +
                "post=" + post +
                ", numero=" + numero +
                ", equipe_origine='" + equipe_origine + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return this.getNom().equals(player.getNom()) && this.getPrenom().equals(player.getPrenom()) && numero == player.numero && post == player.post && Objects.equals(equipe_origine, player.equipe_origine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, numero, equipe_origine);
    }
}
