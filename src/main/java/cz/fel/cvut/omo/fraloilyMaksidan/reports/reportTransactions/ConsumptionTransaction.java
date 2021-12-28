package cz.fel.cvut.omo.fraloilyMaksidan.reports.reportTransactions;

import cz.fel.cvut.omo.fraloilyMaksidan.activities.appliances.ApplianceActivity;
import cz.fel.cvut.omo.fraloilyMaksidan.activities.appliances.consumptions.Consumption;

public class ConsumptionTransaction {
    private ApplianceActivity entity;
    private Consumption consumption;

    public ConsumptionTransaction(ApplianceActivity entity, Consumption consumption) {
        this.entity = entity;
        this.consumption = consumption;
    }

    public ApplianceActivity getEntity() {
        return entity;
    }

    public Consumption getConsumption() {
        return consumption;
    }
}
