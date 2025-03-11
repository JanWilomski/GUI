package zad2;

public class Main {
    public static void main(String[] args) {
        Spiewak s1 = new Spiewak("Dietrich"){
            @Override
            public String spiewaj(){
                return "oooooooooooooo6oooooooooo";
            }
        };
        Spiewak s2 = new Spiewak("Piaf"){
            @Override
            public String spiewaj(){
                return "a4iBBiii";
            }
        };
        Spiewak s3 = new Spiewak("Adele"){
            @Override
            public String spiewaj(){
                return "aAa";
            }
        };

        Spiewak sp[]={s2,s1,s3};
        for(Spiewak s : sp) System.out.println(s);

        System.out.println("\n"+Spiewak.najglosniej(sp));
    }
}
