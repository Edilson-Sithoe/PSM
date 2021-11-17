package projecto.jhpiego.psm.model;

public class UpsOne {
    private String chkYUPS;
    private String chkNUPS;

    private String chkWhoHospUPS;
    private String chkOpTheatreUPS;
    private String chkEmergRoomUPS;
    private String chkLabUPS;
    private String chkMaterUPS;

    private String txtOtherUPS;

    private String chkLessUPS;
    private String chkB3_10UPS; // Between 3-10
    private String chkB11_20UPS; //Between 11 20
    private String chkMore20UPS; //more than 20

    private String chkUPSY; //UPS Yes
    private String chkUPSN; //UPS No
    private String chkUPSPartly;
    private String chkUPSDontN;

    private String chkGIUUPS; // GIU Good In Use
    private String chkGBNUUPS; //Good but not use
    private String chkIU_BNRUPS; // In Use But Need Repair
    private String chkIUNNTRUPS; //In Use but need to be replaced
    private String chkOOSBRUPS; //Out Od Service But Replaced
    private String chkOOSAndNRUPS; // Out of service and need to be replaced;
    private String chkStilInstPhaUPS; // Sttill In the installation phase
    private String chkDontNUPS; //Don't Know

    private String txtCapacityUPS;

    private String chkPMYUPS; //preeventive maintenance Yes
    private String chkPMNUPS; //preeventive maintenance No

    private String chkPMITPHFUPS; //Internal Technical Personnel of the Health Facility
    private String chkPMPDIUPS; //Personnel from the Department of Infrastructure
    private String chkSubcontractedUPS;

    private String txtFreqPMUPS; //Frequence of PM
    private String txtNameOfMantUPS; //What the name of maintenance

    private String chkPMCMYUPS;
    private String chkPMCMNUPS;
    private String chkLoBYUPS;
    private String chkLoBNUPS;

    private String txtComentUPS;

    public UpsOne() {
    }

    public UpsOne(String chkYUPS, String chkNUPS, String chkWhoHospUPS, String chkOpTheatreUPS, String chkEmergRoomUPS, String chkLabUPS, String chkMaterUPS, String txtOtherUPS, String chkLessUPS, String chkB3_10UPS, String chkB11_20UPS, String chkMore20UPS, String chkUPSY, String chkUPSN, String chkUPSPartly, String chkUPSDontN, String chkGIUUPS, String chkGBNUUPS, String chkIU_BNRUPS, String chkIUNNTRUPS, String chkOOSBRUPS, String chkOOSAndNRUPS, String chkStilInstPhaUPS, String chkDontNUPS, String txtCapacityUPS, String chkPMYUPS, String chkPMNUPS, String chkPMITPHFUPS, String chkPMPDIUPS, String chkSubcontractedUPS, String txtFreqPMUPS, String txtNameOfMantUPS, String chkPMCMYUPS, String chkPMCMNUPS, String chkLoBYUPS, String chkLoBNUPS, String txtComentUPS) {
        this.chkYUPS = chkYUPS;
        this.chkNUPS = chkNUPS;
        this.chkWhoHospUPS = chkWhoHospUPS;
        this.chkOpTheatreUPS = chkOpTheatreUPS;
        this.chkEmergRoomUPS = chkEmergRoomUPS;
        this.chkLabUPS = chkLabUPS;
        this.chkMaterUPS = chkMaterUPS;
        this.txtOtherUPS = txtOtherUPS;
        this.chkLessUPS = chkLessUPS;
        this.chkB3_10UPS = chkB3_10UPS;
        this.chkB11_20UPS = chkB11_20UPS;
        this.chkMore20UPS = chkMore20UPS;
        this.chkUPSY = chkUPSY;
        this.chkUPSN = chkUPSN;
        this.chkUPSPartly = chkUPSPartly;
        this.chkUPSDontN = chkUPSDontN;
        this.chkGIUUPS = chkGIUUPS;
        this.chkGBNUUPS = chkGBNUUPS;
        this.chkIU_BNRUPS = chkIU_BNRUPS;
        this.chkIUNNTRUPS = chkIUNNTRUPS;
        this.chkOOSBRUPS = chkOOSBRUPS;
        this.chkOOSAndNRUPS = chkOOSAndNRUPS;
        this.chkStilInstPhaUPS = chkStilInstPhaUPS;
        this.chkDontNUPS = chkDontNUPS;
        this.txtCapacityUPS = txtCapacityUPS;
        this.chkPMYUPS = chkPMYUPS;
        this.chkPMNUPS = chkPMNUPS;
        this.chkPMITPHFUPS = chkPMITPHFUPS;
        this.chkPMPDIUPS = chkPMPDIUPS;
        this.chkSubcontractedUPS = chkSubcontractedUPS;
        this.txtFreqPMUPS = txtFreqPMUPS;
        this.txtNameOfMantUPS = txtNameOfMantUPS;
        this.chkPMCMYUPS = chkPMCMYUPS;
        this.chkPMCMNUPS = chkPMCMNUPS;
        this.chkLoBYUPS = chkLoBYUPS;
        this.chkLoBNUPS = chkLoBNUPS;
        this.txtComentUPS = txtComentUPS;
    }

    public String getChkYUPS() {
        return chkYUPS;
    }

    public void setChkYUPS(String chkYUPS) {
        this.chkYUPS = chkYUPS;
    }

    public String getChkNUPS() {
        return chkNUPS;
    }

    public void setChkNUPS(String chkNUPS) {
        this.chkNUPS = chkNUPS;
    }

    public String getChkWhoHospUPS() {
        return chkWhoHospUPS;
    }

    public void setChkWhoHospUPS(String chkWhoHospUPS) {
        this.chkWhoHospUPS = chkWhoHospUPS;
    }

    public String getChkOpTheatreUPS() {
        return chkOpTheatreUPS;
    }

    public void setChkOpTheatreUPS(String chkOpTheatreUPS) {
        this.chkOpTheatreUPS = chkOpTheatreUPS;
    }

    public String getChkEmergRoomUPS() {
        return chkEmergRoomUPS;
    }

    public void setChkEmergRoomUPS(String chkEmergRoomUPS) {
        this.chkEmergRoomUPS = chkEmergRoomUPS;
    }

    public String getChkLabUPS() {
        return chkLabUPS;
    }

    public void setChkLabUPS(String chkLabUPS) {
        this.chkLabUPS = chkLabUPS;
    }

    public String getChkMaterUPS() {
        return chkMaterUPS;
    }

    public void setChkMaterUPS(String chkMaterUPS) {
        this.chkMaterUPS = chkMaterUPS;
    }

    public String getTxtOtherUPS() {
        return txtOtherUPS;
    }

    public void setTxtOtherUPS(String txtOtherUPS) {
        this.txtOtherUPS = txtOtherUPS;
    }

    public String getChkLessUPS() {
        return chkLessUPS;
    }

    public void setChkLessUPS(String chkLessUPS) {
        this.chkLessUPS = chkLessUPS;
    }

    public String getChkB3_10UPS() {
        return chkB3_10UPS;
    }

    public void setChkB3_10UPS(String chkB3_10UPS) {
        this.chkB3_10UPS = chkB3_10UPS;
    }

    public String getChkB11_20UPS() {
        return chkB11_20UPS;
    }

    public void setChkB11_20UPS(String chkB11_20UPS) {
        this.chkB11_20UPS = chkB11_20UPS;
    }

    public String getChkMore20UPS() {
        return chkMore20UPS;
    }

    public void setChkMore20UPS(String chkMore20UPS) {
        this.chkMore20UPS = chkMore20UPS;
    }

    public String getChkUPSY() {
        return chkUPSY;
    }

    public void setChkUPSY(String chkUPSY) {
        this.chkUPSY = chkUPSY;
    }

    public String getChkUPSN() {
        return chkUPSN;
    }

    public void setChkUPSN(String chkUPSN) {
        this.chkUPSN = chkUPSN;
    }

    public String getChkUPSPartly() {
        return chkUPSPartly;
    }

    public void setChkUPSPartly(String chkUPSPartly) {
        this.chkUPSPartly = chkUPSPartly;
    }

    public String getChkUPSDontN() {
        return chkUPSDontN;
    }

    public void setChkUPSDontN(String chkUPSDontN) {
        this.chkUPSDontN = chkUPSDontN;
    }

    public String getChkGIUUPS() {
        return chkGIUUPS;
    }

    public void setChkGIUUPS(String chkGIUUPS) {
        this.chkGIUUPS = chkGIUUPS;
    }

    public String getChkGBNUUPS() {
        return chkGBNUUPS;
    }

    public void setChkGBNUUPS(String chkGBNUUPS) {
        this.chkGBNUUPS = chkGBNUUPS;
    }

    public String getChkIU_BNRUPS() {
        return chkIU_BNRUPS;
    }

    public void setChkIU_BNRUPS(String chkIU_BNRUPS) {
        this.chkIU_BNRUPS = chkIU_BNRUPS;
    }

    public String getChkIUNNTRUPS() {
        return chkIUNNTRUPS;
    }

    public void setChkIUNNTRUPS(String chkIUNNTRUPS) {
        this.chkIUNNTRUPS = chkIUNNTRUPS;
    }

    public String getChkOOSBRUPS() {
        return chkOOSBRUPS;
    }

    public void setChkOOSBRUPS(String chkOOSBRUPS) {
        this.chkOOSBRUPS = chkOOSBRUPS;
    }

    public String getChkOOSAndNRUPS() {
        return chkOOSAndNRUPS;
    }

    public void setChkOOSAndNRUPS(String chkOOSAndNRUPS) {
        this.chkOOSAndNRUPS = chkOOSAndNRUPS;
    }

    public String getChkStilInstPhaUPS() {
        return chkStilInstPhaUPS;
    }

    public void setChkStilInstPhaUPS(String chkStilInstPhaUPS) {
        this.chkStilInstPhaUPS = chkStilInstPhaUPS;
    }

    public String getChkDontNUPS() {
        return chkDontNUPS;
    }

    public void setChkDontNUPS(String chkDontNUPS) {
        this.chkDontNUPS = chkDontNUPS;
    }

    public String getTxtCapacityUPS() {
        return txtCapacityUPS;
    }

    public void setTxtCapacityUPS(String txtCapacityUPS) {
        this.txtCapacityUPS = txtCapacityUPS;
    }

    public String getChkPMYUPS() {
        return chkPMYUPS;
    }

    public void setChkPMYUPS(String chkPMYUPS) {
        this.chkPMYUPS = chkPMYUPS;
    }

    public String getChkPMNUPS() {
        return chkPMNUPS;
    }

    public void setChkPMNUPS(String chkPMNUPS) {
        this.chkPMNUPS = chkPMNUPS;
    }

    public String getChkPMITPHFUPS() {
        return chkPMITPHFUPS;
    }

    public void setChkPMITPHFUPS(String chkPMITPHFUPS) {
        this.chkPMITPHFUPS = chkPMITPHFUPS;
    }

    public String getChkPMPDIUPS() {
        return chkPMPDIUPS;
    }

    public void setChkPMPDIUPS(String chkPMPDIUPS) {
        this.chkPMPDIUPS = chkPMPDIUPS;
    }

    public String getChkSubcontractedUPS() {
        return chkSubcontractedUPS;
    }

    public void setChkSubcontractedUPS(String chkSubcontractedUPS) {
        this.chkSubcontractedUPS = chkSubcontractedUPS;
    }

    public String getTxtFreqPMUPS() {
        return txtFreqPMUPS;
    }

    public void setTxtFreqPMUPS(String txtFreqPMUPS) {
        this.txtFreqPMUPS = txtFreqPMUPS;
    }

    public String getTxtNameOfMantUPS() {
        return txtNameOfMantUPS;
    }

    public void setTxtNameOfMantUPS(String txtNameOfMantUPS) {
        this.txtNameOfMantUPS = txtNameOfMantUPS;
    }

    public String getChkPMCMYUPS() {
        return chkPMCMYUPS;
    }

    public void setChkPMCMYUPS(String chkPMCMYUPS) {
        this.chkPMCMYUPS = chkPMCMYUPS;
    }

    public String getChkPMCMNUPS() {
        return chkPMCMNUPS;
    }

    public void setChkPMCMNUPS(String chkPMCMNUPS) {
        this.chkPMCMNUPS = chkPMCMNUPS;
    }

    public String getChkLoBYUPS() {
        return chkLoBYUPS;
    }

    public void setChkLoBYUPS(String chkLoBYUPS) {
        this.chkLoBYUPS = chkLoBYUPS;
    }

    public String getChkLoBNUPS() {
        return chkLoBNUPS;
    }

    public void setChkLoBNUPS(String chkLoBNUPS) {
        this.chkLoBNUPS = chkLoBNUPS;
    }

    public String getTxtComentUPS() {
        return txtComentUPS;
    }

    public void setTxtComentUPS(String txtComentUPS) {
        this.txtComentUPS = txtComentUPS;
    }
}
