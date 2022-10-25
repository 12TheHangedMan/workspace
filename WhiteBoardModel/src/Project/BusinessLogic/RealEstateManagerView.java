package Project.BusinessLogic;

import java.time.LocalDate;

public class RealEstateManagerView {

    public void tenantRemoval(Tenant tenant) {
        if (isDuplicateID(tenant.getTenantID())) {
            tenantRemovalCore(tenant);
        } else {
            System.out.println("Tenant " + tenant.getTenantID() + " does not exist!");
        }
    }

    private void tenantRemovalCore(Tenant tenant) {
        for (int i = 0; i < TenantsCollection.tenants.length; i++) {
            if (TenantsCollection.tenants[i] != null && TenantsCollection.tenants[i].equals(tenant)) {
                TenantsCollection.tenants[i] = null;
                System.out.println("Tenant " + tenant.getTenantID() + " is removed!");
                break;
            }
        }
    }

    public void tenantAdd(Tenant tenant) {
        if (isDuplicateID(tenant.getTenantID())) {
            System.out.println("Tenant " + tenant.getTenantID() + " already exists in the system!");
        } else {
            insertTenant(tenant);
        }
    }

    private boolean isDuplicateID(String tenantID) {
        boolean isDuplicate = false;
        for (int i = 0; i < TenantsCollection.tenants.length; i++) {
            if (TenantsCollection.tenants[i] != null) {
                if (TenantsCollection.tenants[i].getTenantID().equals(tenantID)) {
                    isDuplicate = true;
                }
            }
        }
        return isDuplicate;
    }

    private void insertTenant(Tenant tenant) {
        for (int i = 0; i < TenantsCollection.tenants.length; i++) {
            if (TenantsCollection.tenants[i] == null) {
                TenantsCollection.tenants[i] = tenant;
                System.out.println("Tenant " + tenant.getTenantID() + " is added to the system.");
                break;
            }
        }
    }

    public void tenantInfoEdit(Tenant tenant) {
        // not necessary in this example.
    }

    public void reportTenantsStatus() {
        for (int i = 0; i < TenantsCollection.tenants.length; i++) {
            if (TenantsCollection.tenants[i] != null) {
                System.out.println(TenantsCollection.tenants[i].toString());
                reportTenantPayment(TenantsCollection.tenants[i]);
                reportTenantLatePayments(TenantsCollection.tenants[i]);
                reportTenantOwedPayment(TenantsCollection.tenants[i]);
                reportSuggestedActionToTenant(TenantsCollection.tenants[i]);
                System.out.println();
            }
        }
    }

    private void reportTenantPayment(Tenant tenant) {
        double totalPayment = tenant.getDeposit();
        for (int i = 0; i < tenant.getMonthlyPaymentChart().length; i++) {
            if (tenant.getMonthlyPaymentChart()[i] != null) {
                totalPayment += tenant.getMonthlyRate();
            }
        }
        System.out.println("Tenant " + tenant.getTenantID() + " has paid: " + totalPayment);
    }

    private int reportTenantLatePaymentCore(Tenant tenant) {
        LocalDate currentDate = LocalDate.now();
        int tenantLateTimes = 0;
        for (int i = 0; i < tenant.getMonthlyDueDateChart().length; i++) {
            if (tenant.getMonthlyDueDateChart()[i].isBefore(currentDate)) {
                if (tenant.getMonthlyPaymentDateChart()[i] == null
                        || tenant.getMonthlyPaymentDateChart()[i].isAfter(tenant.getMonthlyDueDateChart()[i])) {
                    tenantLateTimes++;
                }
            } else {
                break;
            }
        }
        return tenantLateTimes;
    }

    private void reportTenantLatePayments(Tenant tenant) {
        System.out.println("Tenant " +
                tenant.getTenantID() +
                " total late payment times:" +
                reportTenantLatePaymentCore(tenant));
    }

    private void reportTenantOwedPayment(Tenant tenant) {
        LocalDate currentDate = LocalDate.now();
        int owedPayment = 0;
        for (int i = 0; i < tenant.getMonthlyDueDateChart().length; i++) {
            if (tenant.getMonthlyDueDateChart()[i].isBefore(currentDate)) {
                if (tenant.getMonthlyPaymentDateChart()[i] == null) {
                    if (i > 0) {
                        owedPayment += tenant.getMonthlyRate();
                    } else {
                        owedPayment += tenant.getMonthlyRate() + tenant.getDeposit();
                    }
                }
            } else {
                break;
            }
        }
        System.out.println("Tenant " + tenant.getTenantID() + " total owed money: " + owedPayment);
    }

    private void reportSuggestedActionToTenant(Tenant tenant) {
        String suggestedAction = "No action required.";
        switch (reportTenantLatePaymentCore(tenant)) {
            case 0:
                break;
            case 1:
            case 2:
                suggestedAction = "Need to collect rent.";
                break;
            default:
                suggestedAction = "Considering evacuation, no further contract with tenant!";
        }
        System.out.println(suggestedAction);
    }
}
