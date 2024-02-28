package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int number = 8028;
        Date date = sdf.parse("25/06/2018");
        double totalValue = 600.00;
        int installments = 3;

        Contract contract = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, installments);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

    }
}


