public class phone {

    public static String desense(String phonenum){
        String densephone = "";
        for (int i=0;i<phonenum.length();i++){
            if(i > 2 && i < 6){
                densephone = densephone + "*";
            }else{
                densephone = densephone + phonenum.charAt(i);
            }
        }

        return densephone;

    }

//    public static void main(String[] arg){
//        String myphone = "15659033749";
//        phone p = new phone();
//        myphone = p.desense(myphone);
//        System.out.println(myphone);
//    }

}


