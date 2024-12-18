public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Carro c = new Carro("Ford" , "fiesta");
        Casa minhaCasa = new Casa();
        c.acelerar();
        String result = c.acelerar();

        System.out.println(result);
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
