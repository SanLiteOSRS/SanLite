import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("qv")
public class class437 implements class436 {
	@ObfuscatedName("ai")
	public static short[][] field4707;
	@ObfuscatedName("an")
	JSONObject field4708;

	public class437(byte[] var1) throws UnsupportedEncodingException {
		this.method8330(var1);
	} // L: 22

	public class437(JSONObject var1) {
		this.field4708 = var1; // L: 13
	} // L: 14

	public class437(String var1) throws UnsupportedEncodingException {
		this.method8340(var1); // L: 17
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lqz;",
		garbageValue = "-1368831969"
	)
	public class435 vmethod8346() {
		return class435.field4703; // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "888549065"
	)
	public byte[] vmethod8347() throws UnsupportedEncodingException {
		return this.field4708 == null ? new byte[0] : this.field4708.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "773111973"
	)
	void method8330(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8340(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "101"
	)
	void method8340(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4708 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4708 = new JSONObject(); // L: 41
				this.field4708.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-288365426"
	)
	public JSONObject method8332() {
		return this.field4708; // L: 54
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "34"
	)
	static final int method8344(int var0, int var1, int var2, int var3) {
		return var2 * var1 + var3 * var0 >> 16; // L: 21
	}
}
