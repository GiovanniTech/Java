/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Giova
 */
public class DAO extends Veiculos {

    private final ArrayList<Veiculos> arrayList;
    private ArrayList<Veiculos> retorno;
    private Veiculos veiculos;
    private final Integer tamanhoLista;

    public ArrayList<Veiculos> getArrayList() {
        return arrayList;
    }

    public DAO() {
        arrayList = new ArrayList();
        tamanhoLista = arrayList.size();
    }

    public void cadastrarVeiculo(Veiculos veiculo) {
        try {

            veiculo.setCodVeiculo(arrayList.size());
            arrayList.add(veiculo);
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em cadastrar veículo " + e.getMessage());
        }
    }

    public void alterarVeiculo(Integer codVeiculo, Veiculos veiculo) {

        try {
            Veiculos veiculoAntigo = arrayList.get(codVeiculo);

            veiculoAntigo.setNomeVeiculo(veiculo.getNomeVeiculo());
            veiculoAntigo.setMarcaVeiculo(veiculo.getMarcaVeiculo());
            veiculoAntigo.setTipoVeiculo(veiculo.getTipoVeiculo());
            veiculoAntigo.setValorVeiculo(veiculo.getValorVeiculo());
            veiculoAntigo.setAnoVeiculo(veiculo.getAnoVeiculo());
            arrayList.set(codVeiculo, veiculoAntigo);

            JOptionPane.showMessageDialog(null, "Veículo alterado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro em alterar veículo " + e.getMessage());
        }
    }

    public Veiculos pesquisarVeiculo(Integer codVeiculo) {

        try {
            veiculos = arrayList.get(codVeiculo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar veiculo " + e.getMessage());
        }
        return veiculos;
    }

    public void calcularMediaValores() {

        try {
            Veiculos veiculo;
            Double soma = 0.0, media;
            int i;

            for (i = 0; i <= tamanhoLista; i++) {
                veiculo = arrayList.get(i);
                soma = soma + veiculo.getValorVeiculo();
            }
            media = soma / tamanhoLista;
            JOptionPane.showMessageDialog(null, "A média de valores de " + tamanhoLista + " é de: R$" + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular média de veículos: " + e.getMessage());
        }
    }

    public Veiculos mostrarMaiorValor(String filtro) {
//        veiculos = new Veiculos();
        try {

            switch (filtro) {
                case "MAIOR":
                    veiculos = iteraListaPorMaiorValor();
                    break;
                case "MENOR":
                    veiculos = iteraListaPorMenorValor();
                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao capturar veículo mais caro entre veículos: " + e.getMessage());
        }

        return veiculos;
    }

    public void mostrarPorTipo(String tipo) {

        try {
            JOptionPane.showMessageDialog(null, "Tipo : " + tipo);
            switch (tipo) {
                case "PICAPE":
                    iteraListaPorTipo(tipo);
                    break;
                case "SEDAN":
                    iteraListaPorTipo(tipo);
                    break;
                case "SUV":
                    iteraListaPorTipo(tipo);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de veículo não cadastrado no sistema.");
                    break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao capturar lista de veículos por tipo: " + e.getMessage());
        }

    }

    private void iteraListaPorTipo(String tipo) {

        int i;
        for (i = 0; i <= tamanhoLista; i++) {
            veiculos = arrayList.get(i);
            if (veiculos.getTipoVeiculo().equals(tipo)) {
                JOptionPane.showMessageDialog(null, "Código: " + veiculos.getNomeVeiculo() + "\nNome: " + veiculos.getNomeVeiculo()
                        + "\nMarca: " + veiculos.getMarcaVeiculo() + "\nTipo: " + veiculos.getTipoVeiculo() + "\nValor: " + veiculos.getValorVeiculo()
                        + "\nAno: " + veiculos.getAnoVeiculo());
            }
        }

    }

    private Veiculos iteraListaPorMaiorValor() {

        retorno = new ArrayList();
        veiculos = new Veiculos();

        int i, pos = 0;
        Double maiorSalario = 99999.0;

        for (i = 0; i <= tamanhoLista;  i++) {
            if (arrayList.get(i).getValorVeiculo() <= maiorSalario) {
                maiorSalario = arrayList.get(i).getValorVeiculo();
                pos = i;
            }
        }

        veiculos = arrayList.get(pos);
        return veiculos;
    }

    private Veiculos iteraListaPorMenorValor() {

        int i, pos = 0;
        Double menorSalario = 99999.0;

        for (i = 0; i <= tamanhoLista; i++) {
            if (arrayList.get(i).getValorVeiculo() <= menorSalario) {
                menorSalario = arrayList.get(i).getValorVeiculo();
                pos = i;
            }
        }

        veiculos = arrayList.get(pos);
        return veiculos;
    }

}
