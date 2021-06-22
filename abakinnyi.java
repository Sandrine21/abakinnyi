
class PrintAbakinnyi
{
    public static void main(String s[])
    {
       Abakinnyibeza umukinnyi[] = new  Abakinnyibeza[5];
    
        umukinnyi[0] = new  Abakinnyibeza();
        umukinnyi[0].name = "arstide";
        umukinnyi[0].scores = 45;
        umukinnyi[0].team = 'APR';
    
        umukinnyi[1] = new  Abakinnyibeza();
        umukinnyi[1].name = "Caedrick";
        umukinnyi[1].scores = 78;
        umukinnyi[1].team = 'Patriote';
    
        umukinnyi[2] = new  Abakinnyibeza();
        umukinnyi[2].name = "Mazni";
        umukinnyi[2].scores = 83;
        umukinnyi[2].team = 'LEG';
    
        umukinnyi[3] = new  Abakinnyibeza();
        umukinnyi[3].name = "Mugabe";
        umukinnyi[3].scores = 77;
        umukinnyi[3].team = 'Patriote';
    
        umukinnyi[4] = new  Abakinnyibeza();
        umukinnyi[4].name = "J Cole";
        umukinnyi[4].scores = 93;
        umukinnyi[4].team = 'patriote';
    
    
        for(int i = 0; i < umukinnyi.length; i++)
        {
            System.out.println( umukinnyi[i].name + " in team " + umukinnyi[i].team + " got " + umukinnyi[i].scores + " scores." );
        }
    }

}

class  Abakinnyibeza
{
    String name;
    int scores;
    char team;
    
}
