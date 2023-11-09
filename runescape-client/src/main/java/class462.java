import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rl")
public class class462 implements class461 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 608843781
	)
	public static int field4778;
	@ObfuscatedName("ae")
	JSONObject field4775;

	public class462(byte[] var1) throws UnsupportedEncodingException {
		this.method8335(var1); // L: 21
	} // L: 22

	public class462(JSONObject var1) {
		this.field4775 = var1; // L: 13
	} // L: 14

	public class462(String var1) throws UnsupportedEncodingException {
		this.method8330(var1); // L: 17
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1843960357"
	)
	public class460 vmethod8346() {
		return class460.field4772; // L: 26
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2012768243"
	)
	public byte[] vmethod8344() throws UnsupportedEncodingException {
		return this.field4775 == null ? new byte[0] : this.field4775.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-68"
	)
	void method8335(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8330(var2); // L: 31
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-32"
	)
	void method8330(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4775 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4775 = new JSONObject(); // L: 41
				this.field4775.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "-30"
	)
	public JSONObject method8332() {
		return this.field4775; // L: 54
	}
}
