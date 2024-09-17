public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Khamzat", 17, 120,76 ,50,50);
        Fighter f2 = new Fighter("Islam",18,90,79, 40, 50);

        Match match = new Match(f1, f2, 75,80);
        match.run();
    }
}
