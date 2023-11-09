import java.applet.Applet;
import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("pf")
public class class422 implements class421 {
	@ObfuscatedName("h")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("v")
	JSONObject field4658;

	public class422(byte[] var1) throws UnsupportedEncodingException {
		this.method7923(var1); // L: 17
	} // L: 18

	public class422(String var1) throws UnsupportedEncodingException {
		this.method7916(var1); // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	public byte[] vmethod7924() throws UnsupportedEncodingException {
		return this.field4658 == null ? new byte[0] : this.field4658.toString().getBytes("UTF-8"); // L: 50 51 53
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1750252743"
	)
	void method7923(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 21
		this.method7916(var2); // L: 22
	} // L: 23

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1308508243"
	)
	void method7916(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 27
				this.field4658 = new JSONObject(var1); // L: 28
			} else {
				if (var1.charAt(0) != '[') { // L: 30
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 36
				}

				JSONArray var2 = new JSONArray(var1); // L: 31
				this.field4658 = new JSONObject(); // L: 32
				this.field4658.put("arrayValues", var2); // L: 33
			}

		} catch (JSONException var3) { // L: 39
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 40
		}
	} // L: 42

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "1299055961"
	)
	public JSONObject method7917() {
		return this.field4658; // L: 45
	}
}
