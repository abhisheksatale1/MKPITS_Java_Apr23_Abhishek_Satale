package AskaycodeProgram;

public class AskayCode {
    public void incriptmessage(String Message){

        for (int counter=0;counter<Message.length();counter++){
            int ascii= Message.charAt(counter)+Message.charAt(counter)%10;
            System.out.println("Ascii value of"+" "+Message.charAt(counter)+"+"+5+"="+ascii);
        }
    }

    public void decriptmessage(int AsciiNumber){
        for(int number=0;number< AsciiNumber;number++){

        }
    }

}
