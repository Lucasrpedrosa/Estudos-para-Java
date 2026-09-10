package jv12_PilaresPOO;

public class ComputadorUsuario {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Facebook fb = new Facebook();
        Telegram tl = new Telegram();

        // MSNMessenger
        msn.enviarMensagem();
        msn.receberMensagem();
        // Facebook
        fb.enviarMensagem();
        fb.receberMensagem();
        //Telegram
        tl.enviarMensagem();
        tl.receberMensagem();

    }


}
