public class Main {
    public static void main(String[] args) {
        Fila umafila = Fila.getInstancia();
        Fila outrafila = Fila.getInstancia();

        if (umafila == outrafila){
            System.out.println("Ok deu certo.\n");
        } else{
            System.out.println("Eitarr algo deu errado.\n");
        }
    }
}