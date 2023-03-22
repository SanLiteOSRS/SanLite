import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("qg")
public class class433 implements class432 {
	@ObfuscatedName("gq")
	static String field4642;
	@ObfuscatedName("al")
	JSONObject field4643;

	public class433(byte[] var1) throws UnsupportedEncodingException {
		this.method7978(var1); // L: 21
	} // L: 22

	public class433(JSONObject var1) {
		this.field4643 = var1; // L: 13
	} // L: 14

	public class433(String var1) throws UnsupportedEncodingException {
		this.method7979(var1); // L: 17
	} // L: 18

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "1"
	)
	public class431 vmethod7993() {
		return class431.field4639; // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "66"
	)
	public byte[] vmethod7994() throws UnsupportedEncodingException {
		return this.field4643 == null ? new byte[0] : this.field4643.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "18"
	)
	void method7978(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method7979(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "11699"
	)
	void method7979(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4643 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4643 = new JSONObject(); // L: 41
				this.field4643.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "214188933"
	)
	public JSONObject method7980() {
		return this.field4643; // L: 54
	}
}
