import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1360611527
	)
	@Export("type")
	int type;
	@ObfuscatedName("h")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[Lql;",
		garbageValue = "90"
	)
	@Export("FillMode_values")
	public static class454[] FillMode_values() {
		return new class454[]{class454.SOLID, class454.field4781, class454.field4784}; // L: 15
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1771551760"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class128.getWidgetChild(var1, var2); // L: 9289
		if (var5 != null) { // L: 9290
			if (var5.onOp != null) { // L: 9291
				ScriptEvent var6 = new ScriptEvent(); // L: 9292
				var6.widget = var5; // L: 9293
				var6.opIndex = var0; // L: 9294
				var6.targetName = var4; // L: 9295
				var6.args = var5.onOp; // L: 9296
				SceneTilePaint.runScriptEvent(var6); // L: 9297
			}

			boolean var8 = true; // L: 9299
			if (var5.contentType > 0) { // L: 9300
				var8 = class18.method263(var5);
			}

			if (var8) { // L: 9301
				if (TaskHandler.method3189(class193.getWidgetFlags(var5), var0 - 1)) { // L: 9302
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9305
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher); // L: 9307
						var7.packetBuffer.writeInt(var1); // L: 9308
						var7.packetBuffer.writeShort(var2); // L: 9309
						var7.packetBuffer.writeShort(var3); // L: 9310
						Client.packetWriter.addNode(var7); // L: 9311
					}

					if (var0 == 2) { // L: 9313
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 9315
						var7.packetBuffer.writeInt(var1); // L: 9316
						var7.packetBuffer.writeShort(var2); // L: 9317
						var7.packetBuffer.writeShort(var3); // L: 9318
						Client.packetWriter.addNode(var7); // L: 9319
					}

					if (var0 == 3) { // L: 9321
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 9323
						var7.packetBuffer.writeInt(var1); // L: 9324
						var7.packetBuffer.writeShort(var2); // L: 9325
						var7.packetBuffer.writeShort(var3); // L: 9326
						Client.packetWriter.addNode(var7); // L: 9327
					}

					if (var0 == 4) { // L: 9329
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher); // L: 9331
						var7.packetBuffer.writeInt(var1); // L: 9332
						var7.packetBuffer.writeShort(var2); // L: 9333
						var7.packetBuffer.writeShort(var3); // L: 9334
						Client.packetWriter.addNode(var7); // L: 9335
					}

					if (var0 == 5) { // L: 9337
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher); // L: 9339
						var7.packetBuffer.writeInt(var1); // L: 9340
						var7.packetBuffer.writeShort(var2); // L: 9341
						var7.packetBuffer.writeShort(var3); // L: 9342
						Client.packetWriter.addNode(var7); // L: 9343
					}

					if (var0 == 6) { // L: 9345
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher); // L: 9347
						var7.packetBuffer.writeInt(var1); // L: 9348
						var7.packetBuffer.writeShort(var2); // L: 9349
						var7.packetBuffer.writeShort(var3); // L: 9350
						Client.packetWriter.addNode(var7); // L: 9351
					}

					if (var0 == 7) { // L: 9353
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher); // L: 9355
						var7.packetBuffer.writeInt(var1); // L: 9356
						var7.packetBuffer.writeShort(var2); // L: 9357
						var7.packetBuffer.writeShort(var3); // L: 9358
						Client.packetWriter.addNode(var7); // L: 9359
					}

					if (var0 == 8) { // L: 9361
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher); // L: 9363
						var7.packetBuffer.writeInt(var1); // L: 9364
						var7.packetBuffer.writeShort(var2); // L: 9365
						var7.packetBuffer.writeShort(var3); // L: 9366
						Client.packetWriter.addNode(var7); // L: 9367
					}

					if (var0 == 9) { // L: 9369
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher); // L: 9371
						var7.packetBuffer.writeInt(var1); // L: 9372
						var7.packetBuffer.writeShort(var2); // L: 9373
						var7.packetBuffer.writeShort(var3); // L: 9374
						Client.packetWriter.addNode(var7); // L: 9375
					}

					if (var0 == 10) { // L: 9377
						var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 9379
						var7.packetBuffer.writeInt(var1); // L: 9380
						var7.packetBuffer.writeShort(var2); // L: 9381
						var7.packetBuffer.writeShort(var3); // L: 9382
						Client.packetWriter.addNode(var7); // L: 9383
					}

				}
			}
		}
	} // L: 9303 9385
}
