package excecoes;

/**
 *
 * @author Rafael
 */
public class EntradaNula extends Exception{

    public EntradaNula() {
        super("Um arquivo de entrada deve ser informado");
    }
 
}
