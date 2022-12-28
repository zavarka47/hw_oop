package lesson_4.transport.Transport;

public abstract class transport implements competing {
    private String brand;
    private String model;
    private double engineVolume;

    transport(String brand, String model) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);}


    transport(String brand, String model, double engineVolume) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);}


    // Методы Get
    public String getBrand() {
        return brand;}
    public String getModel() {
        return model;}
    public double getEngineVolume() {
        return engineVolume;}


    // Методы Set
    public void setEngineVolume(double engineVolume) {
     this.engineVolume = engineVolume;
    }


    // Методы проверок
    protected static String checkString (String string) {
        if (string == null || string.isBlank() || string.isEmpty()) {
            string = "default";
        }
        return string;
    }
    protected static double checkDouble (double i) {
        if (i <= 0 ) {
            i = 1.2;
            //throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;
    }


    // Метод toString
    public String toString(){
        return "brand: " + brand + " model: " + model + "engineVolume: " + engineVolume;
    }


    // Методы движения
    public static void startMoving() {
        System.out.println("Move is starting");
    }
    public static void finishMoving() {
        System.out.println("Move is finishing");
    }


    // Методы implements
    @Override
    public void pitStop() {
    }
    @Override
    public void bestTimeCircle() {
    }
    @Override
    public void maxSped() {
    }

    // Методы для Enum
    public abstract void printTyp();
}
