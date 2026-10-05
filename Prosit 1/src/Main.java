import java.util.Scanner; //pour les inputs
class ZooManagement{
    public static void main(String[] args){ //entry point
        Scanner scanner = new Scanner(System.in);
        int nbrCages=20;
        String zooName="my zoo";
        String msg = zooName + " comporte "+nbrCages+" cages";
        System.out.println(msg); //output (affichage)
        do {
            zooName = scanner.nextLine(); //string input par utilisateur
            nbrCages = scanner.nextInt(); //int input par utilisateur
        }while (zooName.isEmpty() || nbrCages <= 0);
        msg = zooName + " comporte "+nbrCages+" cages"; //(affichage)
        System.out.println(msg);
    }
}