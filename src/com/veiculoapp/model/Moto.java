package com.veiculoapp.model;

public class Moto extends Veiculo{
    private boolean temCarenagem;

    public Moto(String marca, boolean temCarenagem){
        super(marca);
        this.temCarenagem = temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }

    public boolean getTemCarenagem(){
        return temCarenagem;
    }

    @Override
    public String toString(){

        if(temCarenagem == true){
            return "Marca: " + marca + " - Com carenagem";
        }
        else{
            return "Marca: " + marca + " - Sem carenagem";
        }


    }
}
