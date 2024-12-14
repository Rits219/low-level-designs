package com.shrayansh.model;

import com.shrayansh.model.warehouseSelection.WarehouseSelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    private List<Warehouse> warehouseList;

    public WarehouseController() {
        this.warehouseList = new ArrayList<>();
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse) {
        warehouseList.remove(warehouse);
    }

    public Warehouse selectWarehouse(Address address,WarehouseSelectionStrategy warehouseSelectionStrategy) {
        return warehouseSelectionStrategy.selectWarehouse(address, warehouseList);
    }
}
