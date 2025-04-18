/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;



/**
 *
 * @author sangh
 */
public class TextAnalyzerHelper {

    /**
     * @param args the command line arguments
     */
        private String inputtedText;
        
        private int txtlength;
        private int wordcount;
        private int linecount;
        private int tabcount;
        private int spacecount;
        private String uniquechartxt;

    public TextAnalyzerHelper(String inputtedText) {
        this.inputtedText = inputtedText;
        analyze();
    }

    public int getTxtlength() {
        return txtlength;
    }

    public int getWordcount() {
        return wordcount;
    }

    public int getLinecount() {
        return linecount;
    }

    public int getTabcount() {
        return tabcount;
    }

    public int getSpacecount() {
        return spacecount;
    }

    public String getUniquechartxt() {
        return uniquechartxt;
    }
        
        
        int getCharorWordsCount(String txt){
           
            
            return 0;
        }
        
        /*
          private int txtlength;
        private int wordcount;
        private int linecount;
        private int tabcount;
        private int spacecount;
        private String uniquechartxt;
        
        will make use of inputtedtext
       */
        private void analyze(){
           txtlength =  inputtedText.length();
            linecount =  txtlength>0?inputtedText.split("\n",-1).length:0;
             spacecount =  inputtedText.split(" ",-1).length-1;
              tabcount =  inputtedText.split("\t",-1).length-1; 
              // wordcount =  inputtedText.split("\n",-1).length;
            
        }

    @Override
    public String toString() {
        return "TextAnalyzerHelper{" + "inputtedText=" + inputtedText + ", txtlength=" + txtlength + ", wordcount=" + wordcount + ", linecount=" + linecount + ", tabcount=" + tabcount + ", spacecount=" + spacecount + ", uniquechartxt=" + uniquechartxt + '}';
    }
    
        
   
       
       
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         TextAnalyzerHelper textsample = new TextAnalyzerHelper(" e@cbbc \t \njfdjdgjhg");
         System.out.println(textsample);
         
    

    }
    
}
