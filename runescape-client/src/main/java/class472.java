import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
public class class472 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	public static final class472 field4810;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	static final class472 field4811;
	@ObfuscatedName("ar")
	String field4809;

	static {
		field4810 = new class472("application/json"); // L: 4
		field4811 = new class472("text/plain"); // L: 5
	}

	class472(String var1) {
		this.field4809 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1925429052"
	)
	public String method8563() {
		return this.field4809; // L: 13
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;",
		garbageValue = "-2020292957"
	)
	public static class514 method8562(int var0) {
		int var1 = class512.field5056[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class514.field5065; // L: 21
		} else if (var1 == 2) { // L: 23
			return class514.field5061; // L: 24
		} else {
			return var1 == 3 ? class514.field5066 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2006289317"
	)
	public static void method8564() {
		class316.field3424.clear(); // L: 144
	} // L: 145

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "-41"
	)
	static final void method8565(PacketBuffer var0) {
		var0.importIndex(); // L: 9160
		int var1 = var0.readBits(8); // L: 9161
		int var2;
		if (var1 < Client.npcCount) { // L: 9162
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 9163
				Client.field618[++Client.field617 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 9165
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 9166

			for (var2 = 0; var2 < var1; ++var2) { // L: 9167
				int var3 = Client.npcIndices[var2]; // L: 9168
				NPC var4 = Client.npcs[var3]; // L: 9169
				int var5 = var0.readBits(1); // L: 9170
				if (var5 == 0) { // L: 9171
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9172
					var4.npcCycle = Client.cycle; // L: 9173
				} else {
					int var6 = var0.readBits(2); // L: 9176
					if (var6 == 0) { // L: 9177
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9178
						var4.npcCycle = Client.cycle; // L: 9179
						Client.field549[++Client.field637 - 1] = var3; // L: 9180
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 9183
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9184
							var4.npcCycle = Client.cycle; // L: 9185
							var7 = var0.readBits(3); // L: 9186
							var4.method2664(var7, class228.field2409); // L: 9187
							var8 = var0.readBits(1); // L: 9188
							if (var8 == 1) { // L: 9189
								Client.field549[++Client.field637 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 9192
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9193
							var4.npcCycle = Client.cycle; // L: 9194
							if (var0.readBits(1) == 1) { // L: 9195
								var7 = var0.readBits(3); // L: 9196
								var4.method2664(var7, class228.field2410); // L: 9197
								var8 = var0.readBits(3); // L: 9198
								var4.method2664(var8, class228.field2410); // L: 9199
							} else {
								var7 = var0.readBits(3); // L: 9202
								var4.method2664(var7, class228.field2408); // L: 9203
							}

							var7 = var0.readBits(1); // L: 9205
							if (var7 == 1) { // L: 9206
								Client.field549[++Client.field637 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 9209
							Client.field618[++Client.field617 - 1] = var3; // L: 9210
						}
					}
				}
			}

		}
	} // L: 9214
}
