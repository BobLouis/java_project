
public class Encode {
	public static void main(String[] args) {
		String origin = "hello world!";
		//enter several number between 0~7
		int[] key    = {7,3,1,4,6,6};
		char[] origin_ch = origin.toCharArray();
		char encode_ch[] = new char[origin.length()];
		char decode_ch[] = new char[origin.length()];
		int i_key = 0;
		int i = 0;
		for(char e : origin_ch) {
			if(i_key >= key.length) 
				i_key = 0;
			e += key[i_key];
			encode_ch[i] = e;
			++i;
			++i_key;
		}
		System.out.println("origin:"+"\n"+origin+"\nencode:");
		System.out.println(encode_ch);
		i = 0;
		i_key = 0;
		for(char e : encode_ch) {
			if(i_key >= key.length) 
				i_key = 0;
			e -= key[i_key];
			decode_ch[i] = e;
			++i;
			++i_key;
		}
		System.out.println("decode:");
		System.out.println(decode_ch);
	}
}
