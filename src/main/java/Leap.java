class Leap {

    private final int four = 4;
    private final int hundred = 100;
    private final int fourHundred = 400;
    boolean isLeapYear(int year) {
       if(year%four==0 && !(year%hundred==0) || year%fourHundred==0){
           return true;
       }
       return false;
    }

}
