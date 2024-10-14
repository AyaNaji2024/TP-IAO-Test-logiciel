public class ValidationAge {
    public boolean peutBoireAlcool(int age, String region) {
        switch (region.toLowerCase()) {
            case "region1":
                return age>=18 ;
            break;
            case "region2":

                return age>=14 ;
            break;


        }
        public boolean peutUtiliserFesseBouk(int age, String region) {
            switch (region.toLowerCase()) {
                case "region1":
                    return age>=13 ;
                break;
                case "region2":

                    return age>=15 ;
                break;
            }
            public boolean peutEtreEluMaire(int age, String region) {
                switch (region.toLowerCase()) {
                    case "region1":
                        return age>=21 ;
                    break;
                    case "region2":

                        return age>=19 ;
                    break;
                }

            }