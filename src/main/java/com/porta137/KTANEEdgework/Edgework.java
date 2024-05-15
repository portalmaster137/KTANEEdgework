package com.porta137.KTANEEdgework;

import com.porta137.KTANEEdgework.enums.Indicators;
import com.porta137.KTANEEdgework.enums.Ports;

public class Edgework {

    public String serialNumber;
    public Ports[] ports;
    public int BatteryCount;
    public int BatteryHolderCount;
    public Indicators[] unlitIndicators;
    public Indicators[] litIndicators;

    public Edgework(EdgeworkBuilder builder) {
        this.serialNumber = builder.serialNumber;
        this.ports = builder.ports;
        this.BatteryCount = builder.BatteryCount;
        this.BatteryHolderCount = builder.BatteryHolderCount;
        this.unlitIndicators = builder.unlitIndicators;
        this.litIndicators = builder.litIndicators;
    }

    public int getIndicatorsCount() {
        return unlitIndicators.length + litIndicators.length;
    }


}
