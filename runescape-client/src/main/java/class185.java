import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class185 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ArchiveLoader.field1070.method6433(var1, var2); // L: 10130
		if (var5 != null) { // L: 10131
			if (var5.onOp != null) { // L: 10132
				ScriptEvent var6 = new ScriptEvent(); // L: 10133
				var6.widget = var5; // L: 10134
				var6.opIndex = var0; // L: 10135
				var6.targetName = var4; // L: 10136
				var6.args = var5.onOp; // L: 10137
				class177.runScriptEvent(var6); // L: 10138
			}

			boolean var11 = true; // L: 10140
			if (var5.contentType > 0) { // L: 10141
				var11 = SoundSystem.method807(var5);
			}

			if (var11) { // L: 10142
				int var8 = class429.getWidgetFlags(var5); // L: 10144
				int var9 = var0 - 1; // L: 10145
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10147
				if (var7) { // L: 10149
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10152
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 10154
						var10.packetBuffer.writeInt(var1); // L: 10155
						var10.packetBuffer.writeShort(var2); // L: 10156
						var10.packetBuffer.writeShort(var3); // L: 10157
						Client.packetWriter.addNode(var10); // L: 10158
					}

					if (var0 == 2) { // L: 10160
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 10162
						var10.packetBuffer.writeInt(var1); // L: 10163
						var10.packetBuffer.writeShort(var2); // L: 10164
						var10.packetBuffer.writeShort(var3); // L: 10165
						Client.packetWriter.addNode(var10); // L: 10166
					}

					if (var0 == 3) { // L: 10168
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3254, Client.packetWriter.isaacCipher); // L: 10170
						var10.packetBuffer.writeInt(var1); // L: 10171
						var10.packetBuffer.writeShort(var2); // L: 10172
						var10.packetBuffer.writeShort(var3); // L: 10173
						Client.packetWriter.addNode(var10); // L: 10174
					}

					if (var0 == 4) { // L: 10176
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3268, Client.packetWriter.isaacCipher); // L: 10178
						var10.packetBuffer.writeInt(var1); // L: 10179
						var10.packetBuffer.writeShort(var2); // L: 10180
						var10.packetBuffer.writeShort(var3); // L: 10181
						Client.packetWriter.addNode(var10); // L: 10182
					}

					if (var0 == 5) { // L: 10184
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher); // L: 10186
						var10.packetBuffer.writeInt(var1); // L: 10187
						var10.packetBuffer.writeShort(var2); // L: 10188
						var10.packetBuffer.writeShort(var3); // L: 10189
						Client.packetWriter.addNode(var10); // L: 10190
					}

					if (var0 == 6) { // L: 10192
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher); // L: 10194
						var10.packetBuffer.writeInt(var1); // L: 10195
						var10.packetBuffer.writeShort(var2); // L: 10196
						var10.packetBuffer.writeShort(var3); // L: 10197
						Client.packetWriter.addNode(var10); // L: 10198
					}

					if (var0 == 7) { // L: 10200
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3196, Client.packetWriter.isaacCipher); // L: 10202
						var10.packetBuffer.writeInt(var1); // L: 10203
						var10.packetBuffer.writeShort(var2); // L: 10204
						var10.packetBuffer.writeShort(var3); // L: 10205
						Client.packetWriter.addNode(var10); // L: 10206
					}

					if (var0 == 8) { // L: 10208
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 10210
						var10.packetBuffer.writeInt(var1); // L: 10211
						var10.packetBuffer.writeShort(var2); // L: 10212
						var10.packetBuffer.writeShort(var3); // L: 10213
						Client.packetWriter.addNode(var10); // L: 10214
					}

					if (var0 == 9) { // L: 10216
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3232, Client.packetWriter.isaacCipher); // L: 10218
						var10.packetBuffer.writeInt(var1); // L: 10219
						var10.packetBuffer.writeShort(var2); // L: 10220
						var10.packetBuffer.writeShort(var3); // L: 10221
						Client.packetWriter.addNode(var10); // L: 10222
					}

					if (var0 == 10) { // L: 10224
						var10 = ViewportMouse.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 10226
						var10.packetBuffer.writeInt(var1); // L: 10227
						var10.packetBuffer.writeShort(var2); // L: 10228
						var10.packetBuffer.writeShort(var3); // L: 10229
						Client.packetWriter.addNode(var10); // L: 10230
					}

				}
			}
		}
	} // L: 10150 10232
}
