import java.util.Scanner; //pour les inputs
class ZooManagement{
public static void main(String[] args){ //entry point
	Scanner scanner = new Scanner(System.in);
	int nbrCages=20;
	String zooName="my zoo";
	String msg = zooName + " comporte "+nbrCages+" cages";
	System.out.println(msg); //output (affichage)
	String zooName = scanner.nextLine(); //string input par utilisateur
	int nbrCages = scanner.nextInt(); //int input par utilisateur 
	String msg = zooName + " comporte "+nbrCages+" cages"; (affichage)

}	
}