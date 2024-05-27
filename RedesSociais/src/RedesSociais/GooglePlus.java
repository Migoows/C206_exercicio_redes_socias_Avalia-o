package RedesSociais;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia, Comparable<GooglePlus>{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto(){
        System.out.println("Publicou uma foto no GooglePlus");
    }
    @Override
    public void postarComentario(){
        System.out.println("Publicou um comentario no GooglePlus");
    }
    @Override
    public void postarVideo(){
        System.out.println("Publicou um video no GooglePlus");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicacao no GooglePlus");
    }
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou uma publicacao no GooglePlus");
    }
    @Override
    public void fazStreaming(){
        System.out.println("Realizou uma video conferencia no Google Plus");
    }


    @Override
    public int compareTo(GooglePlus google) {
        if(google.senha == this.senha){
            return 0;
        }
        else{
            return 1;
        }
    }
}