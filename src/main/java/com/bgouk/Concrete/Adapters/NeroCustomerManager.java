package com.bgouk.Concrete.Adapters;

import com.bgouk.Abstract.BaseCustomerManager;
import com.bgouk.Concrete.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void Save(Customer customer) throws Exception {
        super.Save(customer);
    }
}
