package RedesSociais;

public abstract class RedeSocial{
    protected String senha;
    protected int numAmigos;
    public RedeSocial(String senha, int numAmigos){ // criando construtor para senha e numAmiigos
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    public String getSenha(){ // criando getters e setters para senha e numAmigos
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public int getNumAmigos(){
        return numAmigos;
    }
    public void setNumAmigos(int numAmigos){
        this.numAmigos = numAmigos;
    }
    public abstract void postarFoto(); // criando opcoes de interacao para redes sociais
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("Publicação curtida!");
    }
}