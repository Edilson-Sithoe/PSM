package projecto.jhpiego.psm.model;

public class Stabilizer {
    private String chkStaY;
    private String chkStaN;

    private String chkLess;
    private String chkB3_10; // Between 3-10
    private String chkB11_20; //Between 11 20
    private String chkMore20; //more than 20

    private String chkSTABY; //Stabilizer Yes
    private String chkSTABN; //Stabilizer No
    private String chkSTABPartly;
    private String chkSTABDontN;

    private String chkGIU; // GIU Good In Use
    private String chkGBNU; //Good but not use
    private String chkIU_BNR; // In Use But Need Repair
    private String chkIUNNTR; //In Use but need to be replaced
    private String chkOOSBR; //Out Od Service But Replaced
    private String chkOOSAndNR; // Out of service and need to be replaced;
    private String chkStilInstPha; // Sttill In the installation phase
    private String chkDontN; //Don't Know

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

    public Stabilizer() {
    }

    public Stabilizer(String chkStaY, String chkStaN, String chkLess, String chkB3_10, String chkB11_20, String chkMore20, String chkSTABY, String chkSTABN, String chkSTABPartly, String chkSTABDontN, String chkGIU, String chkGBNU, String chkIU_BNR, String chkIUNNTR, String chkOOSBR, String chkOOSAndNR, String chkStilInstPha, String chkDontN, String txtCapacity, String chkPMY, String chkPMN, String chkPMITPHF, String chkPMPDI, String chkSubcontracted, String txtFreqPM, String txtNameOfMant, String chkPMCMY, String chkPMCMN, String chkLoBY, String chkLoBN, String txtComent) {
        this.chkStaY = chkStaY;
        this.chkStaN = chkStaN;

        this.chkLess = chkLess;
        this.chkB3_10 = chkB3_10;
        this.chkB11_20 = chkB11_20;
        this.chkMore20 = chkMore20;

        this.chkSTABY = chkSTABY;
        this.chkSTABN = chkSTABN;
        this.chkSTABPartly = chkSTABPartly;
        this.chkSTABDontN = chkSTABDontN;

        this.chkGIU = chkGIU;
        this.chkGBNU = chkGBNU;
        this.chkIU_BNR = chkIU_BNR;
        this.chkIUNNTR = chkIUNNTR;
        this.chkOOSBR = chkOOSBR;
        this.chkOOSAndNR = chkOOSAndNR;
        this.chkStilInstPha = chkStilInstPha;
        this.chkDontN = chkDontN;

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

    public String getChkStaY() {
        return chkStaY;
    }

    public void setChkStaY(String chkStaY) {
        this.chkStaY = chkStaY;
    }

    public String getChkStaN() {
        return chkStaN;
    }

    public void setChkStaN(String chkStaN) {
        this.chkStaN = chkStaN;
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

    public String getChkSTABY() {
        return chkSTABY;
    }

    public void setChkSTABY(String chkSTABY) {
        this.chkSTABY = chkSTABY;
    }

    public String getChkSTABN() {
        return chkSTABN;
    }

    public void setChkSTABN(String chkSTABN) {
        this.chkSTABN = chkSTABN;
    }

    public String getChkSTABPartly() {
        return chkSTABPartly;
    }

    public void setChkSTABPartly(String chkSTABPartly) {
        this.chkSTABPartly = chkSTABPartly;
    }

    public String getChkSTABDontN() {
        return chkSTABDontN;
    }

    public void setChkSTABDontN(String chkSTABDontN) {
        this.chkSTABDontN = chkSTABDontN;
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
