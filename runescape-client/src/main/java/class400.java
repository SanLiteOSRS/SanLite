import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("oa")
public class class400 implements class399 {
	@ObfuscatedName("f")
	JSONObject field4451;

	public class400(byte[] var1) throws UnsupportedEncodingException {
		this.method7132(var1); // L: 17
	} // L: 18

	public class400(String var1) throws UnsupportedEncodingException {
		this.method7133(var1); // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-59"
	)
	public byte[] vmethod7142() throws UnsupportedEncodingException {
		return this.field4451 == null ? new byte[0] : this.field4451.toString().getBytes("UTF-8"); // L: 50 51 53
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1794500299"
	)
	void method7132(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 21
		this.method7133(var2); // L: 22
	} // L: 23

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-6"
	)
	void method7133(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 27
				this.field4451 = new JSONObject(var1); // L: 28
			} else {
				if (var1.charAt(0) != '[') { // L: 30
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 36
				}

				JSONArray var2 = new JSONArray(var1); // L: 31
				this.field4451 = new JSONObject(); // L: 32
				this.field4451.put("arrayValues", var2); // L: 33
			}

		} catch (JSONException var3) { // L: 39
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 40
		}
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-1067211925"
	)
	public JSONObject method7134() {
		return this.field4451; // L: 45
	}
}
