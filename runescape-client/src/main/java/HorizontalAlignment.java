import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2018(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2016(1, 2);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 649902559
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 92174543
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llb;I)V",
		garbageValue = "819955380"
	)
	public static void method3678(class311 var0) {
		class305.field3407.remove(var0); // L: 29
	} // L: 30

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2133819886"
	)
	public static String method3677(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 114 115
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "36"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "2"
	)
	static String method3682(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12706
		if (Client.gameBuild == 1) { // L: 12707
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12708
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12709
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12710
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12711
			var0 = "local";
		}

		String var3 = ""; // L: 12712
		if (MusicPatchPcmStream.field3478 != null) { // L: 12713
			var3 = "/p=" + MusicPatchPcmStream.field3478;
		}

		String var4 = "runescape.com"; // L: 12714
		return var2 + var0 + "." + var4 + "/l=" + ClanChannelMember.clientLanguage + "/a=" + WorldMapSectionType.field2996 + var3 + "/"; // L: 12715
	}
}
