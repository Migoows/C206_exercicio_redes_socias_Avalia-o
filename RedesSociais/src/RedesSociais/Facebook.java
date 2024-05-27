package RedesSociais;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto(){
        System.out.println("Publicou uma foto no Facebook");
    }
    @Override
    public void postarComentario(){
        System.out.println("Publicou um comentario no Facebook");
    }
    @Override
    public void postarVideo(){
        System.out.println("Publicou um video no Facebook");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicacao no Facebook");
    }
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou uma publicacao no Facebook");
    }
    @Override
    public void fazStreaming(){
        System.out.println("Realizou uma video conferencia no Facebook");
    }
}