package excecoes;

/**
 *
 * @author Rafael
 */
public class SaidaNula extends Exception{

    public SaidaNula() {
        super("Um arquivo de saída deve ser informado");
    }
 
}
