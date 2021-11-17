package projecto.jhpiego.psm.model;

public class InterViewID  {
    private String txtFullName;
    private String txtOrganization;
    private String dataDates;
    private String chkOnSet;
    private String chkByPhone;
    private String chkByEmail;
    private String txtOthers;
    private String txtSecInterV;
    private String txtSecInterVTwoo;

    public InterViewID() {
    }

    public InterViewID(String txtFullName, String txtOrganization, String dataDates, String chkOnSet, String chkByPhone, String chkByEmail, String txtOthers, String txtSecInterV, String txtSecInterVTwoo) {
        this.txtFullName = txtFullName;
        this.txtOrganization = txtOrganization;
        this.dataDates = dataDates;
        this.chkOnSet = chkOnSet;
        this.chkByPhone = chkByPhone;
        this.chkByEmail = chkByEmail;
        this.txtOthers = txtOthers;
        this.txtSecInterV = txtSecInterV;
        this.txtSecInterVTwoo = txtSecInterVTwoo;
    }

    public String getTxtFullName() {
        return txtFullName;
    }

    public void setTxtFullName(String txtFullName) {
        this.txtFullName = txtFullName;
    }

    public String getTxtOrganization() {
        return txtOrganization;
    }

    public void setTxtOrganization(String txtOrganization) {
        this.txtOrganization = txtOrganization;
    }

    public String getDataDates() {
        return dataDates;
    }

    public void setDataDates(String dataDates) {
        this.dataDates = dataDates;
    }

    public String getCboOnSet() {
        return chkOnSet;
    }

    public void setCboOnSet(String chkOnSet) {
        this.chkOnSet = chkOnSet;
    }

    public String getCboByPhone() {
        return chkByPhone;
    }

    public void setCboByPhone(String chkByPhone) {
        this.chkByPhone = chkByPhone;
    }

    public String getCboByEmail() {
        return chkByEmail;
    }

    public void setCboByEmail(String chkByEmail) {
        this.chkByEmail = chkByEmail;
    }

    public String getTxtOthers() {
        return txtOthers;
    }

    public void setTxtOthers(String txtOthers) {
        this.txtOthers = txtOthers;
    }

    public String getTxtSecInterV() {
        return txtSecInterV;
    }

    public void setTxtSecInterV(String txtSecInterV) {
        this.txtSecInterV = txtSecInterV;
    }

    public String getTxtSecInterVTwoo() {
        return txtSecInterVTwoo;
    }

    public void setTxtSecInterVTwoo(String txtSecInterVTwoo) {
        this.txtSecInterVTwoo = txtSecInterVTwoo;
    }
}
