public class Main {
    public static void main(String[] args) {

        TrucksAndContainers trucksAndContainers = new TrucksAndContainers(6709);
        trucksAndContainers.setOrder(6709);
        TestTrucksAndContainers testtrucksAndContainers = new TestTrucksAndContainers(6709);

        // почему происходит баг при наполнении ящиков циклом


       // System.out.println(trucksAndContainers.getTruck() + " " + testtrucksAndContainers.getCountTruck() + " " + trucksAndContainers.wholeContainer() + " " + testtrucksAndContainers.getCountContainer());
    }
}