/**
 *
 */
public class Exponat 
{
    /* Attribute */
    protected int nummer;
    protected String typ;
    protected int alter;
    protected String kuenstler;
    protected String herkunft;
    protected String status;
    /* Methoden */
    /** @return liefert status 
     */
    public String gibStatus(){
        //TODO gegebenenfalls ueberarbeiten
        return this.status;
    }

    /** setzt status 
     */
    public void setzeStatus(String  pStatus){
        //TODO gegebenenfalls ueberarbeiten
        this.status = pStatus;
    }

    /** @return liefert nummer 
     */
    public int gibNummer(){
        //TODO gegebenenfalls ueberarbeiten
        return this.nummer;
    }

    /** @return liefert typ 
     */
    public String gibTyp(){
        //TODO gegebenenfalls ueberarbeiten
        return this.typ;
    }

    /** setzt typ 
     */
    public void setzeTyp(String  pTyp){
        //TODO gegebenenfalls ueberarbeiten
        this.typ = pTyp;
    }

    /** @return liefert alter 
     */
    public int gibAlter(){
        //TODO gegebenenfalls ueberarbeiten
        return this.alter;
    }

    /** setzt alter 
     */
    public void setzeAlter(int  pAlter){
        //TODO gegebenenfalls ueberarbeiten
        this.alter = pAlter;
    }

    /** @return liefert kuenstler 
     */
    public String gibKuenstler(){
        //TODO gegebenenfalls ueberarbeiten
        return this.kuenstler;
    }

    /** setzt kuenstler 
     */
    public void setzeKuenstler(String  pKuenstler){
        //TODO gegebenenfalls ueberarbeiten
        this.kuenstler = pKuenstler;
    }

    /** @return liefert herkunft 
     */
    public String gibHerkunft(){
        //TODO gegebenenfalls ueberarbeiten
        return this.herkunft;
    }

    /** setzt herkunft 
     */
    public void setzeHerkunft(String  pHerkunft){
        //TODO gegebenenfalls ueberarbeiten
        this.herkunft = pHerkunft;
    }

    /** setzt Nummer
     */
    public void setzeNummer(int pNummer){
        this.nummer=pNummer;
    }

}//Ende Klasse: Exponat

