package com.porta137.KTANEEdgework;

import com.porta137.KTANEEdgework.enums.Indicators;
import com.porta137.KTANEEdgework.enums.Ports;

public class EdgeworkBuilder {
    //required params
    public final String serialNumber;

    //optional params
    public Ports[] ports;
    public int BatteryCount;
    public int BatteryHolderCount;
    public Indicators[] unlitIndicators;
    public Indicators[] litIndicators;

    public EdgeworkBuilder(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public EdgeworkBuilder BatteryCount(int BatteryCount) {
        this.BatteryCount = BatteryCount;
        return this;
    }

    public EdgeworkBuilder BatteryHolderCount(int BatteryHolderCount) {
        this.BatteryHolderCount = BatteryHolderCount;
        return this;
    }

    public EdgeworkBuilder ports(Ports... ports) {
        this.ports = ports;
        return this;
    }

    public EdgeworkBuilder unlitIndicators(Indicators... unlitIndicators) {
        this.unlitIndicators = unlitIndicators;
        return this;
    }

    public EdgeworkBuilder litIndicators(Indicators... litIndicators) {
        this.litIndicators = litIndicators;
        return this;
    }

    public Edgework build() {
        return new Edgework(this);
    }
}