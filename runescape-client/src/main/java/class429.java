import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ps")
public class class429 implements class428 {
	@ObfuscatedName("w")
	JSONObject field4682;

	public class429(byte[] var1) throws UnsupportedEncodingException {
		this.method8056(var1); // L: 21
	} // L: 22

	public class429(JSONObject var1) {
		this.field4682 = var1; // L: 13
	} // L: 14

	public class429(String var1) throws UnsupportedEncodingException {
		this.method8044(var1); // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lpf;",
		garbageValue = "1"
	)
	public class427 vmethod8059() {
		return class427.field4680; // L: 26
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "1"
	)
	public byte[] vmethod8061() throws UnsupportedEncodingException {
		return this.field4682 == null ? new byte[0] : this.field4682.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-106"
	)
	void method8056(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8044(var2); // L: 31
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-893487137"
	)
	void method8044(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4682 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4682 = new JSONObject(); // L: 41
				this.field4682.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "-128"
	)
	public JSONObject method8045() {
		return this.field4682; // L: 54
	}
}
