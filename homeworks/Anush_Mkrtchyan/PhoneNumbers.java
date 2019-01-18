public class PhoneNumbers {
    private String phoneNum;
    public PhoneNumbers( String phoneNum){
        this.phoneNum=phoneNum;
    }
    public PhoneNumbers(){

    }
    public  boolean isDigitsWithSpace(String str){
        return str.matches("^(\\d{1,3})[\\s](\\d{1,3})[\\s](\\d{4,10})$");
    }
    public boolean isDigitsWith_(String str ){
        return str.matches("^(\\d{1,3})[-](\\d{1,3})[-](\\d{4,10})$");
    }
    public void phoneNumIs(){
        if( isDigitsWithSpace(phoneNum)){
            String []arr=phoneNum.split(" ");
            if( arr.length==3){
                System.out.println("CountryCode="+arr[0]);
                System.out.println("LocalAreaCode="+arr[1]);
                System.out.println("Number="+arr[2]);
            }
        }
       if (isDigitsWith_(phoneNum)){
           String []arr2=phoneNum.split("-");
//           System.out.println(arr2[0]);
           if( arr2.length==3){
               System.out.println(" CountryCode="+arr2[0]);
               System.out.println("LocalAreaCode="+arr2[1]);
               System.out.println("Number="+arr2[2]);
           }
       }
    }
}
