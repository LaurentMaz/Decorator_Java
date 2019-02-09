package decorator;

import dec.Email;

public class Signature extends DecorateurEmail {

    private String txt = "Signature Automatique ajouté grâce au décorator";
    public Signature(Email mail) {
        super(mail);
    }

    @Override
    public String envoyer() {
        return mail.envoyer()+"\n"+txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
