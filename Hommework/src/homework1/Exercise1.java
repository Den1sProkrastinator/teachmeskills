package homework1;

    public class Exercise1 {
    public static void main(String[] args) {
        int day=7;
        double totalDistance =10;
        double distance = 10;
        double percent = 10;
        for (int i =1 ; i<day; i++){
           double daysPercent=distance*(percent/100);
           double daysDistance = daysPercent+distance;
           distance=daysDistance;
           totalDistance+=distance;
        }
        System.out.println(totalDistance);
    }
}
