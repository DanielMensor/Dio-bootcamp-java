public class App {
    public static void main(String[] args) {
        SmartTV s = new SmartTV();

        System.out.println(s);
        s.ligar();
        s.aumentarVolume();
        s.aumentarVolume();
        s.aumentarVolume();
        s.aumentarVolume();

        s.escolherCanal(11);

        System.out.println(s);

        s.desligar();
        
        System.out.println(s);
    }
}
