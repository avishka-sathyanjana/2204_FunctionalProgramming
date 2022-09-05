object caesar_cipher{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  def encryption (character: Char, key: Int, alphabet: String):Char={
    if(character == ' '){  
            ' ';
    }
    else{
      alphabet((alphabet.indexOf(character.toUpper) + key) % alphabet.size);
    }
  }
  
  def decryption (character: Char, key: Int, alphabet: String):Char={
    if(character == ' '){  
            ' ';
    }
    else{
    alphabet((alphabet.length + (alphabet.indexOf(character.toUpper) - key)) % alphabet.size);
    }
  }

  val cipher=(algo: (Char, Int, String) => Char, string: String, key: Int, alphabet: String) 
    =>string.map(algo(_, key, alphabet));
  
  def main(args: Array[String]): Unit = {

    println(cipher(encryption, "ABC DEFG", 2, alphabet));
    println(cipher(decryption, "CDE FGHI", 2, alphabet));

  }
}