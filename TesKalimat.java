public class TesKalimat {
    public static String tesTipeInput(String text) {

        String[] arrayTeks = text.trim().split(" ");
        StringBuilder a = new StringBuilder();

        if (arrayTeks.length > 1) {
            for(String kata : arrayTeks) {
                a.append(KumpulanHuruf.proses(kata)).append(" ");
            }
        }else {
            for(String kata : arrayTeks) {
                return KumpulanHuruf.proses(kata);
            }
        }

        return a.toString();
    }

    public static String tesTipeInput2(String text) {

        String[] arrayTeks = text.trim().split(" ");
        StringBuilder a = new StringBuilder();

        if (arrayTeks.length > 1) {
            for(String kata : arrayTeks) {
                a.append(KumpulanHuruf.terjemahkan(kata)).append(" ");
            }
        }else {
            for(String kata : arrayTeks) {
                return KumpulanHuruf.terjemahkan(kata);
            }
        }

        return a.toString();
    }

}