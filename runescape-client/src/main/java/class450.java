import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rl")
public class class450 implements class449 {
	@ObfuscatedName("an")
	JSONObject field4732;

	public class450(byte[] var1) throws UnsupportedEncodingException {
		this.method8309(var1); // L: 21
	} // L: 22

	public class450(JSONObject var1) {
		this.field4732 = var1; // L: 13
	} // L: 14

	public class450(String var1) throws UnsupportedEncodingException {
		this.method8303(var1); // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "-1761651048"
	)
	public class448 vmethod8317() {
		return class448.field4727; // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "47349056"
	)
	public byte[] vmethod8318() throws UnsupportedEncodingException {
		return this.field4732 == null ? new byte[0] : this.field4732.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-32"
	)
	void method8309(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8303(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2034330459"
	)
	void method8303(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4732 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4732 = new JSONObject(); // L: 41
				this.field4732.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-85985739"
	)
	public JSONObject method8304() {
		return this.field4732; // L: 54
	}
}
