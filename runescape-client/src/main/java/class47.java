import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class47 {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field352;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1819265849
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class497 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	VorbisSample field354;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	RawSound field348;
	@ObfuscatedName("ao")
	ReentrantLock field349;

	@ObfuscatedSignature(
		descriptor = "(Lcm;Lbu;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field354 = var1; // L: 11
		this.field348 = var2; // L: 12
		this.field349 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "997098077"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = SoundCache.getWidgetChild(var1, var2); // L: 10118
		if (var5 != null) { // L: 10119
			if (var5.onOp != null) { // L: 10120
				ScriptEvent var6 = new ScriptEvent(); // L: 10121
				var6.widget = var5; // L: 10122
				var6.opIndex = var0; // L: 10123
				var6.targetName = var4; // L: 10124
				var6.args = var5.onOp; // L: 10125
				WorldMapSection1.runScriptEvent(var6); // L: 10126
			}

			boolean var11 = true; // L: 10128
			if (var5.contentType > 0) { // L: 10129
				var11 = Bounds.method8135(var5);
			}

			if (var11) { // L: 10130
				int var8 = class194.getWidgetFlags(var5); // L: 10132
				int var9 = var0 - 1; // L: 10133
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10135
				if (var7) { // L: 10137
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10140
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 10142
						var10.packetBuffer.writeInt(var1); // L: 10143
						var10.packetBuffer.writeShort(var2); // L: 10144
						var10.packetBuffer.writeShort(var3); // L: 10145
						Client.packetWriter.addNode(var10); // L: 10146
					}

					if (var0 == 2) { // L: 10148
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 10150
						var10.packetBuffer.writeInt(var1); // L: 10151
						var10.packetBuffer.writeShort(var2); // L: 10152
						var10.packetBuffer.writeShort(var3); // L: 10153
						Client.packetWriter.addNode(var10); // L: 10154
					}

					if (var0 == 3) { // L: 10156
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 10158
						var10.packetBuffer.writeInt(var1); // L: 10159
						var10.packetBuffer.writeShort(var2); // L: 10160
						var10.packetBuffer.writeShort(var3); // L: 10161
						Client.packetWriter.addNode(var10); // L: 10162
					}

					if (var0 == 4) { // L: 10164
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 10166
						var10.packetBuffer.writeInt(var1); // L: 10167
						var10.packetBuffer.writeShort(var2); // L: 10168
						var10.packetBuffer.writeShort(var3); // L: 10169
						Client.packetWriter.addNode(var10); // L: 10170
					}

					if (var0 == 5) { // L: 10172
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 10174
						var10.packetBuffer.writeInt(var1); // L: 10175
						var10.packetBuffer.writeShort(var2); // L: 10176
						var10.packetBuffer.writeShort(var3); // L: 10177
						Client.packetWriter.addNode(var10); // L: 10178
					}

					if (var0 == 6) { // L: 10180
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 10182
						var10.packetBuffer.writeInt(var1); // L: 10183
						var10.packetBuffer.writeShort(var2); // L: 10184
						var10.packetBuffer.writeShort(var3); // L: 10185
						Client.packetWriter.addNode(var10); // L: 10186
					}

					if (var0 == 7) { // L: 10188
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 10190
						var10.packetBuffer.writeInt(var1); // L: 10191
						var10.packetBuffer.writeShort(var2); // L: 10192
						var10.packetBuffer.writeShort(var3); // L: 10193
						Client.packetWriter.addNode(var10); // L: 10194
					}

					if (var0 == 8) { // L: 10196
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 10198
						var10.packetBuffer.writeInt(var1); // L: 10199
						var10.packetBuffer.writeShort(var2); // L: 10200
						var10.packetBuffer.writeShort(var3); // L: 10201
						Client.packetWriter.addNode(var10); // L: 10202
					}

					if (var0 == 9) { // L: 10204
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 10206
						var10.packetBuffer.writeInt(var1); // L: 10207
						var10.packetBuffer.writeShort(var2); // L: 10208
						var10.packetBuffer.writeShort(var3); // L: 10209
						Client.packetWriter.addNode(var10); // L: 10210
					}

					if (var0 == 10) { // L: 10212
						var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 10214
						var10.packetBuffer.writeInt(var1); // L: 10215
						var10.packetBuffer.writeShort(var2); // L: 10216
						var10.packetBuffer.writeShort(var3); // L: 10217
						Client.packetWriter.addNode(var10); // L: 10218
					}

				}
			}
		}
	} // L: 10138 10220
}
