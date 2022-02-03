public class divide {

    //create a method take a string of a fraction like "6/7", return a string of the double type
    public String div(String toSolve) {
        String[] num = toSolve.split("/");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        return String.valueOf(num1/num2);

    }
}