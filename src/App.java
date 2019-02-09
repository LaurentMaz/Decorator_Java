import dec.Email;
import decorator.Entete;
import decorator.Signature;

public class App {

    public static void main(String[] args){

        Email mail;
        mail = new Email("Voici le corps du texte") {
        };
        Entete entete=new Entete(mail);
        Signature signature = new Signature(mail);

        /* ///////////// envoyer un texte avec signature ajoutée automatiquement ///////////// */
        System.out.println(signature.envoyer());

        /* ///////////// envoyer un texte avec un "Bonjour madame, monsieur" ajouté automatiquement ///////////// */
        System.out.println(entete.envoyer());

        /* ///////////// envoyer un texte avec une signature et un "Bonjour madame, monsieur" ajoutés automatiquement ///////////// */
        System.out.println(entete.getTxt()+"\n"+mail.envoyer()+"\n"+signature.getTxt());

    }

}
