import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class163 extends class144 {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("Ignored_cached")
	static class497 Ignored_cached;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1110302347
	)
	int field1779;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class163(class147 var1) {
		this.this$0 = var1;
		this.field1779 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1779 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3287(this.field1779); // L: 153
	} // L: 154

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;II)Llp;",
		garbageValue = "1652260020"
	)
	static MusicPatch method3418(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 25
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "43"
	)
	static float[] method3411(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 301

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 303
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 304
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 305
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 306
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 307
		} catch (JSONException var4) { // L: 309
			var2[0] = 0.0F; // L: 310
			var2[1] = 0.0F; // L: 311
			var2[2] = 1.0F; // L: 312
			var2[3] = 1.0F; // L: 313
		}

		return var2; // L: 315
	}
}
