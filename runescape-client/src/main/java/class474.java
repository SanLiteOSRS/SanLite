import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sv")
public class class474 implements class473 {
	@ObfuscatedName("ah")
	JSONObject field4813;

	public class474(byte[] var1) throws UnsupportedEncodingException {
		this.method8574(var1); // L: 21
	} // L: 22

	public class474(JSONObject var1) {
		this.field4813 = var1; // L: 13
	} // L: 14

	public class474(String var1) throws UnsupportedEncodingException {
		this.method8575(var1); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
	public class472 vmethod8594() {
		return class472.field4810; // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	public byte[] vmethod8587() throws UnsupportedEncodingException {
		return this.field4813 == null ? new byte[0] : this.field4813.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1436694020"
	)
	void method8574(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8575(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1963139059"
	)
	void method8575(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4813 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4813 = new JSONObject(); // L: 41
				this.field4813.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "70"
	)
	public JSONObject method8573() {
		return this.field4813; // L: 54
	}
}
