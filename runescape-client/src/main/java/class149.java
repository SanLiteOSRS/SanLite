import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ey")
public class class149 {
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -1532835829
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391954033"
	)
	public static void method3062() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 200
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 201
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 202
	} // L: 203

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1087479406"
	)
	static float[] method3061(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 279

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 281
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 282
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 283
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 284
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 285
		} catch (JSONException var4) { // L: 287
			var2[0] = 0.0F; // L: 288
			var2[1] = 0.0F; // L: 289
			var2[2] = 1.0F; // L: 290
			var2[3] = 1.0F; // L: 291
		}

		return var2; // L: 293
	}
}
