public class Main {
    public static void main(String[] args)
    {
        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.*/
        System.out.println("Condicional if!!");
        int NumeroIf = -5;

        if (NumeroIf > 0){
            System.out.println("El Numero es Positivo: " + NumeroIf);
        }else if(NumeroIf < 0){
            System.out.println("El Numero es Negativo: " + NumeroIf);
        }else{
            System.out.println("El Numero es O: "+ NumeroIf);
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3
        System.out.println("Bucle while!!");
        int NumeroWhile = 0;
        while ( NumeroWhile < 3 ){
            System.out.println(NumeroWhile);
            NumeroWhile++;

        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While
        System.out.println("Bucle do while!!");
        int NumeroDoWhile = 0;
        do{
            System.out.println(NumeroDoWhile);
            NumeroDoWhile++;

        }while ( NumeroDoWhile == 0 );



        //Para el bucle For, crea una variable numeroFor,
        System.out.println("Bucle For!!");
        for ( int NumeroFor = 0; NumeroFor <=3;NumeroFor++)
        {
            System.out.println(NumeroFor);

        }


        //Por último, para el Switch, deberás crear la variable estacion
        System.out.println("Switch Case!!");
        var Estacion = "Primavera";

        switch (Estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Default");

        }

    }
}