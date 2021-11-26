package projecto.jhpiego.ett.model;

public class SolarEnergy {
    private String chkYSE;
    private String chkNSE;
    private String chkDNSE;

    private String chkWhoHospSE;
    private String chkOpTheatreSE;
    private String chkEmergRoomSE;
    private String chkLabSE;
    private String chkMaterSE;

    private String txtOtherSE;

    private String chkLessSE;
    private String chkB3_10SE; // Between 3-10
    private String chkB11_20SE; //Between 11 20
    private String chkMore20SE; //more than 20

    private String chkSEY; //SE Yes
    private String chkSEN; //SE No
    private String chkSEPartly;
    private String chkSEDontN;

    private String chkGIUSE; // GIU Good In Use
    private String chkGBNUSE; //Good but not use
    private String chkIU_BNRSE; // In Use But Need Repair
    private String chkIUNNTRSE; //In Use but need to be replaced
    private String chkOOSBRSE; //Out Od Service But Replaced
    private String chkOOSAndNRSE; // Out of service and need to be replaced;
    private String chkStilInstPhaSE; // Sttill In the installation phase
    private String chkDontNSE;

    private String txtCapacitySE;

    private String chkBISSSEY; //batteries installed sufficient to supply  Yes
    private String chkBISSSEN; //batteries installed sufficient to supply  No
    private String chkBISSSEDN;

    private String chkPMSEY;
    private String chkPMSEN;

    private String chkPMITPHFSE; //Internal Technical Personnel of the Health Facility
    private String chkPMPDISE; //Personnel from the Department of Infrastructure
    private String chkSubcontractedSE;

    private String txtFreqPMSE; //Frequence of PM
    private String txtNameOfMantSE; //What the name of maintenance

    private String chkPMCMYSE;
    private String chkPMCMNSE;

    private String chkLoBYSE;
    private String chkLoBNSE;

    private String txtComentSE;

    public SolarEnergy() {
    }

    public SolarEnergy(String chkYSE, String chkNSE, String chkDNSE, String chkWhoHospSE, String chkOpTheatreSE, String chkEmergRoomSE, String chkLabSE, String chkMaterSE, String txtOtherSE, String chkLessSE, String chkB3_10SE, String chkB11_20SE, String chkMore20SE, String chkSEY, String chkSEN, String chkSEPartly, String chkSEDontN, String chkGIUSE, String chkGBNUSE, String chkIU_BNRSE, String chkIUNNTRSE, String chkOOSBRSE, String chkOOSAndNRSE, String chkStilInstPhaSE, String chkDontNSE, String txtCapacitySE, String chkBISSSEY, String chkBISSSEN, String chkBISSSEDN, String chkPMSEY, String chkPMSEN, String chkPMITPHFSE, String chkPMPDISE, String chkSubcontractedSE, String txtFreqPMSE, String txtNameOfMantSE, String chkPMCMYSE, String chkPMCMNSE, String chkLoBYSE, String chkLoBNSE, String txtComentSE) {
        this.chkYSE = chkYSE;
        this.chkNSE = chkNSE;
        this.chkDNSE = chkDNSE;
        this.chkWhoHospSE = chkWhoHospSE;
        this.chkOpTheatreSE = chkOpTheatreSE;
        this.chkEmergRoomSE = chkEmergRoomSE;
        this.chkLabSE = chkLabSE;
        this.chkMaterSE = chkMaterSE;
        this.txtOtherSE = txtOtherSE;
        this.chkLessSE = chkLessSE;
        this.chkB3_10SE = chkB3_10SE;
        this.chkB11_20SE = chkB11_20SE;
        this.chkMore20SE = chkMore20SE;
        this.chkSEY = chkSEY;
        this.chkSEN = chkSEN;
        this.chkSEPartly = chkSEPartly;
        this.chkSEDontN = chkSEDontN;
        this.chkGIUSE = chkGIUSE;
        this.chkGBNUSE = chkGBNUSE;
        this.chkIU_BNRSE = chkIU_BNRSE;
        this.chkIUNNTRSE = chkIUNNTRSE;
        this.chkOOSBRSE = chkOOSBRSE;
        this.chkOOSAndNRSE = chkOOSAndNRSE;
        this.chkStilInstPhaSE = chkStilInstPhaSE;
        this.chkDontNSE = chkDontNSE;
        this.txtCapacitySE = txtCapacitySE;
        this.chkBISSSEY = chkBISSSEY;
        this.chkBISSSEN = chkBISSSEN;
        this.chkBISSSEDN = chkBISSSEDN;
        this.chkPMSEY = chkPMSEY;
        this.chkPMSEN = chkPMSEN;
        this.chkPMITPHFSE = chkPMITPHFSE;
        this.chkPMPDISE = chkPMPDISE;
        this.chkSubcontractedSE = chkSubcontractedSE;
        this.txtFreqPMSE = txtFreqPMSE;
        this.txtNameOfMantSE = txtNameOfMantSE;
        this.chkPMCMYSE = chkPMCMYSE;
        this.chkPMCMNSE = chkPMCMNSE;
        this.chkLoBYSE = chkLoBYSE;
        this.chkLoBNSE = chkLoBNSE;
        this.txtComentSE = txtComentSE;
    }

    public String getChkYSE() {
        return chkYSE;
    }

    public void setChkYSE(String chkYSE) {
        this.chkYSE = chkYSE;
    }

    public String getChkNSE() {
        return chkNSE;
    }

    public void setChkNSE(String chkNSE) {
        this.chkNSE = chkNSE;
    }

    public String getChkDNSE() {
        return chkDNSE;
    }

    public void setChkDNSE(String chkDNSE) {
        this.chkDNSE = chkDNSE;
    }

    public String getChkWhoHospSE() {
        return chkWhoHospSE;
    }

    public void setChkWhoHospSE(String chkWhoHospSE) {
        this.chkWhoHospSE = chkWhoHospSE;
    }

    public String getChkOpTheatreSE() {
        return chkOpTheatreSE;
    }

    public void setChkOpTheatreSE(String chkOpTheatreSE) {
        this.chkOpTheatreSE = chkOpTheatreSE;
    }

    public String getChkEmergRoomSE() {
        return chkEmergRoomSE;
    }

    public void setChkEmergRoomSE(String chkEmergRoomSE) {
        this.chkEmergRoomSE = chkEmergRoomSE;
    }

    public String getChkLabSE() {
        return chkLabSE;
    }

    public void setChkLabSE(String chkLabSE) {
        this.chkLabSE = chkLabSE;
    }

    public String getChkMaterSE() {
        return chkMaterSE;
    }

    public void setChkMaterSE(String chkMaterSE) {
        this.chkMaterSE = chkMaterSE;
    }

    public String getTxtOtherSE() {
        return txtOtherSE;
    }

    public void setTxtOtherSE(String txtOtherSE) {
        this.txtOtherSE = txtOtherSE;
    }

    public String getChkLessSE() {
        return chkLessSE;
    }

    public void setChkLessSE(String chkLessSE) {
        this.chkLessSE = chkLessSE;
    }

    public String getChkB3_10SE() {
        return chkB3_10SE;
    }

    public void setChkB3_10SE(String chkB3_10SE) {
        this.chkB3_10SE = chkB3_10SE;
    }

    public String getChkB11_20SE() {
        return chkB11_20SE;
    }

    public void setChkB11_20SE(String chkB11_20SE) {
        this.chkB11_20SE = chkB11_20SE;
    }

    public String getChkMore20SE() {
        return chkMore20SE;
    }

    public void setChkMore20SE(String chkMore20SE) {
        this.chkMore20SE = chkMore20SE;
    }

    public String getChkSEY() {
        return chkSEY;
    }

    public void setChkSEY(String chkSEY) {
        this.chkSEY = chkSEY;
    }

    public String getChkSEN() {
        return chkSEN;
    }

    public void setChkSEN(String chkSEN) {
        this.chkSEN = chkSEN;
    }

    public String getChkSEPartly() {
        return chkSEPartly;
    }

    public void setChkSEPartly(String chkSEPartly) {
        this.chkSEPartly = chkSEPartly;
    }

    public String getChkSEDontN() {
        return chkSEDontN;
    }

    public void setChkSEDontN(String chkSEDontN) {
        this.chkSEDontN = chkSEDontN;
    }

    public String getChkGIUSE() {
        return chkGIUSE;
    }

    public void setChkGIUSE(String chkGIUSE) {
        this.chkGIUSE = chkGIUSE;
    }

    public String getChkGBNUSE() {
        return chkGBNUSE;
    }

    public void setChkGBNUSE(String chkGBNUSE) {
        this.chkGBNUSE = chkGBNUSE;
    }

    public String getChkIU_BNRSE() {
        return chkIU_BNRSE;
    }

    public void setChkIU_BNRSE(String chkIU_BNRSE) {
        this.chkIU_BNRSE = chkIU_BNRSE;
    }

    public String getChkIUNNTRSE() {
        return chkIUNNTRSE;
    }

    public void setChkIUNNTRSE(String chkIUNNTRSE) {
        this.chkIUNNTRSE = chkIUNNTRSE;
    }

    public String getChkOOSBRSE() {
        return chkOOSBRSE;
    }

    public void setChkOOSBRSE(String chkOOSBRSE) {
        this.chkOOSBRSE = chkOOSBRSE;
    }

    public String getChkOOSAndNRSE() {
        return chkOOSAndNRSE;
    }

    public void setChkOOSAndNRSE(String chkOOSAndNRSE) {
        this.chkOOSAndNRSE = chkOOSAndNRSE;
    }

    public String getChkStilInstPhaSE() {
        return chkStilInstPhaSE;
    }

    public void setChkStilInstPhaSE(String chkStilInstPhaSE) {
        this.chkStilInstPhaSE = chkStilInstPhaSE;
    }

    public String getChkDontNSE() {
        return chkDontNSE;
    }

    public void setChkDontNSE(String chkDontNSE) {
        this.chkDontNSE = chkDontNSE;
    }

    public String getTxtCapacitySE() {
        return txtCapacitySE;
    }

    public void setTxtCapacitySE(String txtCapacitySE) {
        this.txtCapacitySE = txtCapacitySE;
    }

    public String getChkBISSSEY() {
        return chkBISSSEY;
    }

    public void setChkBISSSEY(String chkBISSSEY) {
        this.chkBISSSEY = chkBISSSEY;
    }

    public String getChkBISSSEN() {
        return chkBISSSEN;
    }

    public void setChkBISSSEN(String chkBISSSEN) {
        this.chkBISSSEN = chkBISSSEN;
    }

    public String getChkBISSSEDN() {
        return chkBISSSEDN;
    }

    public void setChkBISSSEDN(String chkBISSSEDN) {
        this.chkBISSSEDN = chkBISSSEDN;
    }

    public String getChkPMSEY() {
        return chkPMSEY;
    }

    public void setChkPMSEY(String chkPMSEY) {
        this.chkPMSEY = chkPMSEY;
    }

    public String getChkPMSEN() {
        return chkPMSEN;
    }

    public void setChkPMSEN(String chkPMSEN) {
        this.chkPMSEN = chkPMSEN;
    }

    public String getChkPMITPHFSE() {
        return chkPMITPHFSE;
    }

    public void setChkPMITPHFSE(String chkPMITPHFSE) {
        this.chkPMITPHFSE = chkPMITPHFSE;
    }

    public String getChkPMPDISE() {
        return chkPMPDISE;
    }

    public void setChkPMPDISE(String chkPMPDISE) {
        this.chkPMPDISE = chkPMPDISE;
    }

    public String getChkSubcontractedSE() {
        return chkSubcontractedSE;
    }

    public void setChkSubcontractedSE(String chkSubcontractedSE) {
        this.chkSubcontractedSE = chkSubcontractedSE;
    }

    public String getTxtFreqPMSE() {
        return txtFreqPMSE;
    }

    public void setTxtFreqPMSE(String txtFreqPMSE) {
        this.txtFreqPMSE = txtFreqPMSE;
    }

    public String getTxtNameOfMantSE() {
        return txtNameOfMantSE;
    }

    public void setTxtNameOfMantSE(String txtNameOfMantSE) {
        this.txtNameOfMantSE = txtNameOfMantSE;
    }

    public String getChkPMCMYSE() {
        return chkPMCMYSE;
    }

    public void setChkPMCMYSE(String chkPMCMYSE) {
        this.chkPMCMYSE = chkPMCMYSE;
    }

    public String getChkPMCMNSE() {
        return chkPMCMNSE;
    }

    public void setChkPMCMNSE(String chkPMCMNSE) {
        this.chkPMCMNSE = chkPMCMNSE;
    }

    public String getChkLoBYSE() {
        return chkLoBYSE;
    }

    public void setChkLoBYSE(String chkLoBYSE) {
        this.chkLoBYSE = chkLoBYSE;
    }

    public String getChkLoBNSE() {
        return chkLoBNSE;
    }

    public void setChkLoBNSE(String chkLoBNSE) {
        this.chkLoBNSE = chkLoBNSE;
    }

    public String getTxtComentSE() {
        return txtComentSE;
    }

    public void setTxtComentSE(String txtComentSE) {
        this.txtComentSE = txtComentSE;
    }
}
