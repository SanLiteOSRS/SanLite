import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("si")
public class class477 implements class476 {
	@ObfuscatedName("al")
	JSONObject field4821;

	public class477(byte[] var1) throws UnsupportedEncodingException {
		this.method8489(var1); // L: 21
	} // L: 22

	public class477(JSONObject var1) {
		this.field4821 = var1; // L: 13
	} // L: 14

	public class477(String var1) throws UnsupportedEncodingException {
		this.method8490(var1); // L: 17
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lst;",
		garbageValue = "1"
	)
	public class475 vmethod8518() {
		return class475.field4818; // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "17"
	)
	public byte[] vmethod8509() throws UnsupportedEncodingException {
		return this.field4821 == null ? new byte[0] : this.field4821.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1876533299"
	)
	void method8489(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8490(var2); // L: 31
	} // L: 32

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1250526518"
	)
	void method8490(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4821 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4821 = new JSONObject(); // L: 41
				this.field4821.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Lorg/json/JSONObject;",
		garbageValue = "-32336"
	)
	public JSONObject method8491() {
		return this.field4821; // L: 54
	}
}
