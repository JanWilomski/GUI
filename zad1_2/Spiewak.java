package zad1_2;

public abstract class Spiewak {
    private String nazwisko;
    private int counter = 1;
    private int num;

    Spiewak(String nazwisko){
        this.nazwisko=nazwisko;
        this.num = counter;
        counter++;
    }

    abstract String spiewaj();

    public String toString(){
        return "("+num+") "+nazwisko+": "+spiewaj();
    }
    public static Spiewak najglosniej(Spiewak[] spiewacy){
        Spiewak maxSpiewak = null;
        int max = -1;
        for(Spiewak s:spiewacy){
            String tekst = s.spiewaj();
            int maxCyfra=0;
            int maxLitera=0;
            for(int i = 0;i<tekst.length();i++){
                if(tekst.charAt(i)>='0'&&tekst.charAt(i)<='9'){
                    if(tekst.charAt(i)>maxCyfra)maxCyfra=tekst.charAt(i);
                }else if((tekst.charAt(i)>='a'&&tekst.charAt(i)<='z')/*||(tekst.charAt(i)>='A'&&tekst.charAt(i)<='Z')*/)
                    if(tekst.charAt(i)>maxLitera)maxLitera=tekst.charAt(i);

            }
            if(maxCyfra+maxLitera>max){
                max=maxCyfra+maxLitera;
                maxSpiewak=s;
            }
        }
        return maxSpiewak;

    }
}
