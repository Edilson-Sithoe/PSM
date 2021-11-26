package projecto.jhpiego.ett.model;

public class MedGasSistema {
    private String txtConsumOxig;

    private String chkFactory;
    private String chkLiquidTank;
    private String chkManifold;
    private String chkConcentrators;
    private String chkCylinders;
    private String chkNA; //N/A Not Applicable

    private String chkFactoryPS; //PS Primary Supply
    private String chkLiquidTankPS;
    private String chkManifoldPS;
    private String chkConcentratorsPS;
    private String chkCylindersPS;
    private String chkNAPS; //N/A Not Applicable

    private String chkFactorySS; //SS Secondary Supply
    private String chkLiquidTankSS;
    private String chkManifoldSS;
    private String chkConcentratorsSS;
    private String chkCylindersSS;
    private String chkNASS; //N/A Not Applicable

    private String chkFactoryES; //SS Secondary Supply
    private String chkLiquidTankES;
    private String chkManifoldES;
    private String chkConcentratorsES;
    private String chkCylindersES;
    private String chkNAES; //N/A Not Applicable

    private String txtComment;

    public MedGasSistema() {
    }

    public MedGasSistema(String txtConsumOxig, String chkFactory, String chkLiquidTank, String chkManifold, String chkConcentrators, String chkCylinders, String chkNA, String chkFactoryPS, String chkLiquidTankPS, String chkManifoldPS, String chkConcentratorsPS, String chkCylindersPS, String chkNAPS, String chkFactorySS, String chkLiquidTankSS, String chkManifoldSS, String chkConcentratorsSS, String chkCylindersSS, String chkNASS, String chkFactoryES, String chkLiquidTankES, String chkManifoldES, String chkConcentratorsES, String chkCylindersES, String chkNAES, String txtComment) {
        this.txtConsumOxig = txtConsumOxig;
        this.chkFactory = chkFactory;
        this.chkLiquidTank = chkLiquidTank;
        this.chkManifold = chkManifold;
        this.chkConcentrators = chkConcentrators;
        this.chkCylinders = chkCylinders;
        this.chkNA = chkNA;
        this.chkFactoryPS = chkFactoryPS;
        this.chkLiquidTankPS = chkLiquidTankPS;
        this.chkManifoldPS = chkManifoldPS;
        this.chkConcentratorsPS = chkConcentratorsPS;
        this.chkCylindersPS = chkCylindersPS;
        this.chkNAPS = chkNAPS;
        this.chkFactorySS = chkFactorySS;
        this.chkLiquidTankSS = chkLiquidTankSS;
        this.chkManifoldSS = chkManifoldSS;
        this.chkConcentratorsSS = chkConcentratorsSS;
        this.chkCylindersSS = chkCylindersSS;
        this.chkNASS = chkNASS;
        this.chkFactoryES = chkFactoryES;
        this.chkLiquidTankES = chkLiquidTankES;
        this.chkManifoldES = chkManifoldES;
        this.chkConcentratorsES = chkConcentratorsES;
        this.chkCylindersES = chkCylindersES;
        this.chkNAES = chkNAES;
        this.txtComment = txtComment;
    }

    public String getTxtConsumOxig() {
        return txtConsumOxig;
    }

    public void setTxtConsumOxig(String txtConsumOxig) {
        this.txtConsumOxig = txtConsumOxig;
    }

    public String getChkFactory() {
        return chkFactory;
    }

    public void setChkFactory(String chkFactory) {
        this.chkFactory = chkFactory;
    }

    public String getChkLiquidTank() {
        return chkLiquidTank;
    }

    public void setChkLiquidTank(String chkLiquidTank) {
        this.chkLiquidTank = chkLiquidTank;
    }

    public String getChkManifold() {
        return chkManifold;
    }

    public void setChkManifold(String chkManifold) {
        this.chkManifold = chkManifold;
    }

    public String getChkConcentrators() {
        return chkConcentrators;
    }

    public void setChkConcentrators(String chkConcentrators) {
        this.chkConcentrators = chkConcentrators;
    }

    public String getChkCylinders() {
        return chkCylinders;
    }

    public void setChkCylinders(String chkCylinders) {
        this.chkCylinders = chkCylinders;
    }

    public String getChkNA() {
        return chkNA;
    }

    public void setChkNA(String chkNA) {
        this.chkNA = chkNA;
    }

    public String getChkFactoryPS() {
        return chkFactoryPS;
    }

    public void setChkFactoryPS(String chkFactoryPS) {
        this.chkFactoryPS = chkFactoryPS;
    }

    public String getChkLiquidTankPS() {
        return chkLiquidTankPS;
    }

    public void setChkLiquidTankPS(String chkLiquidTankPS) {
        this.chkLiquidTankPS = chkLiquidTankPS;
    }

    public String getChkManifoldPS() {
        return chkManifoldPS;
    }

    public void setChkManifoldPS(String chkManifoldPS) {
        this.chkManifoldPS = chkManifoldPS;
    }

    public String getChkConcentratorsPS() {
        return chkConcentratorsPS;
    }

    public void setChkConcentratorsPS(String chkConcentratorsPS) {
        this.chkConcentratorsPS = chkConcentratorsPS;
    }

    public String getChkCylindersPS() {
        return chkCylindersPS;
    }

    public void setChkCylindersPS(String chkCylindersPS) {
        this.chkCylindersPS = chkCylindersPS;
    }

    public String getChkNAPS() {
        return chkNAPS;
    }

    public void setChkNAPS(String chkNAPS) {
        this.chkNAPS = chkNAPS;
    }

    public String getChkFactorySS() {
        return chkFactorySS;
    }

    public void setChkFactorySS(String chkFactorySS) {
        this.chkFactorySS = chkFactorySS;
    }

    public String getChkLiquidTankSS() {
        return chkLiquidTankSS;
    }

    public void setChkLiquidTankSS(String chkLiquidTankSS) {
        this.chkLiquidTankSS = chkLiquidTankSS;
    }

    public String getChkManifoldSS() {
        return chkManifoldSS;
    }

    public void setChkManifoldSS(String chkManifoldSS) {
        this.chkManifoldSS = chkManifoldSS;
    }

    public String getChkConcentratorsSS() {
        return chkConcentratorsSS;
    }

    public void setChkConcentratorsSS(String chkConcentratorsSS) {
        this.chkConcentratorsSS = chkConcentratorsSS;
    }

    public String getChkCylindersSS() {
        return chkCylindersSS;
    }

    public void setChkCylindersSS(String chkCylindersSS) {
        this.chkCylindersSS = chkCylindersSS;
    }

    public String getChkNASS() {
        return chkNASS;
    }

    public void setChkNASS(String chkNASS) {
        this.chkNASS = chkNASS;
    }

    public String getChkFactoryES() {
        return chkFactoryES;
    }

    public void setChkFactoryES(String chkFactoryES) {
        this.chkFactoryES = chkFactoryES;
    }

    public String getChkLiquidTankES() {
        return chkLiquidTankES;
    }

    public void setChkLiquidTankES(String chkLiquidTankES) {
        this.chkLiquidTankES = chkLiquidTankES;
    }

    public String getChkManifoldES() {
        return chkManifoldES;
    }

    public void setChkManifoldES(String chkManifoldES) {
        this.chkManifoldES = chkManifoldES;
    }

    public String getChkConcentratorsES() {
        return chkConcentratorsES;
    }

    public void setChkConcentratorsES(String chkConcentratorsES) {
        this.chkConcentratorsES = chkConcentratorsES;
    }

    public String getChkCylindersES() {
        return chkCylindersES;
    }

    public void setChkCylindersES(String chkCylindersES) {
        this.chkCylindersES = chkCylindersES;
    }

    public String getChkNAES() {
        return chkNAES;
    }

    public void setChkNAES(String chkNAES) {
        this.chkNAES = chkNAES;
    }

    public String getTxtComment() {
        return txtComment;
    }

    public void setTxtComment(String txtComment) {
        this.txtComment = txtComment;
    }
}
