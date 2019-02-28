package Stringsecond;


public class Part1{
public static String findSimpleGene(String dna)
{
    int start=dna.indexOf("ATG");
    if(start==-1){
    return " ";
    }
    int end=dna.indexOf("TAA",start+3);
    if(end==-1){
    return " ";
    }
    String str=dna.substring(start,end+3);
    if(str.length()%3==0)
    {
    return str;
    }
   
   return " ";
}
public static void testSimpleGene()
{
    String s1="TAAATATAA";
    String s2="ATAATGATAATG";
    String s3="ATATAT";
    String s4="ATAATGATAGAATAA";
    String s5="TAATGTTAA";
      System.out.println(s1+":"+findSimpleGene(s1));
       System.out.println(findSimpleGene("ATAATGATAATG"));
        System.out.println(s2+":"+findSimpleGene(s2));
        System.out.println(s3+":"+findSimpleGene(s3));
        System.out.println(s4+":"+findSimpleGene(s4));
        System.out.println(s5+":"+findSimpleGene(s5));
    
}
     public static void main(String []args){
        System.out.println("Hello World");
         testSimpleGene();
     }
}