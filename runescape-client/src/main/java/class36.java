import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class36 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("scene")
	static Scene scene;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "-1"
	)
	static final void method658(Widget var0) {
		int var1 = var0.contentType; // L: 12303
		if (var1 == 324) { // L: 12304
			if (Client.field790 == -1) { // L: 12305
				Client.field790 = var0.spriteId2; // L: 12306
				Client.field791 = var0.spriteId; // L: 12307
			}

			if (Client.playerAppearance.field3540 == 1) { // L: 12309
				var0.spriteId2 = Client.field790;
			} else {
				var0.spriteId2 = Client.field791; // L: 12310
			}

		} else if (var1 == 325) { // L: 12313
			if (Client.field790 == -1) { // L: 12314
				Client.field790 = var0.spriteId2; // L: 12315
				Client.field791 = var0.spriteId; // L: 12316
			}

			if (Client.playerAppearance.field3540 == 1) { // L: 12318
				var0.spriteId2 = Client.field791;
			} else {
				var0.spriteId2 = Client.field790; // L: 12319
			}

		} else if (var1 == 327) { // L: 12322
			var0.modelAngleX = 150; // L: 12323
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12324
			var0.modelType = 5; // L: 12325
			var0.modelId = 0; // L: 12326
		} else if (var1 == 328) { // L: 12329
			var0.modelAngleX = 150; // L: 12330
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12331
			var0.modelType = 5; // L: 12332
			var0.modelId = 1; // L: 12333
		}
	} // L: 12311 12320 12327 12334 12336

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1961721798"
	)
	static final void method664() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 12340
		Client.packetWriter.addNode(var0); // L: 12341
		Interpreter.field875 = true; // L: 12342

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12343
			if (var1.type == 0 || var1.type == 3) { // L: 12344
				SoundCache.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12346
			Messages.invalidateWidget(Client.meslayerContinueWidget); // L: 12347
			Client.meslayerContinueWidget = null; // L: 12348
		}

		Interpreter.field875 = false; // L: 12350
	} // L: 12351
}
