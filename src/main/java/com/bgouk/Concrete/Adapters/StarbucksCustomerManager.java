package com.bgouk.Concrete.Adapters;

import com.bgouk.Abstract.BaseCustomerManager;
import com.bgouk.Abstract.ICustomerCheckService;
import com.bgouk.Concrete.Entities.Customer;

import java.net.MalformedURLException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService iCustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if(!iCustomerCheckService.Verify(customer)){
            throw new Exception("Kullanici eklenmedi");

        }
        super.Save(customer);
    }

}
