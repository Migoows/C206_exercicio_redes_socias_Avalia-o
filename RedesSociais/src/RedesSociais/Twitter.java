package RedesSociais;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto(){
        System.out.println("Publicou uma foto no Twitter");
    }
    @Override
    public void postarComentario(){
        System.out.println("Publicou um comentario no Twitter");
    }
    @Override
    public void postarVideo(){
        System.out.println("Publicou um video no Twitter");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicacao no Twitter");
    }
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou uma publicacao no Twitter");
    }
}