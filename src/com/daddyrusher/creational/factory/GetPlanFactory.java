package com.daddyrusher.creational.factory;

import com.daddyrusher.creational.factory.entity.CommercialPlan;
import com.daddyrusher.creational.factory.entity.DomesticPlan;
import com.daddyrusher.creational.factory.entity.InstitutionalPlan;
import com.daddyrusher.creational.factory.entity.Plan;

/** Factory that produced Plan sub-entities*/
public class GetPlanFactory {
    public Plan getPlan(EPlanType planType) {
        if (planType == null) {
            return null;
        }
        switch (planType) {
            case DOMESTICPLAN:
                return new DomesticPlan();
            case COMMERCIALPLAN:
                return new CommercialPlan();
            case INSTITUTIONALPLAN:
                return new InstitutionalPlan();
        }
        return null;
    }
}
