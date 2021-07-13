class Main {
    public static void main(String[] args) {
        UberX uberX  = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(2);
        uberX.printDataCar();

        UberVan uberV = new UberVan("FGH324", new Account("Andres Herrera", "AND123"));
        uberV.setPassenger(5);
        uberV.printDataCar();

    }

    
}