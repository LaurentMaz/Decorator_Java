package decorator;

import dec.Email;

public abstract class DecorateurEmail extends Email {

    protected Email mail;

    public DecorateurEmail(Email mail) {
        this.mail = mail;
    }

}
