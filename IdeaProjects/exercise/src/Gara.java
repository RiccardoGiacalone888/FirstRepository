public class Gara {
    public static void main(String[] args) {
        Pilota car = new Pilota();
        car.setPilot("Riccardo", "lancia musa", "palermo");

        System.out.println("il vincitore è :" + car.getNome() + "," + car.getScuderia() + "," + car.getCircuito());
    }
}
