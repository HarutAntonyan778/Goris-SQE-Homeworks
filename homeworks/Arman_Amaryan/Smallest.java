class Smallest {
    public static void main(String[] args) {
        int first = 77;
        int second = 114;
        int third = 34;
        if (first < second) {
            if (first < third) {
                System.out.println(first+" is the smallest");
            } else {
                System.out.println(third+" is the smallest");
            }
        } else {
            if (second < third) {
                System.out.println(second+" is the smallest");
            } else {
                System.out.println(third+" is the smallest");
            }
        }
    }
}
