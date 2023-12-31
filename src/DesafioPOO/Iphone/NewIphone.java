package DesafioPOO.Iphone;

import DesafioPOO.Controllers.Volume.ControleDeVolumeImpl;
import DesafioPOO.Controllers.Volume.IControleDeVolume;
import DesafioPOO.Service.ChamadaTelefonica.IChamadaTelefonica;
import DesafioPOO.Service.NavegacaoInternet.INavegacaoInternet;
import DesafioPOO.Service.ReprodutorMidia.IReprodutorMidias;;

public class NewIphone implements IChamadaTelefonica, IControleDeVolume, INavegacaoInternet, IReprodutorMidias {
    private IControleDeVolume controleDeVolume; // Usar a interface IControleDeVolume

    public NewIphone() {
        this.controleDeVolume = new ControleDeVolumeImpl(); // Inicializar o controle de volume
    }

    // Métodos para controlar o volume, delegando para a instância de
    // IControleDeVolume
    public void aumentarVolume() {
        controleDeVolume.aumentarVolume();
    }

    public void diminuirVolume() {
        controleDeVolume.diminuirVolume();
    }

    public int getVolume() {
        return controleDeVolume.getVolume();
    }
    
    @Override
    public void setVolume(int novoVolume) {
        controleDeVolume.setVolume(novoVolume);
    }


    // Métodos para utilizar a Interface IChamadaTelefonica
    @Override
    public void efetuarLigacao() {

    }

    @Override
    public void atenderLigacao() {

    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void selecionarMidia() {
        
    }

    @Override
    public void reproduzirMidia() {

    }

    @Override
    public void pausarMidia() {

    }
}