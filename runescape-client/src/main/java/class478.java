import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sd")
public class class478 implements class477 {
	@ObfuscatedName("ap")
	JSONObject field4850;

	public class478(byte[] var1) throws UnsupportedEncodingException {
		this.method8701(var1); // L: 21
	} // L: 22

	public class478(JSONObject var1) {
		this.field4850 = var1; // L: 13
	} // L: 14

	public class478(String var1) throws UnsupportedEncodingException {
		this.method8693(var1); // L: 17
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lsy;",
		garbageValue = "2086749416"
	)
	public class476 vmethod8709() {
		return class476.field4847; // L: 26
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "529214667"
	)
	public byte[] vmethod8715() throws UnsupportedEncodingException {
		return this.field4850 == null ? new byte[0] : this.field4850.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "981961216"
	)
	void method8701(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8693(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1247464866"
	)
	void method8693(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4850 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4850 = new JSONObject(); // L: 41
				this.field4850.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "1041668985"
	)
	public JSONObject method8694() {
		return this.field4850; // L: 54
	}
}
