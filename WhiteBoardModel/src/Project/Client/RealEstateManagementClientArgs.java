package Project.Client;

import Project.BusinessLogic.RealEstateTypes;
import Project.BusinessLogic.Tenant;

import java.time.LocalDate;

public class RealEstateManagementClientArgs {
    public static void main(String[] args) {
        Tenant tenant1 = new Tenant(args[0], RealEstateTypes.valueOf(args[1]), LocalDate.parse(args[2]), Double.parseDouble(args[3]));
        System.out.println(tenant1.toString());
    }
}
