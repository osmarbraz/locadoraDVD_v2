package controle;

import entidade.Amigo;


/**
 * @author osmar
 * @version 1.0
 * @created 07-abr-2022 12:40:12
 */
public class CadastroAmigo {

    private Amigo amigos[];

    public CadastroAmigo(Amigo[] amigos) {
        this.amigos = amigos;
    }

    public Amigo[] getAmigos() {
        return amigos;
    }

    public void setAmigos(Amigo[] amigos) {
        this.amigos = amigos;
    }

    /**
     *
     * @param amigo
     */
    public void inclui(Amigo amigo) {

    }

    /**
     *
     * @param amigo
     */
    public void altera(int amigo) {

    }

    /**
     *
     * @param amigo
     */
    public void exclui(int amigo) {

    }

    /**
     *
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {

        super.finalize();

    }
}//end CadastroAmigo
