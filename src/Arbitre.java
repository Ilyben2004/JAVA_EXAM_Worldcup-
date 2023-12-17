import java.util.Objects;

public class Arbitre extends Personne {
    private  arbitrePosts post;

    public Arbitre(String nom, String prenom, arbitrePosts post) {
        super(nom, prenom);
        this.post = post;
    }

    public arbitrePosts getPost() {
        return post;
    }

    public void setPost(arbitrePosts post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return super.toString()+ "Arbitre{" +
                "post=" + post +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arbitre arbitre = (Arbitre) o;
        return Objects.equals(this.getNom(),arbitre.getNom())  && Objects.equals(this.getPrenom() , arbitre.getPrenom() ) && post == arbitre.post;
    }

    @Override
    public int hashCode() {
        return Objects.hash(post);
    }
}

