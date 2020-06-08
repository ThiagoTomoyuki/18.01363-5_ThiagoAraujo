package interfaces;

import enums.JornadaEnum;
import enums.MembrosEnum;

public interface PostarMensagem {
    void CriarMensagem(JornadaEnum jornada, MembrosEnum tipo);
}