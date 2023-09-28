public class Main {

    static String concatena(int num1,int num2){//f1
        String numeros;
        numeros= num1+" "+num2;

        return numeros;
    }

    static int[] criaArray(int tamanho){//f2
        int[]numeros=new int[tamanho];
        return numeros;
    }

    static int[] preencheArray(int[]array){//f3
        int count=1;
        for (int i = 0; i < array.length; i++) {
            array[i]=count;
            count++;
        }
        return array;
    }

    static String converteParaString(int[]array){//f4 correto
        if (array == null || array.length == 0) {
            return "[]"; // Retorne colchetes vazios se o array estiver vazio ou nulo
        }

        String resultado = "[" + array[0]; // Abra a string com o primeiro número

        for (int i = 1; i < array.length; i++) {
            resultado += ", " + array[i]; // Adicione vírgula, espaço e o número
        }

        resultado += "]"; // Feche a string com o último número

        return resultado;
    }

    static int soma(int[]nu){//f5 correto
        int count=0;
        if (nu!=null){
            for (int i = 0; i < nu.length; i++) {
                count+=nu[i];
            }
            return count;
        }
       return 0;
    }
    static int maior(int[]num){//f6 funciona
        int maior= -2147483648;
        for (int i = 0; i < num.length; i++) {
            if (num[i]> maior){
                maior=num[i];
            }

        }
        return maior;
    }

    static int[] interseccao(int[]n1,int[]n2) {//f10
        int[] intr= new int[n1.length + n2.length];


        return intr;
    }

    static int[] somarVectores(int[]n1,int[]n2){//funciona f7
        int[] soma;
        if (n1.length >= n2.length){
            soma=new int[n1.length];
        }
        else {
            soma=new int[n2.length];
        }
        for (int i = 0; i < soma.length; i++) {
            soma[i]=n1[i]+n2[i];
        }

        return soma ;
    };

    static int[] concatenarArrays(int[]n1,int[]n2){//f8
        return null;
    }
    static int[] intercalarArrays(int[]n1,int[]n2){//f11

        return null;
    }

    static int[] escalarVector(int[]n1,int num){//f9
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] s= somarVectores(new int[]{1, 2, 3, 4},new int[]{4,3,2,1});
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        int m=maior(new int[]{5,4,2,1});
        System.out.println(m);

    }
}