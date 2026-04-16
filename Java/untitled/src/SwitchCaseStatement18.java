public class SwitchCaseStatement18 {
    public static void main(String[] args) {
     //   char var = 'd';
        String var = "Honey";

/*        int var;
        System.out.print("Enter your age = ");
        Scanner sc = new Scanner(System.in);
        Var = sc.nextInt();  */

        switch (var) {                                          //     \
            case "Harry" -> System.out.print(" Honey ");        //      \
            case "Dev" -> System.out.print("Dev");              //       \
            case "Honey" -> System.out.print("Harry");          //       /    THIS IS ADVANCE SWITCH-CASE
            default -> System.out.print("Unknown");             //      /
        }                                                       //     /
        System.out.print(" Please Revive Me ");


/*        switch (var){

          case 'r':

            case "Harry":
                System.out.print(" Honey ");
                break;
            case "Dev":
                System.out.println("Dev");             \
                break;                                  \
            case "Honey" :                               \
                System.out.println("Harry");             /     THIS IS SWITCH-CASE .
                break;                                  /
            default:                                   /
                System.out.println("Unknown");
        }
        System.out.println("Please Revive Me");   */


     /*   int age;
        System.out.print("Enter your age = ");
        Scanner cs = new Scanner(System.in);
        age = cs.nextInt();

        if (age>28){
            System.out.println("you are old");
        }
        else if (age>25){
            System.out.println("you are not old");
        }
        else if (age>17){
            System.out.println("you are Young");
        }
        else if (age>12){
            System.out.println("you are kid");
        }
        else if (age>7){
            System.out.println("you are baby");
        }
        else {
            System.out.println("KallChadu");
        }  */
    }
}
