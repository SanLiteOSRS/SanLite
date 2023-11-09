import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ru")
public class class462 implements class461 {
	@ObfuscatedName("aj")
	JSONObject field4773;

	public class462(byte[] var1) throws UnsupportedEncodingException {
		this.method8351(var1);
	}

	public class462(JSONObject var1) {
		this.field4773 = var1; // L: 13
	} // L: 14

	public class462(String var1) throws UnsupportedEncodingException {
		this.method8366(var1); // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "1996622656"
	)
	public class460 vmethod8369() {
		return class460.field4769;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "10"
	)
	public byte[] vmethod8370() throws UnsupportedEncodingException {
		return this.field4773 == null ? new byte[0] : this.field4773.toString().getBytes("UTF-8"); // L: 59 60 62
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2028910402"
	)
	void method8351(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8366(var2); // L: 31
	} // L: 32

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "9"
	)
	void method8366(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field4773 = new JSONObject(var1); // L: 37
			} else {
				if (var1.charAt(0) != '[') { // L: 39
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 45
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field4773 = new JSONObject(); // L: 41
				this.field4773.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 49
		}
	} // L: 51

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-1179549517"
	)
	public JSONObject method8353() {
		return this.field4773; // L: 54
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhy;",
		garbageValue = "25"
	)
	public static FloorUnderlayDefinition method8367(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2089.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
