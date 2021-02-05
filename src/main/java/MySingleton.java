public class MySingleton{
	
   private static MySingleton refrence;

   private MySingleton () {
   }

   private static getInstance() {

     if (refrence == null){
       synchronize(MySingleton.class){
         if(refrence ==null ) {
           refrence = new MySingleton();
         }
       }
     }
     return refrence;   
   }

}
