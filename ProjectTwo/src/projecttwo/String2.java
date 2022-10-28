
package projecttwo;


public class String2 {
    public static void main(String[] args) {
        String myBio = " i am Md Fahad Uddin ";
        System.out.println(myBio);
        
        String str = myBio.trim();
        System.out.println(str);
        
        String str2 = str.replace('i', 'j');
        System.out.println(str2);
        
       String[] str3 = str.split(" ");
        for(String x:str3){
            System.out.println(x);
        }
        
        char ch;
        ch = myBio.charAt(0);
        System.out.println(ch);
        
        int value;
        value = myBio.codePointAt(3);
        System.out.println("ASCII value : "+value);
        
        int pos;
        pos = myBio.indexOf("am");
        System.out.println(pos);
        
        pos = myBio.lastIndexOf('d');
        System.out.println(pos);
        
    }
    
}
