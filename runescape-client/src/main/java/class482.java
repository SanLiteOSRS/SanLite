import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sx")
public class class482 implements class481 {
	@ObfuscatedName("av")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ah")
	JSONObject field4911;

	public class482(byte[] var1) throws UnsupportedEncodingException {
		this.method8545(var1); // L: 21
	} // L: 22

	public class482(JSONObject var1) {
		this.field4911 = var1; // L: 13
	} // L: 14

	public class482(String var1) throws UnsupportedEncodingException {
		this.method8546(var1); // L: 17
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "-2007074756"
	)
	public class480 vmethod8561() {
		return class480.field4905; // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	public byte[] vmethod8560() throws UnsupportedEncodingException {
		return this.field4911 == null ? new byte[0] : this.field4911.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-277028595"
	)
	void method8545(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8546(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1666101591"
	)
	void method8546(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4911 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4911 = new JSONObject(); // L: 41
				this.field4911.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "40"
	)
	public JSONObject method8552() {
		return this.field4911; // L: 54
	}
}
