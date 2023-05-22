package recursosDaLinguagem;

import java.util.function.Consumer;

public class MostraCliente implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println(o.getClass().getName());
        System.out.println(o);
    }
}
