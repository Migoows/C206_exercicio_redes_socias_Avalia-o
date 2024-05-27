package RedesSociais;

public class Instagram extends RedeSocial implements Comparable<Instagram>{

    public Instagram(String senha, int numAmigos){
        super(senha, numAmigos);
    }
    @Override
    public void postarFoto(){
        System.out.println("postou uma foto no Instagram");
    }
    @Override
    public void postarVideo(){
        System.out.println("postou um vídeo no Instagram");
    }
    @Override
    public void postarComentario(){
        System.out.println("postou um comentário no Instagram");
    }
    @Override
    public int compareTo(Instagram instagram){
        if(instagram.senha == this.senha){
            return 0;
        }
        else{
            return 1;
        }
    }
}