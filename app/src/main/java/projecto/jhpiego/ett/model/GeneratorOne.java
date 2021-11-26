package projecto.jhpiego.ett.model;

public class GeneratorOne {
    private String chkYes;
    private String chkNo;
    private String chkDontKnow;
    private String chkWhoHosp;
    private String chkOpTheatre;
    private String chkEmergRoom;
    private String chkLab;

    private String txtOther;

    private String chkLess;
    private String chkB3_10; // Between 3-10
    private String chkB11_20; //Between 11 20
    private String chkMore20; //more than 20

    private String chkGENY; //GENERATOR Yes
    private String chkGENN; //GENERATOR No
    private String chkGENPartly;
    private String chkGENDontN;

    private String chkGIU; // GIU Good In Use
    private String chkGBNU; //Good but not use
    private String chkIU_BNR; // In Use But Need Repair

    private String chkIUNNTR; //In Use but need to be replaced
    private String chkOOSBR; //Out Od Service But Replaced
    private String chkOOSAndNR; // Out of service and need to be replaced;
    private String chkStilInstPha; // Sttill In the installation phase
    private String chkDontN; //Don't Know
    private String chkY; //Yes
    private String chkN; // No
    private String chkDN; // don't know

    private String chkATSY; //ATS Yes
    private String chkATSN; //ATS No
    private String chkATSPartly;
    private String chkATDontN;
    private String chkFuelY;
    private String chkFuelN;
    private String txtCapacity;

    private String chkPMY; //preeventive maintenance Yes
    private String chkPMN; //preeventive maintenance No
    private String chkPMITPHF; //Internal Technical Personnel of the Health Facility
    private String chkPMPDI; //Personnel from the Department of Infrastructure
    private String chkSubcontracted;
    private String txtFreqPM; //Frequence of PM
    private String txtNameOfMant; //What the name of maintenance
    private String chkPMCMY;
    private String chkPMCMN;
    private String chkLoBY;
    private String chkLoBN;
    private String txtComent;


    public GeneratorOne() {
    }

    public GeneratorOne(String chkYes,String chkNo,  String chkDontKnow, String chkWhoHosp, String chkOpTheatre, String chkEmergRoom, String chkLab, String txtOther, String chkLess, String chkB3_10, String chkB11_20, String chkMore20, String chkGENY, String chkGENN, String chkGENPartly, String chkGENDontN, String chkGIU, String chkGBNU, String chkIU_BNR, String chkIUNNTR, String chkOOSBR, String chkOOSAndNR, String chkStilInstPha, String chkDontN, String chkY, String chkN, String chkDN, String chkATSY, String chkATSN, String chkATSPartly, String chkATDontN, String chkFuelY, String chkFuelN, String txtCapacity, String chkPMY, String chkPMN, String chkPMITPHF, String chkPMPDI, String chkSubcontracted, String txtFreqPM, String txtNameOfMant, String chkPMCMY, String chkPMCMN, String chkLoBY, String chkLoBN, String txtComent) {
        this.chkYes = chkYes;
        this.chkNo = chkNo;
        this.chkDontKnow = chkDontKnow;
        this.chkWhoHosp = chkWhoHosp;
        this.chkOpTheatre = chkOpTheatre;
        this.chkEmergRoom = chkEmergRoom;
        this.chkLab = chkLab;
        this.txtOther = txtOther;
        this.chkLess = chkLess;
        this.chkB3_10 = chkB3_10;
        this.chkB11_20 = chkB11_20;
        this.chkMore20 = chkMore20;
        this.chkGENY = chkGENY;
        this.chkGENN = chkGENN;
        this.chkGENPartly = chkGENPartly;
        this.chkGENDontN = chkGENDontN;
        this.chkGIU = chkGIU;
        this.chkGBNU = chkGBNU;
        this.chkIU_BNR = chkIU_BNR;
        this.chkIUNNTR = chkIUNNTR;
        this.chkOOSBR = chkOOSBR;
        this.chkOOSAndNR = chkOOSAndNR;
        this.chkStilInstPha = chkStilInstPha;
        this.chkDontN = chkDontN;
        this.chkY = chkY;
        this.chkN = chkN;
        this.chkDN = chkDN;
        this.chkATSY = chkATSY;
        this.chkATSN = chkATSN;
        this.chkATSPartly = chkATSPartly;
        this.chkATDontN = chkATDontN;
        this.chkFuelY = chkFuelY;
        this.chkFuelN = chkFuelN;
        this.txtCapacity = txtCapacity;
        this.chkPMY = chkPMY;
        this.chkPMN = chkPMN;
        this.chkPMITPHF = chkPMITPHF;
        this.chkPMPDI = chkPMPDI;
        this.chkSubcontracted = chkSubcontracted;
        this.txtFreqPM = txtFreqPM;
        this.txtNameOfMant = txtNameOfMant;
        this.chkPMCMY = chkPMCMY;
        this.chkPMCMN = chkPMCMN;
        this.chkLoBY = chkLoBY;
        this.chkLoBN = chkLoBN;
        this.txtComent = txtComent;
    }

    public String getChkNo() {
        return chkNo;
    }

    public void setChkNo(String chkNo) {
        this.chkNo = chkNo;
    }

    public String getChkYes() {
        return chkYes;
    }

    public void setChkYes(String chkYes) {
        this.chkYes = chkYes;
    }

    public String getChkDontKnow() {
        return chkDontKnow;
    }

    public void setChkDontKnow(String chkDontKnow) {
        this.chkDontKnow = chkDontKnow;
    }

    public String getChkWhoHosp() {
        return chkWhoHosp;
    }

    public void setChkWhoHosp(String chkWhoHosp) {
        this.chkWhoHosp = chkWhoHosp;
    }

    public String getChkOpTheatre() {
        return chkOpTheatre;
    }

    public void setChkOpTheatre(String chkOpTheatre) {
        this.chkOpTheatre = chkOpTheatre;
    }

    public String getChkEmergRoom() {
        return chkEmergRoom;
    }

    public void setChkEmergRoom(String chkEmergRoom) {
        this.chkEmergRoom = chkEmergRoom;
    }

    public String getChkLab() {
        return chkLab;
    }

    public void setChkLab(String chkLab) {
        this.chkLab = chkLab;
    }

    public String getTxtOther() {
        return txtOther;
    }

    public void setTxtOther(String txtOther) {
        this.txtOther = txtOther;
    }

    public String getChkLess() {
        return chkLess;
    }

    public void setChkLess(String chkLess) {
        this.chkLess = chkLess;
    }

    public String getChkB3_10() {
        return chkB3_10;
    }

    public void setChkB3_10(String chkB3_10) {
        this.chkB3_10 = chkB3_10;
    }

    public String getChkB11_20() {
        return chkB11_20;
    }

    public void setChkB11_20(String chkB11_20) {
        this.chkB11_20 = chkB11_20;
    }

    public String getChkMore20() {
        return chkMore20;
    }

    public void setChkMore20(String chkMore20) {
        this.chkMore20 = chkMore20;
    }

    public String getChkGENY() {
        return chkGENY;
    }

    public void setChkGENY(String chkGENY) {
        this.chkGENY = chkGENY;
    }

    public String getChkGENN() {
        return chkGENN;
    }

    public void setChkGENN(String chkGENN) {
        this.chkGENN = chkGENN;
    }

    public String getChkGENPartly() {
        return chkGENPartly;
    }

    public void setChkGENPartly(String chkGENPartly) {
        this.chkGENPartly = chkGENPartly;
    }

    public String getChkGENDontN() {
        return chkGENDontN;
    }

    public void setChkGENDontN(String chkGENDontN) {
        this.chkGENDontN = chkGENDontN;
    }

    public String getChkGIU() {
        return chkGIU;
    }

    public void setChkGIU(String chkGIU) {
        this.chkGIU = chkGIU;
    }

    public String getChkGBNU() {
        return chkGBNU;
    }

    public void setChkGBNU(String chkGBNU) {
        this.chkGBNU = chkGBNU;
    }

    public String getChkIU_BNR() {
        return chkIU_BNR;
    }

    public void setChkIU_BNR(String chkIU_BNR) {
        this.chkIU_BNR = chkIU_BNR;
    }

    public String getChkIUNNTR() {
        return chkIUNNTR;
    }

    public void setChkIUNNTR(String chkIUNNTR) {
        this.chkIUNNTR = chkIUNNTR;
    }

    public String getChkOOSBR() {
        return chkOOSBR;
    }

    public void setChkOOSBR(String chkOOSBR) {
        this.chkOOSBR = chkOOSBR;
    }

    public String getChkOOSAndNR() {
        return chkOOSAndNR;
    }

    public void setChkOOSAndNR(String chkOOSAndNR) {
        this.chkOOSAndNR = chkOOSAndNR;
    }

    public String getChkStilInstPha() {
        return chkStilInstPha;
    }

    public void setChkStilInstPha(String chkStilInstPha) {
        this.chkStilInstPha = chkStilInstPha;
    }

    public String getChkDontN() {
        return chkDontN;
    }

    public void setChkDontN(String chkDontN) {
        this.chkDontN = chkDontN;
    }

    public String getChkY() {
        return chkY;
    }

    public void setChkY(String chkY) {
        this.chkY = chkY;
    }

    public String getChkN() {
        return chkN;
    }

    public void setChkN(String chkN) {
        this.chkN = chkN;
    }

    public String getChkDN() {
        return chkDN;
    }

    public void setChkDN(String chkDN) {
        this.chkDN = chkDN;
    }

    public String getChkATSY() {
        return chkATSY;
    }

    public void setChkATSY(String chkATSY) {
        this.chkATSY = chkATSY;
    }

    public String getChkATSN() {
        return chkATSN;
    }

    public void setChkATSN(String chkATSN) {
        this.chkATSN = chkATSN;
    }

    public String getChkATSPartly() {
        return chkATSPartly;
    }

    public void setChkATSPartly(String chkATSPartly) {
        this.chkATSPartly = chkATSPartly;
    }

    public String getChkATDontN() {
        return chkATDontN;
    }

    public void setChkATDontN(String chkATDontN) {
        this.chkATDontN = chkATDontN;
    }

    public String getChkFuelY() {
        return chkFuelY;
    }

    public void setChkFuelY(String chkFuelY) {
        this.chkFuelY = chkFuelY;
    }

    public String getChkFuelN() {
        return chkFuelN;
    }

    public void setChkFuelN(String chkFuelN) {
        this.chkFuelN = chkFuelN;
    }

    public String getTxtCapacity() {
        return txtCapacity;
    }

    public void setTxtCapacity(String txtCapacity) {
        this.txtCapacity = txtCapacity;
    }

    public String getChkPMY() {
        return chkPMY;
    }

    public void setChkPMY(String chkPMY) {
        this.chkPMY = chkPMY;
    }

    public String getChkPMN() {
        return chkPMN;
    }

    public void setChkPMN(String chkPMN) {
        this.chkPMN = chkPMN;
    }

    public String getChkPMITPHF() {
        return chkPMITPHF;
    }

    public void setChkPMITPHF(String chkPMITPHF) {
        this.chkPMITPHF = chkPMITPHF;
    }

    public String getChkPMPDI() {
        return chkPMPDI;
    }

    public void setChkPMPDI(String chkPMPDI) {
        this.chkPMPDI = chkPMPDI;
    }

    public String getChkSubcontracted() {
        return chkSubcontracted;
    }

    public void setChkSubcontracted(String chkSubcontracted) {
        this.chkSubcontracted = chkSubcontracted;
    }

    public String getTxtFreqPM() {
        return txtFreqPM;
    }

    public void setTxtFreqPM(String txtFreqPM) {
        this.txtFreqPM = txtFreqPM;
    }

    public String getTxtNameOfMant() {
        return txtNameOfMant;
    }

    public void setTxtNameOfMant(String txtNameOfMant) {
        this.txtNameOfMant = txtNameOfMant;
    }

    public String getChkPMCMY() {
        return chkPMCMY;
    }

    public void setChkPMCMY(String chkPMCMY) {
        this.chkPMCMY = chkPMCMY;
    }

    public String getChkPMCMN() {
        return chkPMCMN;
    }

    public void setChkPMCMN(String chkPMCMN) {
        this.chkPMCMN = chkPMCMN;
    }

    public String getChkLoBY() {
        return chkLoBY;
    }

    public void setChkLoBY(String chkLoBY) {
        this.chkLoBY = chkLoBY;
    }

    public String getChkLoBN() {
        return chkLoBN;
    }

    public void setChkLoBN(String chkLoBN) {
        this.chkLoBN = chkLoBN;
    }

    public String getTxtComent() {
        return txtComent;
    }

    public void setTxtComent(String txtComent) {
        this.txtComent = txtComent;
    }
}