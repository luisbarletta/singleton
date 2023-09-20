public class Fila {
    private static Fila instancia = null;

    private Fila(){
    }

    public static Fila getInstancia(){
        if(instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }
}