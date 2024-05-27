package RedesSociais;

import RedesExcecoes.Acesso;
import RedesExcecoes.UsuarioChecked;

import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        String nome;
        String email;

        int op = 0; // opcao de entrada

        HashSet<RedeSocial> redeSocialHashSet = new HashSet<>(); // Hashset para nova rede social

        Usuario usuario = new Usuario(redeSocialHashSet);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie uma conta de usuario com nome e email: ");

        nome = scanner.nextLine();
        email = scanner.nextLine();

        usuario.setEmail(email);
        usuario.setNome(nome);

        System.out.println("Escolha duas redes sociais para fazer login: "); // opcoes de login
        System.out.println("1-Instagram");
        System.out.println("2-Facebook");
        System.out.println("3-Google+");
        System.out.println("4-Twitter");

        op = scanner.nextInt();
        scanner.nextLine();

        try{

            while (op != 5){

                switch (op){

                    case 1:
                        System.out.println("Digite a senha: ");

                        String senhaInstagram = getPasswordFromUser(scanner);

                        int numAmigos1 = 0;

                        Instagram insta = new Instagram(senhaInstagram, numAmigos1);

                        while (insta.compareTo(insta) == 1){
                            System.out.println("A senha ja existe! Tente novamente: ");
                            senhaInstagram = getPasswordFromUser(scanner);
                        }
                        Usuario.criarUsuario(usuario, insta);

                        int opcao1 = 0;

                        System.out.println("Selecione uma opcao: "); // opcoes para instagram
                        System.out.println("1-curtir uma publicacao");
                        System.out.println("2-postar um video");
                        System.out.println("3-postar uma foto");
                        System.out.println("4-postar um comentario");

                        while (opcao1 != 5){
                            switch (opcao1){
                                case 1:
                                    insta.curtirPublicacao();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    insta.postarVideo();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    insta.postarFoto();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    insta.postarComentario();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                            }
                            System.out.println("Selecione outra opcao, ou aperte 5 para sair");
                            opcao1 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        System.out.println("Você não tem uma conta no Facebook :(");
                        break;
                    case 3:

                        String senhaGoogle = getPasswordFromUser(scanner);

                        int numAmigos3 = 0;

                        GooglePlus googlePlus = new GooglePlus(senhaGoogle, numAmigos3);

                        while (googlePlus.compareTo(googlePlus) == 1){
                            System.out.println("Senha ja existe! Tente novamente: ");
                            senhaGoogle = getPasswordFromUser(scanner);
                        }
                        Usuario.criarUsuario(usuario, googlePlus);

                        int opcao3 = 0;
                        System.out.println("Selecione uma opcao: "); // opcoes para googleplus
                        System.out.println("1-curtir");
                        System.out.println("2-postar vídeo");
                        System.out.println("3-postar foto");
                        System.out.println("4-postar comentário");
                        System.out.println("5-compartilhar uma postagem");
                        System.out.println("6-abrir uma live");

                        while (opcao3 != 7){
                            switch (opcao3){
                                case 1:
                                    googlePlus.curtirPublicacao();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    googlePlus.postarVideo();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    googlePlus.postarFoto();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    googlePlus.postarComentario();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 5:
                                    googlePlus.compartilhar();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 6:
                                    googlePlus.fazStreaming();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                            }
                            System.out.println("Selecione outra opcao, ou aperte 7 pra sair do GooglePlus");
                            opcao3 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    case 4:
                        System.out.println("Você não tem uma conta no Twitter :(");
                        break;
                }
                System.out.println("Escolha uma rede social para entrar, ou 5 para sair");
                op = scanner.nextInt();
                scanner.nextLine();
            }
        }
        catch (Acesso e){
            System.out.println("O acesso a sua conta foi negado!" + e.getMessage());
        } catch (UsuarioChecked e){
            throw new RuntimeException(e);
        }
    }
    private static String getPasswordFromUser(Scanner scanner){ // variavel para chamar a senha da rede
        System.out.print("Senha: ");
        return scanner.nextLine();
    }
}