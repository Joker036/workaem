public class TrucksAndContainers {

    //Расчет выполнен с помощью цикла
    private int truck;
    private int container;
    private int box;
    private final int wholeContainer;
    private int order;

    public void setOrder(int order) {
        this.order = order;
    }

    public TrucksAndContainers(int order) {// order - количество заказанных ящиков
        System.out.println("Грузовик: " + ++truck);
        System.out.println("Контейнер: " + ++container);
        for (int i = 0; i < order; i++) {

            box++;
            if (box == 27 && container == 12) {
                System.out.println("Ящик: " + box);
                box = 0;
            } else {
                System.out.println("Ящик: " + box);
            }
            if (box == 27) {
                box = 0;
                System.out.println("Контейнер: " + ++container);
            } else if (container == 12) {
                container = 0;
                System.out.println("Грузовик: " + ++truck);
            } else if (i == order - 1) {
                System.out.println("Грузовик: " + truck + "\n" + "  Контейнер: " + container + "\n" + " Ящик: " + box);
            }
        }


        int wholeContainer = order / 27;
        System.out.println("Необходимо: " + "\n" + "грузовиков " + truck + "\n" + "контейнеров " + ++wholeContainer);
        this.wholeContainer = wholeContainer;
    }


    public int getTruck() {
        return truck;
    }

    public int wholeContainer() {
        return wholeContainer;
    }

}