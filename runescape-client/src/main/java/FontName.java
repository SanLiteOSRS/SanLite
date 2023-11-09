import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("f")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpt;",
		garbageValue = "1254065539"
	)
	public static FontName[] method8203() {
		return new FontName[]{FontName_plain12, FontName_verdana11, FontName_bold12, FontName_verdana15, FontName_verdana13, FontName_plain11}; // L: 16
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050351066"
	)
	static void method8199() {
		if (Login.clearLoginScreen) { // L: 327
			ModelData0.titleboxSprite = null; // L: 328
			Frames.field2611 = null; // L: 329
			Login.field918 = null; // L: 330
			SecureRandomCallable.leftTitleSprite = null; // L: 331
			class9.rightTitleSprite = null; // L: 332
			Login.logoSprite = null; // L: 333
			class109.title_muteSprite = null; // L: 334
			WorldMapLabel.field2975 = null; // L: 335
			class89.field1154 = null; // L: 336
			GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites = null; // L: 337
			class87.worldSelectFlagSprites = null; // L: 338
			GroundObject.worldSelectArrows = null; // L: 339
			class280.worldSelectStars = null; // L: 340
			class98.field1340 = null; // L: 341
			class154.loginScreenRunesAnimation.method2381(); // L: 342
			class384.method7370(2); // L: 343
			if (NetCache.NetCache_socket != null) { // L: 345
				try {
					Buffer var0 = new Buffer(4); // L: 347
					var0.writeByte(2); // L: 348
					var0.writeMedium(0); // L: 349
					NetCache.NetCache_socket.write(var0.array, 0, 4); // L: 350
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close(); // L: 354
					} catch (Exception var2) { // L: 356
					}

					++NetCache.NetCache_ioExceptions; // L: 357
					NetCache.NetCache_socket = null; // L: 358
				}
			}

			Login.clearLoginScreen = false; // L: 361
		}
	} // L: 362

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1513435469"
	)
	static final void method8202(boolean var0) {
		Client.playPcmPlayers(); // L: 5697
		++Client.packetWriter.pendingWrites; // L: 5698
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5699
			Client.packetWriter.pendingWrites = 0; // L: 5700
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5701
				PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 5703
				Client.packetWriter.addNode(var1); // L: 5704

				try {
					Client.packetWriter.flush(); // L: 5706
				} catch (IOException var3) { // L: 5708
					Client.hadNetworkError = true; // L: 5709
				}
			}

		}
	} // L: 5712

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1334048221"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10874

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10875
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10876
		}

		if (var1.length() > 9) { // L: 10878
			return " " + MouseRecorder.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + MouseRecorder.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + MouseRecorder.colorStartTag(16776960) + var1 + "</col>"; // L: 10879 10880
		}
	}
}
