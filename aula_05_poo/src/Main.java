public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro c = new Carro("Ford" , "fiesta");
        Carro c2 = new Carro("BMW", "MI");
        Carro c3 = new Carro("Mercedes", "Compressor");
        Casa minhaCasa = new Casa();
        c.acelerar();
        String result = c.acelerar();
        c2.acelerar();
        c3.acelerar();

        System.out.println(result);
        // System.out.println(result2);
    }
}

class Carro {
    String marca;
    String modelo;


    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }

    public String acelerar() {
        System.out.println("Acelerando o carro" + " " + this.marca + " " + this.modelo);
        return "agora";
    }
}

class Casa {
    public Casa() {
        System.out.println("minha casa");
    }
}
