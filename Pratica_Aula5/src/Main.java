public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto1 = new Aeroporto("Rua Varls, 138", "Aeroporto São Jonas", 20);
        Aeroporto aeroporto2 = new Aeroporto("Rua Carls, 138", "Aeroporto Pin-eiros", 12);
        // Aeronave instancia 2 pilotos
        Aeronave aviao1 = new Aeronave("BP2135", 20, "LATAM", "Arthur", "160186", "11999219991921", "#1111", "#1111","#1111");
        Aeronave aviao2 = new Aeronave("GP3145", 60, "GOL", "Morelonomicon", "220797", "11229319571921", "#2222", "#2222","#2222");    
        Passageiro p1 = new Passageiro("Angelo", "220305", "11932213491921", 21, "#faAAa", "#PB001");
        Passageiro p2 = new Passageiro("Shan UzhauL", "060901", "11932282741921", 32, "#fbBBb", "#PB002");
        aeroporto1.infoPilotoAeronave(aviao1);
        aeroporto2.infoPilotoAeronave(aviao2);
        aviao1.piloto.controlarAviao();
        aviao2.piloto.controlarAviao();
        p1.embarcar();
        p2.embarcar();
    }
}
