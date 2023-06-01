import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fk")
public class class150 extends class143 {
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -89539893
	)
	static int field1680;
	@ObfuscatedName("ay")
	boolean field1677;
	@ObfuscatedName("an")
	byte field1672;
	@ObfuscatedName("ar")
	byte field1673;
	@ObfuscatedName("ab")
	byte field1671;
	@ObfuscatedName("at")
	byte field1674;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class150(class146 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1677 = var1.readUnsignedByte() == 1; // L: 251
		this.field1672 = var1.readByte(); // L: 252
		this.field1673 = var1.readByte(); // L: 253
		this.field1671 = var1.readByte(); // L: 254
		this.field1674 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.allowGuests = this.field1677; // L: 259
		var1.field1698 = this.field1672; // L: 260
		var1.field1699 = this.field1673; // L: 261
		var1.field1700 = this.field1671; // L: 262
		var1.field1701 = this.field1674; // L: 263
	} // L: 264

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1676842506"
	)
	public static int method3164(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "3"
	)
	static float[] method3162(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 329

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 331
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 332
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 333
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 334
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 335
		} catch (JSONException var4) { // L: 337
			var2[0] = 0.0F; // L: 338
			var2[1] = 0.0F; // L: 339
			var2[2] = 1.0F; // L: 340
			var2[3] = 1.0F; // L: 341
		}

		return var2; // L: 343
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
		garbageValue = "-1761537082"
	)
	static final void method3163(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		TileItem.method2645(var0, var1, var2, var3, var4, var5, var6, false); // L: 9911
	} // L: 9912
}
