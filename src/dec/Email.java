package dec;

public abstract class Email {

    protected String texte;

    public String envoyer(){
        return texte;
    };

    public Email(String texte) {
    this.texte = texte;
    }

    public Email() {

    };

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
