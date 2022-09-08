public class lab2 {
    public static void main(String[] args) {
        System.out.println("box draw start");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("box draw end");
    }

    public static void drawBox(){
        drawTopBottom();
        drawSides();
        drawSides();
        drawTopBottom();
    }

    public static void drawTopBottom(){
        System.out.println("+------+");
    }

    public static void drawSides(){
        System.out.println("|      |");
    }
}
