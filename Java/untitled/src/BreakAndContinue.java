public class BreakAndContinue {
    public static void main(String[] args) {

//        FOR-LOOP------------------


//        for (int i = 0; i<=5; i++){
//            System.out.println(i);
//            System.out.print(" this is java ");
//            if (i==1){
//                System.out.println("Ending");
//                break;  // Break the Loop
//            }

//        WHILE-LOOP------------------

//        int i = 0;
//        while (i < 8) {
//            System.out.println(i);
//            System.out.print(" this is java ");
//            if (i == 6) {
//                System.out.println("Ending");
//                break;  // Break the Loop
//            }
//            i++;
//        }
//        System.out.println("end");


//        DO-WHILE LOOP----------------

//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.print(" this is java ");
//            if (i == 2) {
//                System.out.println("Ending");
//                break;  // Break the Loop
//            }
//            i++;
//        }
//        while (i < 8);
//        System.out.println("end");


        for (int i = 0;i<9; i++){
            if (i==3){
                System.out.println(i);
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }

    }
}
