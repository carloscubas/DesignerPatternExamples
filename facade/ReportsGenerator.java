public class ReportsGenerator {
    public static String generateReport(String reportType) {
        switch(reportType) {
            case "Customer":
                Reports customerReport = new CustomerReport();
                customerReport.getDataForReports(reportType);
                customerReport.generateReport();
                return reportType + "generated successfully!";

            case "OrderReport":
                Reports orderReport = new OrderReports();
                orderReport.getDataForReports(reportType);
                orderReport.generateReport();
                return reportType + "generated successfully!";
        }
        return "Invalid Report Type, Please select the correct one!";
    }
}