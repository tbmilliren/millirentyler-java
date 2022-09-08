public class sixDays {
    public static void main(String[] args) {
        for(int i=1; i<7; i++){
            printDay(i);
        }
    }

    private static void printDay(int day) {
        printXmas(day);
        printGifts(day);
    }

    //prints statement implementing current day
    public static void printXmas(int day) {
        if (day == 1) {
            System.out.println("On the " + day + "st day of \"Xmas\", my true love sent to me");
        } else if (day == 2) {
            System.out.println("On the " + day + "nd day of \"Xmas\", my true love sent to me");
        } else {
            System.out.println("On the " + day + "th day of \"Xmas\", my true love sent to me");
        }
    }

    private static void printGifts(int day) {
        for(int i=day; i>0; i--){
            if(i==1){
                System.out.println("a partridge in a pear tree.\n");
            } else if(i==2){
                System.out.println("two turtle doves, and ");
            } else if(i==3){
                System.out.println("three French hens, ");
            } else if(i==4){
                System.out.println("four calling birds, ");
            } else if(i==5){
                System.out.println("five golden rings, ");
            } else if(i==6){
                System.out.println("six geese a-laying, ");
            }
        }
    }
}
