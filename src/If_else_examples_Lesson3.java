public class If_else_examples_Lesson3 {
    public static void main(String[] args) {
        int apples = 10;
        int chebur = 5;
        int gena = apples - chebur;

        if (chebur > gena)
            System.out.println("жадный чебурашка");
        else if (gena > chebur){
            System.out.println("чебурашка молодец");
        }
        else {
            System.out.println("оба молодцы");
        }
        System.out.println("никто не в курсе где что");
    }
}

