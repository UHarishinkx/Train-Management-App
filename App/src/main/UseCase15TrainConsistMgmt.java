public class UseCase15TrainConsistMgmt {

    public static class CargoException extends RuntimeException {
        public CargoException(String msg) { super(msg); }
    }

    public static class Bogie {
        String type;

        public Bogie(String type) { this.type = type; }

        public void assign(String cargo) {
            try {
                if (type.equals("Rectangular") && cargo.equals("Petroleum"))
                    throw new CargoException("Unsafe");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Done");
            }
        }
        
        public String getType() { return type; }
    }
}
