import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("cx")
public class class88 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;S)V",
		garbageValue = "3809"
	)
	public static void method2412(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "-97"
	)
	static float[] method2408(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 303

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 305
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 306
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 307
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 308
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 309
		} catch (JSONException var4) { // L: 311
			var2[0] = 0.0F; // L: 312
			var2[1] = 0.0F; // L: 313
			var2[2] = 1.0F; // L: 314
			var2[3] = 1.0F; // L: 315
		}

		return var2; // L: 317
	}
}
