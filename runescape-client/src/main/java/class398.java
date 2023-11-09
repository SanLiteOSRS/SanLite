import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class398 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 121577041
	)
	int field4487;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 22376293
	)
	int field4486;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2024232485
	)
	int field4488;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1040814653
	)
	int field4489;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4487).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4488).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4486).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4487 + var5 + "Created: " + this.field4486 + var7 + "Total used: " + this.field4488 + var6 + "Max-In-Use: " + this.field4489; // L: 22
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lik;I)V",
		garbageValue = "420977288"
	)
	static void method7569(class210 var0) {
		if (var0 != null && var0.field2314 != null) { // L: 4998
			if (var0.field2314.childIndex >= 0) { // L: 4999
				Widget var1 = ArchiveDiskActionHandler.getWidget(var0.field2314.parentId); // L: 5000
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2314.childIndex >= var1.children.length || var0.field2314 != var1.children[var0.field2314.childIndex]) { // L: 5001
					return; // L: 5002
				}
			}

			if (var0.field2314.type == 11 && var0.field2318 == 0) { // L: 5005
				if (var0.field2314.method6444(var0.field2316, var0.field2319, 0, 0)) { // L: 5006
					switch(var0.field2314.method6458()) { // L: 5007
					case 0:
						class125.openURL(var0.field2314.method6450(), true, false); // L: 5024
						break;
					case 1:
						if (class167.method3350(class209.getWidgetFlags(var0.field2314))) { // L: 5009
							int[] var4 = var0.field2314.method6451(); // L: 5010
							if (var4 != null) { // L: 5011
								PacketBufferNode var2 = class251.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 5012
								var2.packetBuffer.method9133(var4[2]); // L: 5013
								var2.packetBuffer.method9133(var4[0]); // L: 5014
								var2.packetBuffer.method9016(var4[1]); // L: 5015
								var2.packetBuffer.writeIntME(var0.field2314.method6449()); // L: 5016
								var2.packetBuffer.writeShort(var0.field2314.childIndex); // L: 5017
								var2.packetBuffer.method9088(var0.field2314.id); // L: 5018
								Client.packetWriter.addNode(var2); // L: 5019
							}
						}
					}
				}
			} else if (var0.field2314.type == 12) { // L: 5029
				class327 var3 = var0.field2314.method6544(); // L: 5030
				if (var3 != null && var3.method6205()) { // L: 5031
					switch(var0.field2318) { // L: 5032
					case 0:
						Client.field616.method4058(var0.field2314); // L: 5034
						var3.method6190(true); // L: 5035
						var3.method6192(var0.field2316, var0.field2319, Client.field759.method4087(82), Client.field759.method4087(81)); // L: 5036
						break;
					case 1:
						var3.method6193(var0.field2316, var0.field2319); // L: 5039
					}
				}
			}

		}
	} // L: 5044
}
