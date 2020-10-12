public class Numero {
    private int numeroEscolhido;
    private int numero;

    public Numero(int numeroEscolhido, int numero) {
        this.numeroEscolhido = numeroEscolhido;
        this.numero = numero;
    }

    public int getNumeroEscolhido() {
        return this.numeroEscolhido;
    }

    public void setNumero(String numeroDigitado) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void verificar() {
        if (numero > 0 && numero <= 100) {

            if (numero < numeroEscolhido) {
                System.out.printf("%nTente um número mais alto");
            } else if (numero > numeroEscolhido) {
                System.out.printf("%nTente um número mais baixo");
            } else {
                System.out.printf("%nAcertou!");
            }
        } else {
            System.out.printf("%nEscolha um número de 0 a 100.");
        }
    }
}