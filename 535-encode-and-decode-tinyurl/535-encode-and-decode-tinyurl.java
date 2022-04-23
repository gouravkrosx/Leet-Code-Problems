public class Codec {

   static final String BASE_HOST = "http://tinyurl.com/";
	static final Map<String, String> shortToLongMap = new HashMap<>();
    static final Map<String, String> longToShortMap = new HashMap<>();
    static int counter = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
	{
        if(longToShortMap.containsKey(longUrl))
            return longToShortMap.get(longUrl);
        
        String shortUrl = BASE_HOST + convertDecimalToBase62(counter++);
        shortToLongMap.put(shortUrl, longUrl);
        longToShortMap.put(longUrl, shortUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl)
	{
        return shortToLongMap.get(shortUrl);
    }
    
    private String convertDecimalToBase62(int n)
    {
        final char[] BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        
		while(n > 0)
		{
            sb.append(BASE62[n % 62]);
            n /= 62;
        }
        return sb.reverse().toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));