package recursosDaLinguagem;

@FunctionalInterface
public interface Authenticator {
    boolean autentica(String senha);
}
