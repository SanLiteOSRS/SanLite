import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("pi")
public class class419 implements class418 {
	@ObfuscatedName("c")
	JSONObject field4604;

	public class419(byte[] var1) throws UnsupportedEncodingException {
		this.method7785(var1); // L: 17
	} // L: 18

	public class419(String var1) throws UnsupportedEncodingException {
		this.method7794(var1); // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-39"
	)
	public byte[] vmethod7797() throws UnsupportedEncodingException {
		return this.field4604 == null ? new byte[0] : this.field4604.toString().getBytes("UTF-8"); // L: 50 51 53
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "520204581"
	)
	void method7785(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 21
		this.method7794(var2); // L: 22
	} // L: 23

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1808858081"
	)
	void method7794(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 27
				this.field4604 = new JSONObject(var1); // L: 28
			} else {
				if (var1.charAt(0) != '[') { // L: 30
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 36
				}

				JSONArray var2 = new JSONArray(var1); // L: 31
				this.field4604 = new JSONObject(); // L: 32
				this.field4604.put("arrayValues", var2); // L: 33
			}

		} catch (JSONException var3) { // L: 39
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 40
		}
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "2097664875"
	)
	public JSONObject method7786() {
		return this.field4604; // L: 45
	}
}
