package exo5;

public class RadioReveil {

    enum ChoixPossibles {USB, Radio, Smartphone}

    private ChoixPossibles choixUtilisateur;

    public RadioReveil() {
        choixUtilisateur = ChoixPossibles.Radio;
    }

    public void setChoixUtilisateur(ChoixPossibles choixUtilisateur) {
        this.choixUtilisateur = choixUtilisateur;
    }

    public void sonner() {
        switch(choixUtilisateur) {
            case USB :
                System.out.println("La musique est lue sur la clé USB"); break;
            case Radio:
                System.out.println("La radio se met en marche"); break;
            case Smartphone:
                System.out.println("La musique est jouée sur le smartphone"); break;
        }
    }

}
