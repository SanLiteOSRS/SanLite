import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class129 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	static ClanSettings field1535;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -312799529
	)
	int field1536;
	@ObfuscatedName("o")
	boolean field1534;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class129(class131 var1) {
		this.this$0 = var1;
		this.field1536 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		this.field1536 = var1.readUnsignedShort();
		this.field1534 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2925(this.field1536, this.field1534);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "76298290"
	)
	static String method2849(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class429.field4593 != null) {
			var3 = "/p=" + class429.field4593;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + FriendSystem.clientLanguage + "/a=" + class7.field27 + var3 + "/";
	}
}
