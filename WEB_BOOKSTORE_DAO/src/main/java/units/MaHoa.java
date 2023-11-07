package units;

import java.security.MessageDigest;

public class MaHoa {
		// md5
		// sha1 -> thuong duoc su dung
	
	public static String toSHA1(String str) {
		String salt = "q@;sc";
		String res = null;
		str += salt;
		try {
			byte[] dataBytes = str.getBytes("UTF-8");
			MessageDigest  md  = MessageDigest.getInstance("SHA-1");
			res = org.apache.tomcat.util.codec.binary.Base64.encodeBase64String(md.digest(dataBytes));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res.substring(0,19);
	}
	public static void main(String[] args) {
		System.out.println(MaHoa.toSHA1("123456"));
	}
}
