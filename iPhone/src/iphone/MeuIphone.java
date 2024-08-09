package iphone;

public class MeuIphone {
    public static void main(String[] args) {
        iPhoneFuncional meuIPhone = new iPhoneFuncional();
        
        //Simula o uso do Aparelho do Reprodutor Musical
        meuIPhone.selecionarMusica("Fogo Nos Racistas - Black Pantera");
        meuIPhone.tocar();
        meuIPhone.pausar();

        //Simula o uso do Aparelho Telefônico
        meuIPhone.ligar("32-991130093");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        //Simula o uso do Navegado na Internet
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();


    }
}
