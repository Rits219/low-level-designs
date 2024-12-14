package com.shrayansh.model.warehouseSelection;

import com.shrayansh.model.Address;
import com.shrayansh.model.Warehouse;

import java.util.List;

public interface WarehouseSelectionStrategy {
    Warehouse selectWarehouse(Address address, List<Warehouse> warehouseList);
}
