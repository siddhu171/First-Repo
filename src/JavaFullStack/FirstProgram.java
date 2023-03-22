package JavaFullStack;

public class FirstProgram {
    public static void main(String[] args) {
        String Sc= "Siddharth";
//        int number = 0;
//        for (int i=0; i<Sc.length(); i++){
//            if (Sc.charAt(i) == 'd'){
//                number ++;
//            }
//        }
//        System.out.println(number);
        for (int i= Sc.length()-1; i>=0; i--){
            System.out.print(Sc.charAt(i));
        }
    }
}