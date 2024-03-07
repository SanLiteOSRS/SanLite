import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("si")
public class class481 implements class480 {
	@ObfuscatedName("aw")
	JSONObject field4880;

	public class481(byte[] var1) throws UnsupportedEncodingException {
		this.method8767(var1); // L: 21
	} // L: 22

	public class481(JSONObject var1) {
		this.field4880 = var1; // L: 13
	} // L: 14

	public class481(String var1) throws UnsupportedEncodingException {
		this.method8776(var1); // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsp;",
		garbageValue = "46"
	)
	public class479 vmethod8780() {
		return class479.field4879; // L: 26
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-62513224"
	)
	public byte[] vmethod8781() throws UnsupportedEncodingException {
		return this.field4880 == null ? new byte[0] : this.field4880.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-89"
	)
	void method8767(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8776(var2); // L: 31
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-56"
	)
	void method8776(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4880 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4880 = new JSONObject(); // L: 41
				this.field4880.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-825610131"
	)
	public JSONObject method8769() {
		return this.field4880; // L: 54
	}
}
