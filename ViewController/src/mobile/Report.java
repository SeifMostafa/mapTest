package mobile;

import java.lang.reflect.Type;

import java.util.ArrayList;

import java.util.logging.Logger;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.amx.event.SelectionEvent;
import oracle.adfmf.bindings.dbf.AmxAttributeBinding;
import oracle.adfmf.bindings.dbf.AmxBindingContainer;
import oracle.adfmf.framework.api.AdfmfContainerUtilities;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;
import oracle.adfmf.framework.exception.AdfException;

enum TYPE {
    fire,
    ambulance,
    road,
    police
};

public class Report {
    public static final int NEW = 0, CREATED = 1, SOLVED = 2;
    int user_id, report_id, priority,Status;
    String description, type, imageUrl;
    double latitude, longitude;
    public String iconUri;
    private String addReport;

    public Report() {
        super();
    }


    String geticonUri() {
        String uri = null;
        switch (this.type) {
        case "fire":
            uri = "/image/fire.png";
            break;
        case "police":
            uri = "/image/police.png";
            break;
        case "road":
            uri = "/image/road.png";

            break;
        case "ambulance":
            uri = "/image/ambulance.png";
            break;
        }
        return uri;
    }

        //check point
    int getStatus(POINT p) {
        if (findReportByPoint(p)) {
            if (findReportByPoint().Status == SOLVED)
                return SOLVED;
            else
                return CREATED;
        } else
            return NEW;

    }

    boolean findReportByPoint(POINT P) {
        ArrayList<Report> reports = null;
        return true; // if contains
        // else return false;
    }

    Report findReportByPoint() {
        ArrayList<Report> reports = null;
        return this; // if contains return it
        // else return false;
    }


    public int getUser_id() {
        return user_id;
    }

    public int getReport_id() {
        return report_id;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getStatus() {
        return Status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Report(int user_id, int report_id, int priority, String description, String type, int status,
                  double lat, double lon) {
        this.user_id = user_id;
        this.report_id = report_id;
        this.priority = priority;
        this.description = description;
        this.type = type;
        this.Status = status;
        this.latitude = lat;
        this.longitude = lon;
        geticonUri();
    }

    public ArrayList<Report> getReports() {
        ArrayList<Report> reports = new ArrayList<Report>();
        reports.add(new Report(1, 1, 1, "desc", "fire", NEW, 30, 30));
        reports.add(new Report(5, 2, 2, "desc", "police", CREATED, 31, 30));
        reports.add(new Report(3, 3, 0, "desc", "road", CREATED, 31, 31));
        reports.add(new Report(2, 4, 1, "desc", "fire", SOLVED, 30, 31));
        return reports;
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<TYPE> ReportGuide(String type) {
        ArrayList TYPES = new ArrayList();
        switch (type) {
        case "fire":
            TYPES.add(TYPE.fire);
            TYPES.add(TYPE.police);
            break;
        case "HealthCare":
            TYPES.add(TYPE.ambulance);
            TYPES.add(TYPE.police);
            break;
        case "RoadAccident":
            TYPES.add(TYPE.police);
            TYPES.add(TYPE.road);
            TYPES.add(TYPE.ambulance);
            break;
        case "RoadBreakdown":
            TYPES.add(TYPE.police);
            TYPES.add(TYPE.road);
            break;
        case "Crime":
            TYPES.add(TYPE.police);
            break;
        }
        return TYPES;
    }

    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIconUri() {
        return iconUri;
    }
    public void CreateReport(){
        
    }
    public boolean CheckIfReportExist() {
        return false;
    }

    public void getstatus(SelectionEvent selectionEvent) {
        // Add event code here...
    }

    public void getStatus(SelectionEvent selectionEvent) {
        // Add event code here...
    }

    public void viewReport(ActionEvent actionEvent) {
        // Add event code here...

    }
    public String AddReport() {
        // Add event code here...
      //  AmxBindingContainer bindings = (AmxBindingContainer) AdfmfJavaUtilities.evaluateELExpression("#{bindings}");
      //  Object type = bindings.get("type");
   //    AmxAttributeBinding aab = (AmxAttributeBinding)type;
        
        // lan,lot,
       System.out.print(this.type);
        System.out.print("HASSAN");
        
        return "home" ;

    }

}
