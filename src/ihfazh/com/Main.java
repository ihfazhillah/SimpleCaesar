package ihfazh.com;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String myString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // when encrypt:
        SimpleEncrypt encryptor = new SimpleEncrypt(myString);
        // a = d
        char encrypted = encryptor.encrypt('a');
        System.out.println(encrypted);
        // Z = c
        encrypted = encryptor.encrypt('Z');
        System.out.println(encrypted);
        // 1 = 1
        encrypted = encryptor.encrypt('1');
        System.out.println(encrypted);
        // when decrypt:
        SimpleDecrypt decryptor = new SimpleDecrypt(myString);
        // d = a
        char decrypted = decryptor.decrypt('d');
        System.out.println(decrypted);
        // c = Z
        decrypted = decryptor.decrypt('c');
        System.out.println(decrypted);
        // 1 = 1
        decrypted = decryptor.decrypt('1');
        System.out.println(decrypted);
    }
}
