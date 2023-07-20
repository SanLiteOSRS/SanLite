import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ec")
final class class106 implements class324 {
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1358;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1; // L: 513
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void vmethod6102() {
		if (this.val$cc != null && this.val$cc.method6471().field3553 != null) { // L: 515
			ScriptEvent var1 = new ScriptEvent(); // L: 516
			var1.method2290(this.val$cc); // L: 517
			var1.setArgs(this.val$cc.method6471().field3553); // L: 518
			ClientPacket.method5722().addFirst(var1); // L: 519
		}

	} // L: 521

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static void method2690() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) { // L: 66
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1061757144"
	)
	static float[] method2689(JSONObject var0, String var1) throws JSONException {
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
