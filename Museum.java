/**
 *
 */
public class Museum 
{
    /* Attribute */
    private Exponat[] gesamtkapazitaet=new Exponat [400];
    private int anzahlExponate=0;
    /* Methoden */

    /** @return liefert anzahlExponate 
     */
    public int gibAnzahlExponate(){
        return this.anzahlExponate;
    }

    /** Setze Status des Exponats auf ausgeliehen
     */
    public void ausleihen(int  nummer){
        gesamtkapazitaet[nummer-1].setzeStatus("ausgeliehen");
    }

    /** Setze Status des Exponats auf ausgestellt
     */
    public void ausstellen(int  nummer){
        if(gibAlleAusgestellt()<100){   
            gesamtkapazitaet[nummer-1].setzeStatus("ausgestellt");
        }
    }

    /** Setze Status des Exponats auf gelagert
     */
    public void lagern(int  nummer){
        if(gibAlleGelagert()<300){   
            gesamtkapazitaet[nummer-1].setzeStatus("gelagert");
        }
    }

    /** Fügt ein neues Exponat hinzu 
    @param typ String
    @param alter Integer
    @param kuenstler String
    @param herkunft String
     */
    public void exponatHinzufuegen(String  typ,int  alter,String  kuenstler,String  herkunft){
        if(gibAlleGelagert()<300){
            gesamtkapazitaet[anzahlExponate]=new Exponat();
            gesamtkapazitaet[anzahlExponate].setzeTyp(typ);
            gesamtkapazitaet[anzahlExponate].setzeAlter(alter);
            gesamtkapazitaet[anzahlExponate].setzeKuenstler(kuenstler);
            gesamtkapazitaet[anzahlExponate].setzeHerkunft(herkunft);
            lagern(anzahlExponate+1);
            gesamtkapazitaet[anzahlExponate].setzeNummer(anzahlExponate+1);
            anzahlExponate++;
        }
    }

    /** Gibt die Anzahl aller gelagerten Exponate zurück
     */
    public int gibAlleGelagert(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibStatus()=="gelagert"){
                a++;
            }
        }
        return a;
    }

    /** Gibt die Anzahl aller ausgestellten Exponate zurück
     */
    public int gibAlleAusgestellt(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibStatus()=="ausgestellt"){
                a++;
            }
        }
        return a;
    }

    /** Gibt die Anzahl aller ausgeliehen Exponate zurück
     */
    public int gibAlleAusgeliehen(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibStatus()=="ausgeliehen"){
                a++;
            }
        }
        return a;
    }

    /** Gibt die Anzahl aller Bilder zurück
     * @return a
     */
    public int gibAlleBilder(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibTyp()=="Bild"){
                a++;
            }
        }
        return a;
    }

     /** Gibt die Anzahl aller Artefakte zurück
     * @return a
     */
    public int gibAlleArtefakte(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibTyp()=="Artefakt"){
                a++;
            }
        }
        return a;
    }

     /** Gibt die Anzahl aller Skulpturen zurück
     * @return a
     */
    public int gibAlleSkulpturen(){
        int a=0;
        for(int i=0;i<anzahlExponate;i++){
            if(gesamtkapazitaet[i].gibTyp()=="Skulptur"){
                a++;
            }
        }
        return a;
    }

    /** Gibt ein bestimmtes Exponat zurück
    @param nummer Integer
    @return Exponat
     */
    public Exponat gibExponat(int  nummer){
        return gesamtkapazitaet[nummer-1];
    }

}//Ende Klasse: Museum

