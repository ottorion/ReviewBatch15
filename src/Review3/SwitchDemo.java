package Review3;

public class SwitchDemo {
    public static void main(String[] args) {

        /*
        World Cup:
        and provide winners
         */
        int worldCup=2014;

        switch (worldCup){
            default:
                System.out.println("Winner is unknown");
                break;
            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("winner is Germany");
                break;

        }
    }
}
