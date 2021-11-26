package exo5;

public class UseRadioReveil {
    public static void main(String[] args) {
        RadioReveil radioReveil = new RadioReveil();
        radioReveil.sonner();
        radioReveil.setChoixUtilisateur(RadioReveil.ChoixPossibles.Smartphone);
        radioReveil.sonner();
    }
}
