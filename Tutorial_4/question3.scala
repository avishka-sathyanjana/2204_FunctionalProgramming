object question3{

    
    def toUpper(strings: String): String = strings.toUpperCase;
    def toLower(strings: String): String = strings.toLowerCase;

    def formatNames(name : String) (changeCase: String => String) (charPositions: Int* ):String ={
        
        //to conver whole string
        if(charPositions.isEmpty){
            return changeCase(name);
        }

        else{
            
            var i = 0;
            //initialize the output string
            var finalName="";

            // travise one by one
            for( i <- 0 to name.length()-1 ){
                //only change relavant index
                if(charPositions.contains(i)){
                    finalName = finalName + changeCase(name.charAt(i).toString);
                }
                //keep other chars as it is
                else{
                    finalName = finalName + name.charAt(i).toString;
                }
            }

            return finalName;
        }

        
    }

    def main(args: Array[String]): Unit ={

        println(formatNames("Benny") (toUpper) ());
        println(formatNames("Niroshan") (toUpper) (0,1));
        println(formatNames("Saman") (toLower) (0) );
        println(formatNames("Kumara") (toUpper) (0,5)) ;
    }
}