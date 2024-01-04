import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class416 extends class418 {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field4547;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	class328 field4548;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1632604093
	)
	int field4546;

	@ObfuscatedSignature(
		descriptor = "(Lql;IZI)V"
	)
	public class416(class418 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4548 = null; // L: 7
		this.field4546 = 0; // L: 8
		super.field4552 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class316.field3416.size()) { // L: 16
				this.field4548 = (class328)class316.field3416.get(var2); // L: 17
			} else if (!var3 && var2 < class316.field3422.size()) {
				this.field4548 = (class328)class316.field3422.get(var2);
			}

			this.field4546 = var4;
		}
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4548 != null && this.field4548.field3522 != null) { // L: 27
			this.field4548.field3530 = true; // L: 30

			try {
				if (this.field4548.field3528 > 0.0F && this.field4548.field3522.isReady()) { // L: 32
					float var1 = this.field4546 == 0 ? (float)this.field4546 : (float)this.field4548.field3525 / (float)this.field4546; // L: 33
					class328 var10000 = this.field4548; // L: 34
					var10000.field3528 -= 0.0F == var1 ? (float)this.field4548.field3525 : var1;
					if (this.field4548.field3528 < 0.0F) { // L: 35
						this.field4548.field3528 = 0.0F; // L: 36
					}

					this.field4548.field3522.setPcmStreamVolume((int)this.field4548.field3528); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7840(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4548.field3530 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ltb;",
		garbageValue = "419212113"
	)
	public static class517 method7825(int var0) {
		class517 var1 = (class517)class517.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class517.field5074.takeFile(39, var0); // L: 21
			var1 = new class517(); // L: 22
			if (var2 != null) { // L: 23
				var1.method9147(new Buffer(var2));
			}

			var1.method9150(); // L: 24
			class517.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "82"
	)
	static final int method7829(int var0, int var1) {
		int var2 = NPC.method2719(var0 - 1, var1 - 1) + NPC.method2719(1 + var0, var1 - 1) + NPC.method2719(var0 - 1, 1 + var1) + NPC.method2719(var0 + 1, 1 + var1); // L: 986
		int var3 = NPC.method2719(var0 - 1, var1) + NPC.method2719(var0 + 1, var1) + NPC.method2719(var0, var1 - 1) + NPC.method2719(var0, 1 + var1); // L: 987
		int var4 = NPC.method2719(var0, var1); // L: 988
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 989
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1205562248"
	)
	static void method7830(int var0, int var1, int var2, int var3) {
		Widget var4 = HealthBarDefinition.field1877.method6279(var0, var1); // L: 10206
		if (var4 != null && var4.onTargetEnter != null) { // L: 10207
			ScriptEvent var5 = new ScriptEvent(); // L: 10208
			var5.widget = var4; // L: 10209
			var5.args = var4.onTargetEnter; // L: 10210
			class157.runScriptEvent(var5); // L: 10211
		}

		Client.field654 = var3; // L: 10213
		Client.isSpellSelected = true; // L: 10214
		class348.field3826 = var0; // L: 10215
		Client.field534 = var1; // L: 10216
		UrlRequest.field1430 = var2; // L: 10217
		class159.invalidateWidget(var4); // L: 10218
	} // L: 10219
}
