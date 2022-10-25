package Project.test;

import Project.BusinessLogic.RealEstateManagerView;
import Project.BusinessLogic.RealEstateTypes;
import Project.BusinessLogic.Tenant;
import Project.BusinessLogic.TenantsCollection;

import java.time.LocalDate;

public class RealEstateManagementCoreTest {
    public static void main(String[] args) {
        //tenant without credit score check, deposit will be 2 times of monthly rate.
        Tenant tenant1 = new Tenant("Jason", RealEstateTypes.SingleBedroom, LocalDate.now(), 1000);
        //tenant with a good credit score, deposit will be default as 1 times monthly rate.
        Tenant tenant2 = new Tenant("Jamison", RealEstateTypes.SingleFamilyHouse, LocalDate.now(), 3000, 720);

        //tenant with a bad credit score, deposit will be 2 times of monthly rate.
        Tenant tenant3 = new Tenant("Jackson", RealEstateTypes.TownHouse, LocalDate.of(2021, 10, 24), 2500, 330);

        tenant1.payRent("transactionID1-1", LocalDate.now(), LocalDate.of(2020, 6, 25));

        //when inputting due date is earlier than move in date, system will not take it.
        tenant1.payRent("transactionID1-2", LocalDate.of(2020, 6, 25), LocalDate.now());

        tenant3.payRent("transactionID3-1", LocalDate.of(2021, 10, 24), LocalDate.of(2021, 10, 24));
        tenant3.payRent("transactionID3-2", LocalDate.of(2021, 11, 24), LocalDate.of(2021, 11, 24));

        //example of a late transaction.
        tenant3.payRent("transactionID3-3", LocalDate.of(2021, 12, 24), LocalDate.of(2021, 12, 29));

        TenantsCollection.tenants[0] = tenant1;

        RealEstateManagerView manager1 = new RealEstateManagerView();
        manager1.tenantAdd(tenant1); //should not add because tenant1 already in the array;
        manager1.tenantAdd(tenant2);
        manager1.tenantRemoval(tenant3); //should not remove because tenant3 doesn't exist in the array;
        manager1.tenantRemoval(tenant1);
        manager1.tenantAdd(tenant1);
        manager1.tenantAdd(tenant3);
        manager1.reportTenantsStatus();
    }
}
