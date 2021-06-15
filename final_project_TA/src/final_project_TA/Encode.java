package final_project_TA;

public class Encode {
	
	//enter several number between 0~7
	int[] key    = {7,3,1,4,6,6};
	
	public String encode(String origin) {
		char[] origin_ch = origin.toCharArray();
		char encode_ch[] = new char[origin.length()];
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
//		System.out.println("origin:"+"\n"+origin+"\nencode:");
//		System.out.println(String.valueOf(encode_ch));
		return String.valueOf(encode_ch);
	}
	
	public String decode(String encode) {
		char[] encode_ch = encode.toCharArray();
		char decode_ch[] = new char[encode.length()];
		int i = 0;
		int i_key = 0;
		for(char e : encode_ch) {
			if(i_key >= key.length) 
				i_key = 0;
			e -= key[i_key];
			decode_ch[i] = e;
			++i;
			++i_key;
		}
//		System.out.println("decode:");
//		System.out.println(String.valueOf(decode_ch));
		return String.valueOf(decode_ch);
	}
}
