import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println(invertirCifras2(954733));
    }

    //1 Funciones (métodos)

    //Ej1
    //Input: dos enteros
    //Output: la division

    public static int divisionEntera(int dividendo, int divisor) {
        if (divisor == 0) return 0;
        else return dividendo / divisor;
    }

    //Ej2
    //Input: importe e iva
    //Output: importe con iva

    public static double calcularIva(double importe, double porcentajeIva) {
        if (importe < 0) return -1;
        else return importe += importe *= porcentajeIva / 100;

    }

    //Ej3
    //Input: horas semanales y la cuota
    //Output: El salario. En caso de hacer horas extra, se le pagara más
    public static double getSalario(double horasSemanales, double cuota) {
        double horasExtra = 0;
        double cuotaNueva = 0;
        if (horasSemanales > 40) {
            horasExtra = horasSemanales - 40;
            cuotaNueva = cuota * 1.5;
        }
        return ((horasSemanales - horasExtra) * cuota) + horasExtra * cuotaNueva;
    }

    //Ej4
    //Input: un minimo y un maximo
    //Output: un numero aleatorio entre el minimo y el maximo
    public static int getRandomNumber(int minimun, int maximun) {
        if (minimun>maximun) return -1;
        else return new Random().nextInt(maximun-minimun)+minimun;
    }

    //Ej5
    //Input: radio circunferencia
    //Output: area

    public static double getAreaCircunferencia(double radio) {
        if (radio > 0) return Math.PI * Math.pow(radio, 2);
        else return -1;
    }


    //Ej6
    //Input: 3 notas
    //Output: la media

    public static double getMedia(double a, double b, double c) {
        return a + b + c / 3;
    }


    public static String ordenaNumeros(int a, int b, int c) {
        String numerosOrdenados = "";

        if (a>b && b>c) {
            numerosOrdenados=a+" "+b+" "+c+" ";
            return numerosOrdenados;

        }

        if (a>c && c>b) {
            numerosOrdenados=a+" "+c+" "+b+" ";
            return numerosOrdenados;

        }

        if (b>a && a>c) {
            numerosOrdenados=b+" "+a+" "+c+" ";
            return numerosOrdenados;

        }

        if (c>a && b>c) {
            numerosOrdenados=b+" "+c+" "+a+" ";
            return numerosOrdenados;

        }

        if (c>a && a>b) {
            numerosOrdenados=c+" "+a+" "+b+" ";
            return numerosOrdenados;

        }

        if (c>b && b>a) {
            numerosOrdenados=c+" "+b+" "+a+" ";
            return numerosOrdenados;

        }
        return numerosOrdenados;
    }

    public static List<Integer> ordenaNumeros(List<Integer> list) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> auxList = new ArrayList<>(list);
        for (int i = 0; i<list.size(); i++) {
            list1.add(getHigher(auxList));
            removeHigher(auxList);
        }
        return list1;
    }

    public static void removeHigher(List<Integer> list) {
        int indexOfHigher = 0;
        int higher = 0;
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) > higher) {
                indexOfHigher = i;
                higher = list.get(i);
            }
        }
        list.remove(indexOfHigher);
    }
    public static int getHigher(List<Integer> list) {
        int higher = 0;
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) > higher) {
                higher = list.get(i);
            }
        }
        return higher;
    }



    public static int contarCifras(short a) {
        if (a>0 || a<9999) return (a+"").length();
        else return -1;
    }

    public static String invertirCifras(short auxA) {
        //Me interesa guardarlo en String para usar metodos como charAt (que int, short no tienen).
        String a = auxA + "";
        String b = "";
        for (int i = a.length()-1; i>=0; i--) {
            b += a.charAt(i);
        }
        return b;
    }

    public static String invertirCifras2(int auxA) {
        String a = auxA + "";
        String b = "";
        for (int i = a.length()-1; i>=0; i--) {
            b += a.substring(i).charAt(0);
        }
        return b;
    }
}