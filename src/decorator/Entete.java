package decorator;

import dec.Email;

public class Entete extends DecorateurEmail {

    private String txt = "Bonjour madame, monsieur";

    public Entete(Email mail) {
        super(mail);
    }

    @Override
    public String envoyer() {
        return txt + "\n"+ mail.envoyer();
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
