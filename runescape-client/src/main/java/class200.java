import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class200 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	public static void method3823() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lip;I)V",
		garbageValue = "895598931"
	)
	static void method3820(class227 var0) {
		if (var0 != null && var0.field2426 != null) { // L: 5174
			if (var0.field2426.childIndex >= 0) { // L: 5175
				Widget var1 = class243.field2620.method6281(var0.field2426.parentId); // L: 5176
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2426.childIndex >= var1.children.length || var0.field2426 != var1.children[var0.field2426.childIndex]) { // L: 5177
					return; // L: 5178
				}
			}

			if (var0.field2426.type == 11 && var0.field2424 == 0) { // L: 5181
				if (var0.field2426.method6767(var0.field2422, var0.field2425, 0, 0)) { // L: 5182
					var0.field2426.method6769().method3440().method3576(1, var0.field2426.method6769().method3452()); // L: 5183
					switch(var0.field2426.method6672()) { // L: 5184
					case 0:
						class129.openURL(var0.field2426.method6674(), true, false); // L: 5206
						break;
					case 1:
						int var2 = class33.getWidgetFlags(var0.field2426); // L: 5187
						boolean var5 = (var2 >> 22 & 1) != 0; // L: 5189
						if (var5) { // L: 5191
							int[] var3 = var0.field2426.method6675(); // L: 5192
							if (var3 != null) { // L: 5193
								PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3294, Client.packetWriter.isaacCipher); // L: 5194
								var4.packetBuffer.method9250(var0.field2426.method6673()); // L: 5195
								var4.packetBuffer.writeShort(var0.field2426.childIndex); // L: 5196
								var4.packetBuffer.writeIntME(var3[1]); // L: 5197
								var4.packetBuffer.method9407(var3[2]); // L: 5198
								var4.packetBuffer.method9250(var0.field2426.id); // L: 5199
								var4.packetBuffer.method9407(var3[0]); // L: 5200
								Client.packetWriter.addNode(var4); // L: 5201
							}
						}
					}
				}
			} else if (var0.field2426.type == 12) { // L: 5211
				class347 var6 = var0.field2426.method6667(); // L: 5212
				if (var6 != null && var6.method6416()) { // L: 5213
					switch(var0.field2424) { // L: 5214
					case 0:
						Client.field749.method4278(var0.field2426); // L: 5216
						var6.method6486(true); // L: 5217
						var6.method6403(var0.field2422, var0.field2425, Client.field748.method4318(82), Client.field748.method4318(81)); // L: 5218
						break;
					case 1:
						var6.method6395(var0.field2422, var0.field2425); // L: 5221
					}
				}
			}

		}
	} // L: 5226
}
