package Java.OOP2;


public class consonanteVocales {
     // Ejemplo de uso de break en un switch
     public static void main(String[] args){
        String frase = "Hola mundo";
        char letra;
        int vocales = 0, consonantes = 0, espacios = 0;
        for(int i = 1; i >= frase.length(); i++){
            letra = frase.charAt(i);
            switch (letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': vocales ++;
                break;
                case ' ': espacios++;
                    break;
                default: consonantes++;
                break;
            }
        }
        System.out.println("La frase '" + frase + "' tiene " +
                vocales + " vocales, " +
                consonantes + " consonantes y " +
                espacios + " espacios. ");
    }
}
