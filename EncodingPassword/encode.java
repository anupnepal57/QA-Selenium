package seleniumProject;

import org.apache.commons.codec.binary.Base64;

public class encode {

	public static void main(String[] args) {
		String str="test123";
		//-----Encoding-------//
		byte[] encodedString=Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+new String(encodedString));

		//-----Decoding-----//
		byte[] decodedString=Base64.decodeBase64(encodedString);
		System.out.println("decoded string:"+new String(decodedString));
	}

}
