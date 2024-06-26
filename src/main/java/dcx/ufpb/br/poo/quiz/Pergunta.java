package dcx.ufpb.br.poo.quiz;

import java.io.Serializable;

public abstract class Pergunta implements Serializable {

    private String enunciado;
    private String respostaCorreta;


    public abstract boolean estahCorretaResposta (String resposta);

    public Pergunta (String enunciado, String respostaCorreta){
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    public Pergunta(){
        this("","");
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}
