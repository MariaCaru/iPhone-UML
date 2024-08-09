package iphone;

public abstract class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Métodos abstratos
    @Override
    public abstract void tocar();
    @Override
    public abstract void pausar();
    @Override
    public abstract void selecionarMusica(String musica);
    @Override
    public abstract void ligar(String numero);
    @Override
    public abstract void atender();
    @Override
    public abstract void iniciarCorreioVoz();
    @Override
    public abstract void exibirPagina(String url);
    @Override
    public abstract void adicionarNovaAba();
    @Override
    public abstract void atualizarPagina();
}
