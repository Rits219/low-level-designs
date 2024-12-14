package com.shrayansh.model.warehouseSelection;

import com.shrayansh.model.Address;
import com.shrayansh.model.Warehouse;

import java.util.List;

public class NearestWarehouseSelectionStrategy implements WarehouseSelectionStrategy{

    @Override
    public Warehouse selectWarehouse(Address address, List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
