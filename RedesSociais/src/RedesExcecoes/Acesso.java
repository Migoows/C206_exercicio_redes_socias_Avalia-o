package RedesExcecoes;

public class Acesso extends RuntimeException{
    public Acesso(String message){
        super(message);
    }
}