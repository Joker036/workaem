public class TestTrucksAndContainers {
    private final int truck;
    private final int container;
    private final int box;
    private final int countContainer;
    private final int countTruck;
    public TestTrucksAndContainers(int order) { // condition for test
        box = 1;
        container = 27;
        truck = box * container * 12;

        int A = order / truck; // count whole truck
        int countTruck = ++A; // count truck
        int B = (12 * A) - (order / container);
        int b = (12 * A) - B; // count whole container
        int countContainer = ++b; // count container

      //  System.out.println("Необходимо грузовиков: " + countTruck + "\n" + "Необходимо контейнеров: " + countContainer + "\n");
        this.countContainer = countContainer;
        this.countTruck = countTruck;

        // create object for test
        TrucksAndContainers trucksAndContainers = new TrucksAndContainers(order);
        // test
        if (trucksAndContainers.getTruck() == getCountTruck() && trucksAndContainers.wholeContainer() == getCountContainer()) {
            System.out.println("successful test");
        } else {
            System.out.println("test error");
        }
        }

    public int getCountContainer() {
        return countContainer;
    }

    public int getCountTruck() {
        return countTruck;
    }
}


