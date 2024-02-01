import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class47 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	VorbisSample field336;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	RawSound field337;
	@ObfuscatedName("af")
	ReentrantLock field334;

	@ObfuscatedSignature(
		descriptor = "(Lci;Lbm;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field336 = var1; // L: 11
		this.field337 = var2; // L: 12
		this.field334 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	static void method913() {
		if (Login.clearLoginScreen) { // L: 253
			Login.titleboxSprite = null; // L: 254
			class182.field1904 = null; // L: 255
			Login.field906 = null; // L: 256
			Buddy.leftTitleSprite = null; // L: 257
			SecureRandomCallable.rightTitleSprite = null; // L: 258
			GrandExchangeEvents.logoSprite = null; // L: 259
			Clock.title_muteSprite = null; // L: 260
			class182.field1908 = null; // L: 261
			class402.field4500 = null; // L: 262
			class167.worldSelectBackSprites = null; // L: 263
			class131.worldSelectFlagSprites = null; // L: 264
			Client.worldSelectArrows = null; // L: 265
			class326.worldSelectStars = null; // L: 266
			class155.field1725 = null; // L: 267
			SpriteMask.loginScreenRunesAnimation.method2509(); // L: 268
			Actor.method2488(0, 100); // L: 269
			class220.method4348().method7126(true); // L: 270
			Login.clearLoginScreen = false; // L: 271
		}
	} // L: 272

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnn;S)Ljava/lang/String;",
		garbageValue = "3107"
	)
	static String method912(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10942
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10943
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10945
					if (var3 == -1) { // L: 10946
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10947
					int var6 = SecureRandomCallable.method2318(var1, var2 - 1); // L: 10949
					String var5;
					if (var6 < 999999999) { // L: 10951
						var5 = Integer.toString(var6); // L: 10952
					} else {
						var5 = "*"; // L: 10955
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10957
				}
			}
		}

		return var0; // L: 10961
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1508392285"
	)
	static final void method910() {
		PacketBufferNode var0 = class482.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher); // L: 12255
		Client.packetWriter.addNode(var0); // L: 12256
		Interpreter.field858 = true; // L: 12257

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12258
			if (var1.type == 0 || var1.type == 3) { // L: 12259
				class363.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12261
			FaceNormal.invalidateWidget(Client.meslayerContinueWidget); // L: 12262
			Client.meslayerContinueWidget = null; // L: 12263
		}

		Interpreter.field858 = false; // L: 12265
	} // L: 12266

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1681464996"
	)
	static void method911(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12540
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12541
				var1.remove(); // L: 12542
			}
		}

	} // L: 12545
}
