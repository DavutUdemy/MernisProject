package com.bgouk;

import com.bgouk.Concrete.Adapters.MernisAdapter;
import com.bgouk.Concrete.Entities.Customer;
import com.bgouk.Concrete.NeroCustomerManager;
import com.bgouk.Concrete.StarbucksCustomerManager;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        Customer customer = new Customer(2,"engin","demiroğ",LocalDate.of(1985,1,6),28861499108L);
        neroCustomerManager.Save(customer);
        System.out.println(customer.getFirstName().toUpperCase(new Locale("tr")));
        StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisAdapter());
        starbucksCustomerManager.Save(customer);

    }
}
