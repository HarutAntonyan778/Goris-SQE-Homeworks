public class Methods {

    public static void main(String[] args) {
        int min = smallest(25, 37, 29);
        System.out.println("The smallest value is "+min);
        double avreragenum=average(25,45,65);
        System.out.println("The average value is "+ avreragenum);

    }

    public static int smallest(int firsnum, int secondnum, int thirdnum) {
        int min;
        if (firsnum < secondnum)
            min = firsnum;
        else
            min = secondnum;
        if (thirdnum < min)
            min = thirdnum;
        return min;
    }
    public static double average (int firstnum, int secondnum, int thirdnum){
        double mij=(firstnum + secondnum + thirdnum) /3;
        return mij;
    }
}
