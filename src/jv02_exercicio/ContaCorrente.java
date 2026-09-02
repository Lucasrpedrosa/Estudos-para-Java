package jv02_exercicio;

import java.time.LocalDate;

public class ContaCorrente {
    // Declaração de variáveis
    String nomeCliente;
    Integer numeroConta, numeroAgencia;
    Double saldoConta;
    LocalDate dataNascimento;
    boolean ativo = true;

    Double visualizarSaldo(){   // Retorna o valor atual do saldo do cliente.
        return saldoConta;
    }

    void consultarExtrato(LocalDate datainicial, LocalDate dataFinal){  // Metodo que retorna as todas as transações realizadas e suas seguintes datas.


         ;
    }

    void cancelar(String jsutificativa){    // Cancela a conta do cliente adicionando uma justificativa.

    }

    void sacar(Double valorSaque) { // Checa o valor de saque com o valor do saldo.

    }

    void transferir(ContaCorrente contaDestino, Double valorTransferencia ) {   // Transfere um valor de uma conta para outra.


    }

}
