import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rr")
public class class450 implements class449 {
	@ObfuscatedName("an")
	JSONObject field4721;

	public class450(byte[] var1) throws UnsupportedEncodingException {
		this.method8237(var1); // L: 21
	} // L: 22

	public class450(JSONObject var1) {
		this.field4721 = var1; // L: 13
	} // L: 14

	public class450(String var1) throws UnsupportedEncodingException {
		this.method8234(var1); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "1201915469"
	)
	public class448 vmethod8254() {
		return class448.field4717; // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2049750665"
	)
	public byte[] vmethod8248() throws UnsupportedEncodingException {
		return this.field4721 == null ? new byte[0] : this.field4721.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1951842632"
	)
	void method8237(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8234(var2); // L: 31
	} // L: 32

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-156283582"
	)
	void method8234(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4721 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4721 = new JSONObject(); // L: 41
				this.field4721.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Lorg/json/JSONObject;",
		garbageValue = "419"
	)
	public JSONObject method8238() {
		return this.field4721; // L: 54
	}
}
