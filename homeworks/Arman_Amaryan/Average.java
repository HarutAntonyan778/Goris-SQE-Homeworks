class Average {
    public static void main(String[] args) {
        int first = 717;
        int second = 114;
        int third = 34;
        if (first < second) {
            if (first > third) {
                System.out.println(first+" is the average");
            } else {
                System.out.println(third+" is the average");
            }
        } else {
            if (second < third) {
                System.out.println(third+" is the average");
            } else {
                System.out.println(second+" is the average");
            }
        }
    }
}
