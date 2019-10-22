public class Main {

    public static void main(String[] args) {

        Validator validator=new Validator();

        validator.validate(new Customer());
        //Valide methodu kısıt olarak Ientity interface ini aldı
        //bu yüzden valide methoduna Customer nesnesi koyabildik.

    }
}
