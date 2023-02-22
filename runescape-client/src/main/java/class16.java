import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -57356017
	)
	static int field88;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("f")
	final ThreadGroup field90;
	@ObfuscatedName("w")
	final AtomicInteger field86;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field86 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field90 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field90, var1, this.this$0.field73 + "-rest-request-" + this.field86.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "370941901"
	)
	public static boolean method216(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	static int method218() {
		return Login.loginIndex; // L: 1886
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1439250814"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class135.getWidgetChild(var1, var2); // L: 10305
		if (var5 != null) { // L: 10306
			if (var5.onOp != null) { // L: 10307
				ScriptEvent var6 = new ScriptEvent(); // L: 10308
				var6.widget = var5; // L: 10309
				var6.opIndex = var0; // L: 10310
				var6.targetName = var4; // L: 10311
				var6.args = var5.onOp; // L: 10312
				WorldMapAreaData.runScriptEvent(var6); // L: 10313
			}

			boolean var8 = true; // L: 10315
			if (var5.contentType > 0) { // L: 10316
				var8 = class276.method5534(var5);
			}

			if (var8) { // L: 10317
				if (ItemLayer.method4229(class173.getWidgetFlags(var5), var0 - 1)) { // L: 10318
					PacketBufferNode var7;
					if (var0 == 1) { // L: 10321
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 10323
						var7.packetBuffer.writeInt(var1); // L: 10324
						var7.packetBuffer.writeShort(var2); // L: 10325
						var7.packetBuffer.writeShort(var3); // L: 10326
						Client.packetWriter.addNode(var7); // L: 10327
					}

					if (var0 == 2) { // L: 10329
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 10331
						var7.packetBuffer.writeInt(var1); // L: 10332
						var7.packetBuffer.writeShort(var2); // L: 10333
						var7.packetBuffer.writeShort(var3); // L: 10334
						Client.packetWriter.addNode(var7); // L: 10335
					}

					if (var0 == 3) { // L: 10337
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3079, Client.packetWriter.isaacCipher); // L: 10339
						var7.packetBuffer.writeInt(var1); // L: 10340
						var7.packetBuffer.writeShort(var2); // L: 10341
						var7.packetBuffer.writeShort(var3); // L: 10342
						Client.packetWriter.addNode(var7); // L: 10343
					}

					if (var0 == 4) { // L: 10345
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3083, Client.packetWriter.isaacCipher); // L: 10347
						var7.packetBuffer.writeInt(var1); // L: 10348
						var7.packetBuffer.writeShort(var2); // L: 10349
						var7.packetBuffer.writeShort(var3); // L: 10350
						Client.packetWriter.addNode(var7); // L: 10351
					}

					if (var0 == 5) { // L: 10353
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 10355
						var7.packetBuffer.writeInt(var1); // L: 10356
						var7.packetBuffer.writeShort(var2); // L: 10357
						var7.packetBuffer.writeShort(var3); // L: 10358
						Client.packetWriter.addNode(var7); // L: 10359
					}

					if (var0 == 6) { // L: 10361
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 10363
						var7.packetBuffer.writeInt(var1); // L: 10364
						var7.packetBuffer.writeShort(var2); // L: 10365
						var7.packetBuffer.writeShort(var3); // L: 10366
						Client.packetWriter.addNode(var7); // L: 10367
					}

					if (var0 == 7) { // L: 10369
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 10371
						var7.packetBuffer.writeInt(var1); // L: 10372
						var7.packetBuffer.writeShort(var2); // L: 10373
						var7.packetBuffer.writeShort(var3); // L: 10374
						Client.packetWriter.addNode(var7); // L: 10375
					}

					if (var0 == 8) { // L: 10377
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 10379
						var7.packetBuffer.writeInt(var1); // L: 10380
						var7.packetBuffer.writeShort(var2); // L: 10381
						var7.packetBuffer.writeShort(var3); // L: 10382
						Client.packetWriter.addNode(var7); // L: 10383
					}

					if (var0 == 9) { // L: 10385
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 10387
						var7.packetBuffer.writeInt(var1); // L: 10388
						var7.packetBuffer.writeShort(var2); // L: 10389
						var7.packetBuffer.writeShort(var3); // L: 10390
						Client.packetWriter.addNode(var7); // L: 10391
					}

					if (var0 == 10) { // L: 10393
						var7 = Renderable.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 10395
						var7.packetBuffer.writeInt(var1); // L: 10396
						var7.packetBuffer.writeShort(var2); // L: 10397
						var7.packetBuffer.writeShort(var3); // L: 10398
						Client.packetWriter.addNode(var7); // L: 10399
					}

				}
			}
		}
	} // L: 10319 10401
}
